package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostgreSQLSettings extends js.Object {
  
  /**
    * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user triggers to reduce the time it takes to bulk load data. Example: afterConnectScript=SET session_replication_role='replica' 
    */
  var AfterConnectScript: js.UndefOr[String] = js.native
  
  /**
    * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can later remove these artifacts. If this value is set to N, you don't have to create tables or triggers on the source database.
    */
  var CaptureDdls: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The schema in which the operational DDL database artifacts are created. Example: ddlArtifactsSchema=xyzddlschema; 
    */
  var DdlArtifactsSchema: js.UndefOr[String] = js.native
  
  /**
    * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds. Example: executeTimeout=100; 
    */
  var ExecuteTimeout: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * When set to true, this value causes a task to fail if the actual size of a LOB column is greater than the specified LobMaxSize. If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB data.
    */
  var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL. Example: maxFileSize=512 
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.native
  
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
    * Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source instance. When used with the AWS DMS API CdcStartPosition request parameter, this attribute also enables using native CDC start points.
    */
  var SlotName: js.UndefOr[String] = js.native
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}
object PostgreSQLSettings {
  
  @scala.inline
  def apply(): PostgreSQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostgreSQLSettings]
  }
  
  @scala.inline
  implicit class PostgreSQLSettingsOps[Self <: PostgreSQLSettings] (val x: Self) extends AnyVal {
    
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
    def setCaptureDdls(value: BooleanOptional): Self = this.set("CaptureDdls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureDdls: Self = this.set("CaptureDdls", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDdlArtifactsSchema(value: String): Self = this.set("DdlArtifactsSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlArtifactsSchema: Self = this.set("DdlArtifactsSchema", js.undefined)
    
    @scala.inline
    def setExecuteTimeout(value: IntegerOptional): Self = this.set("ExecuteTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecuteTimeout: Self = this.set("ExecuteTimeout", js.undefined)
    
    @scala.inline
    def setFailTasksOnLobTruncation(value: BooleanOptional): Self = this.set("FailTasksOnLobTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailTasksOnLobTruncation: Self = this.set("FailTasksOnLobTruncation", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = this.set("MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("MaxFileSize", js.undefined)
    
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
    def setSlotName(value: String): Self = this.set("SlotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotName: Self = this.set("SlotName", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
