package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MySQLSettings extends StObject {
  
  /**
    * Specifies a script to run immediately after AWS DMS connects to the endpoint. The migration task continues running regardless if the SQL statement succeeds or fails.
    */
  var AfterConnectScript: js.UndefOr[String] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how often to check the binary log for new changes/events when the database is idle. Example: eventsPollInterval=5;  In the example, AWS DMS checks for changes in the binary logs every five seconds.
    */
  var EventsPollInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database. Example: maxFileSize=512 
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Improves performance when loading data into the MySQLcompatible target database. Specifies how many threads to use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an adverse effect on database performance, because a separate connection is required for each thread. Example: parallelLoadThreads=1 
    */
  var ParallelLoadThreads: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time zone for the source MySQL database. Example: serverTimezone=US/Pacific;  Note: Do not enclose time zones in single quotes.
    */
  var ServerTimezone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies where to migrate source tables on the target, either to a single database or multiple databases. Example: targetDbType=MULTIPLE_DATABASES 
    */
  var TargetDbType: js.UndefOr[typings.awsSdk.dmsMod.TargetDbType] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object MySQLSettings {
  
  @scala.inline
  def apply(): MySQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySQLSettings]
  }
  
  @scala.inline
  implicit class MySQLSettingsMutableBuilder[Self <: MySQLSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterConnectScript(value: String): Self = StObject.set(x, "AfterConnectScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterConnectScriptUndefined: Self = StObject.set(x, "AfterConnectScript", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setEventsPollInterval(value: IntegerOptional): Self = StObject.set(x, "EventsPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsPollIntervalUndefined: Self = StObject.set(x, "EventsPollInterval", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    @scala.inline
    def setParallelLoadThreads(value: IntegerOptional): Self = StObject.set(x, "ParallelLoadThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelLoadThreadsUndefined: Self = StObject.set(x, "ParallelLoadThreads", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setServerTimezone(value: String): Self = StObject.set(x, "ServerTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTimezoneUndefined: Self = StObject.set(x, "ServerTimezone", js.undefined)
    
    @scala.inline
    def setTargetDbType(value: TargetDbType): Self = StObject.set(x, "TargetDbType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDbTypeUndefined: Self = StObject.set(x, "TargetDbType", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
