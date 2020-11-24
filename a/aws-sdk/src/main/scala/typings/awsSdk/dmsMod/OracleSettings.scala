package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OracleSettings extends js.Object {
  
  /**
    * Set this attribute to false in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path prefix replacement using direct file access.
    */
  var AccessAlternateDirectly: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables PRIMARY KEY supplemental logging on all tables selected for a migration task. If you use this option, you still need to enable database-level supplemental logging.
    */
  var AddSupplementalLogging: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Set this attribute with archivedLogDestId in a primary/ standby setup. This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to read changes. This need arises because the previous primary instance is now a standby instance after switchover.
    */
  var AdditionalArchivedLogDestId: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Set this attribute to true to enable replication of Oracle tables containing columns that are nested tables or defined types.
    */
  var AllowSelectNestedTables: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are accessed from the outset.
    */
  var ArchivedLogDestId: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * When this field is set to Y, AWS DMS only accesses the archived redo logs. If the archived redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
    */
  var ArchivedLogsOnly: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value from the  asm_user_password  value. You set this value as part of the comma-separated value that you set to the Password request parameter when you create the endpoint to access transaction logs using Binary Reader. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmPassword: js.UndefOr[SecretString] = js.native
  
  /**
    * For an Oracle source endpoint, your ASM server address. You can set this value from the asm_server value. You set asm_server as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmServer: js.UndefOr[String] = js.native
  
  /**
    * For an Oracle source endpoint, your ASM user name. You can set this value from the asm_user value. You set asm_user as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmUser: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character column length is in characters, set this attribute to CHAR. Otherwise, the character column length is in bytes. Example: charLengthSemantics=CHAR; 
    */
  var CharLengthSemantics: js.UndefOr[typings.awsSdk.dmsMod.CharLengthSemantics] = js.native
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * When set to true, this attribute helps to increase the commit rate on the Oracle target database by writing directly to tables and not writing a trail to database logs.
    */
  var DirectPathNoLog: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * When set to true, this attribute specifies a parallel load when useDirectPathFullLoad is set to Y. This attribute also only applies when you use the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
    */
  var DirectPathParallelLoad: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the same tablespace on the target.
    */
  var EnableHomogenousTablespace: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * When set to true, this attribute causes a task to fail if the actual size of an LOB column is greater than the specified LobMaxSize. If a task is set to limited LOB mode and this option is set to true, the task fails instead of truncating the LOB data.
    */
  var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type is converted to precision 38, scale 10. Example: numberDataTypeScale=12 
    */
  var NumberDatatypeScale: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
    */
  var OraclePathPrefix: js.UndefOr[String] = js.native
  
  /**
    * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default) and 8 (the maximum). Use this attribute together with the readAheadBlocks attribute.
    */
  var ParallelAsmReadThreads: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
    */
  var ReadAheadBlocks: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * When set to true, this attribute supports tablespace replication.
    */
  var ReadTableSpaceName: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the specified usePathPrefix setting to access the redo logs.
    */
  var ReplacePathPrefix: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the number of seconds that the system waits before resending a query. Example: retryInterval=6; 
    */
  var RetryInterval: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary Reader. It is also the  TDE_Password  part of the comma-separated value you set to the Password request parameter when you create the endpoint. The SecurityDbEncryptian setting is related to this SecurityDbEncryptionName setting. For more information, see  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var SecurityDbEncryption: js.UndefOr[SecretString] = js.native
  
  /**
    * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the SecurityDbEncryption setting. For more information on setting the key name value of SecurityDbEncryptionName, see the information and example for setting the securityDbEncryptionName extra connection attribute in  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide.
    */
  var SecurityDbEncryptionName: js.UndefOr[String] = js.native
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all online redo logs.
    */
  var UseAlternateFolderForOnline: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root to access the redo logs.
    */
  var UsePathPrefix: js.UndefOr[String] = js.native
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}
object OracleSettings {
  
