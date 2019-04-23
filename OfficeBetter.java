class OfficeBetter{
	public static void main(String[] args){
		try{
			//动态加载类，在运行时刻加载
			Class c = Class.forName(args[0]);
			//通过类类型，创建该类对象
			OfficeIntf off = (OfficeIntf)c.newInstance();
			off.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}