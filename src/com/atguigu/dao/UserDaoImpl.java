package com.atguigu.dao;

import org.apache.log4j.Logger;

/**
 * 
 * #常见的Appender,前三个常用
 * org.apache.log4j.ConsoleAppender(控制台)
 * org.apache.log4j.FileAppender(文件)
 * org.apache.log4j.DailyRollingFileAppender(每天产生一个日志文件)
 * 
 * org.apache.log4j.RollingFileAppender(文件大小到达指定尺寸的时候产生一个新的日志文件)
 * org.apache.log4j.WriterAppender(将日志信息以流格式发送到任意指定的地方)
 * org.apache.log4j.JDBCAppender(把日志用JDBC记录到数据库中)
 * 
 * 
 * 
 * 常用的PatternLayout介绍
 * %m 输出代码中指定的消息
 * %p 输出优先级，即DEBUG,INFO,WARN,ERROR,FATAL
 * %r 输出自应用启动到输出该log信息耗费的毫秒数
 * %c 输出所属的类目，通常是所在类的全名
 * %t 输出生产该日志事件的线程名
 * %n 输出一个回车换行符，Windows平台为“\r\n”,Unix平台为“/n”
 * %d 输出日志时间点的日期或时间，默认格式为ISO8601，也可以在其后指定格式
 * 		比如：%d{yyyy-MM-dd HH:mm:ss,SS},
 * 输出类似： 2015-12-20 18:35:51，768
 * %
 * 
 * @author Devin Yang
 *
 */

public class UserDaoImpl
{
	
	private static final Logger  logger = Logger.getLogger(UserDaoImpl.class);
	
	public static void main(String[] args)
	{
/*		logger.debug("***********debug");
		logger.info("***********info");
		logger.warn("***********warn");
		logger.error("***********error");*/
		
		
		try
		{
			int age = 10/0;
			logger.info("**********"+age);
		} catch (Exception e)
		{
			logger.error(e,e.getCause());
		}
	
	}
}
