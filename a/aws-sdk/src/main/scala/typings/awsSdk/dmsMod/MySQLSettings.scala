package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySQLSettings extends js.Object {
  
  /**
    * Specifies a script to run immediately after AWS DMS connects to the endpoint. The migration task continues running regardless if the SQL statement succeeds or fails.
    */
  var AfterConnectScript: js.UndefOr[String] = js.native
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * Specifies how often to check the binary log for new changes/events when the database is idle. Example: eventsPollInterval=5;  In the example, AWS DMS checks for changes in the binary logs every five seconds.
    */
  var EventsPollInterval: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database. Example: maxFileSize=512 
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Improves performance when loading data into the MySQLcompatible target database. Specifies how many threads to use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an adverse effect on database performance, because a separate connection is required for each thread. Example: parallelLoadThreads=1 
    */
  var ParallelLoadThreads: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the time zone for the source MySQL database. Example: serverTimezone=US/Pacific;  Note: Do not enclose time zones in single quotes.
    */
  var ServerTimezone: js.UndefOr[String] = js.native
  
  /**
    * Specifies where to migrate source tables on the target, either to a single database or multiple databases. Example: targetDbType=MULTIPLE_DATABASES 
    */
  var TargetDbType: js.UndefOr[typings.awsSdk.dmsMod.TargetDbType] = js.native
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}
object MySQLSettings {
  
  @scala.inline
  def apply(): MySQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySQLSettings]
  }
  
  @scala.inline
  implicit class MySQLSettingsOps[Self <: MySQLSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterConnectScript(value: String): Self = this.set("AfterConnectScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterConnectScript: Self = this.set("AfterConnectScript", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setEventsPollInterval(value: IntegerOptional): Self = this.set("EventsPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsPollInterval: Self = this.set("EventsPollInterval", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = this.set("MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("MaxFileSize", js.undefined)
    
    @scala.inline
    def setParallelLoadThreads(value: IntegerOptional): Self = this.set("ParallelLoadThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelLoadThreads: Self = this.set("ParallelLoadThreads", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setServerTimezone(value: String): Self = this.set("ServerTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerTimezone: Self = this.set("ServerTimezone", js.undefined)
    
    @scala.inline
    def setTargetDbType(value: TargetDbType): Self = this.set("TargetDbType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDbType: Self = this.set("TargetDbType", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