  @scala.inline
  def apply(): OracleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OracleSettings]
  }
  
  @scala.inline
  implicit class OracleSettingsOps[Self <: OracleSettings] (val x: Self) extends AnyVal {
    
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
    def setAccessAlternateDirectly(value: BooleanOptional): Self = this.set("AccessAlternateDirectly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessAlternateDirectly: Self = this.set("AccessAlternateDirectly", js.undefined)
    
    @scala.inline
    def setAddSupplementalLogging(value: BooleanOptional): Self = this.set("AddSupplementalLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSupplementalLogging: Self = this.set("AddSupplementalLogging", js.undefined)
    
    @scala.inline
    def setAdditionalArchivedLogDestId(value: IntegerOptional): Self = this.set("AdditionalArchivedLogDestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalArchivedLogDestId: Self = this.set("AdditionalArchivedLogDestId", js.undefined)
    
    @scala.inline
    def setAllowSelectNestedTables(value: BooleanOptional): Self = this.set("AllowSelectNestedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSelectNestedTables: Self = this.set("AllowSelectNestedTables", js.undefined)
    
    @scala.inline
    def setArchivedLogDestId(value: IntegerOptional): Self = this.set("ArchivedLogDestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivedLogDestId: Self = this.set("ArchivedLogDestId", js.undefined)
    
    @scala.inline
    def setArchivedLogsOnly(value: BooleanOptional): Self = this.set("ArchivedLogsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivedLogsOnly: Self = this.set("ArchivedLogsOnly", js.undefined)
    
    @scala.inline
    def setAsmPassword(value: SecretString): Self = this.set("AsmPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsmPassword: Self = this.set("AsmPassword", js.undefined)
    
    @scala.inline
    def setAsmServer(value: String): Self = this.set("AsmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsmServer: Self = this.set("AsmServer", js.undefined)
    
    @scala.inline
    def setAsmUser(value: String): Self = this.set("AsmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsmUser: Self = this.set("AsmUser", js.undefined)
    
    @scala.inline
    def setCharLengthSemantics(value: CharLengthSemantics): Self = this.set("CharLengthSemantics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharLengthSemantics: Self = this.set("CharLengthSemantics", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDirectPathNoLog(value: BooleanOptional): Self = this.set("DirectPathNoLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectPathNoLog: Self = this.set("DirectPathNoLog", js.undefined)
    
    @scala.inline
    def setDirectPathParallelLoad(value: BooleanOptional): Self = this.set("DirectPathParallelLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectPathParallelLoad: Self = this.set("DirectPathParallelLoad", js.undefined)
    
    @scala.inline
    def setEnableHomogenousTablespace(value: BooleanOptional): Self = this.set("EnableHomogenousTablespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHomogenousTablespace: Self = this.set("EnableHomogenousTablespace", js.undefined)
    
    @scala.inline
    def setFailTasksOnLobTruncation(value: BooleanOptional): Self = this.set("FailTasksOnLobTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailTasksOnLobTruncation: Self = this.set("FailTasksOnLobTruncation", js.undefined)
    
    @scala.inline
    def setNumberDatatypeScale(value: IntegerOptional): Self = this.set("NumberDatatypeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberDatatypeScale: Self = this.set("NumberDatatypeScale", js.undefined)
    
    @scala.inline
    def setOraclePathPrefix(value: String): Self = this.set("OraclePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOraclePathPrefix: Self = this.set("OraclePathPrefix", js.undefined)
    
    @scala.inline
    def setParallelAsmReadThreads(value: IntegerOptional): Self = this.set("ParallelAsmReadThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelAsmReadThreads: Self = this.set("ParallelAsmReadThreads", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setReadAheadBlocks(value: IntegerOptional): Self = this.set("ReadAheadBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadAheadBlocks: Self = this.set("ReadAheadBlocks", js.undefined)
    
    @scala.inline
    def setReadTableSpaceName(value: BooleanOptional): Self = this.set("ReadTableSpaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTableSpaceName: Self = this.set("ReadTableSpaceName", js.undefined)
    
    @scala.inline
    def setReplacePathPrefix(value: BooleanOptional): Self = this.set("ReplacePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacePathPrefix: Self = this.set("ReplacePathPrefix", js.undefined)
    
    @scala.inline
    def setRetryInterval(value: IntegerOptional): Self = this.set("RetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryInterval: Self = this.set("RetryInterval", js.undefined)
    
    @scala.inline
    def setSecurityDbEncryption(value: SecretString): Self = this.set("SecurityDbEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityDbEncryption: Self = this.set("SecurityDbEncryption", js.undefined)
    
    @scala.inline
    def setSecurityDbEncryptionName(value: String): Self = this.set("SecurityDbEncryptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityDbEncryptionName: Self = this.set("SecurityDbEncryptionName", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setUseAlternateFolderForOnline(value: BooleanOptional): Self = this.set("UseAlternateFolderForOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAlternateFolderForOnline: Self = this.set("UseAlternateFolderForOnline", js.undefined)
    
    @scala.inline
    def setUsePathPrefix(value: String): Self = this.set("UsePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePathPrefix: Self = this.set("UsePathPrefix", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
