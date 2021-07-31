package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OracleSettings extends StObject {
  
  /**
    * Set this attribute to false in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path prefix replacement using direct file access.
    */
  var AccessAlternateDirectly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables PRIMARY KEY supplemental logging on all tables selected for a migration task. If you use this option, you still need to enable database-level supplemental logging.
    */
  var AddSupplementalLogging: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute with archivedLogDestId in a primary/ standby setup. This attribute is useful in the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to read changes. This need arises because the previous primary instance is now a standby instance after switchover.
    */
  var AdditionalArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this attribute to true to enable replication of Oracle tables containing columns that are nested tables or defined types.
    */
  var AllowSelectNestedTables: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are accessed from the outset.
    */
  var ArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When this field is set to Y, AWS DMS only accesses the archived redo logs. If the archived redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
    */
  var ArchivedLogsOnly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value from the  asm_user_password  value. You set this value as part of the comma-separated value that you set to the Password request parameter when you create the endpoint to access transaction logs using Binary Reader. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmPassword: js.UndefOr[SecretString] = js.undefined
  
  /**
    * For an Oracle source endpoint, your ASM server address. You can set this value from the asm_server value. You set asm_server as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmServer: js.UndefOr[String] = js.undefined
  
  /**
    * For an Oracle source endpoint, your ASM user name. You can set this value from the asm_user value. You set asm_user as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmUser: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character column length is in characters, set this attribute to CHAR. Otherwise, the character column length is in bytes. Example: charLengthSemantics=CHAR; 
    */
  var CharLengthSemantics: js.UndefOr[typings.awsSdk.dmsMod.CharLengthSemantics] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, this attribute helps to increase the commit rate on the Oracle target database by writing directly to tables and not writing a trail to database logs.
    */
  var DirectPathNoLog: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When set to true, this attribute specifies a parallel load when useDirectPathFullLoad is set to Y. This attribute also only applies when you use the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
    */
  var DirectPathParallelLoad: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the same tablespace on the target.
    */
  var EnableHomogenousTablespace: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When set to true, this attribute causes a task to fail if the actual size of an LOB column is greater than the specified LobMaxSize. If a task is set to limited LOB mode and this option is set to true, the task fails instead of truncating the LOB data.
    */
  var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type is converted to precision 38, scale 10. Example: numberDataTypeScale=12 
    */
  var NumberDatatypeScale: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
    */
  var OraclePathPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default) and 8 (the maximum). Use this attribute together with the readAheadBlocks attribute.
    */
  var ParallelAsmReadThreads: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
    */
  var ReadAheadBlocks: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When set to true, this attribute supports tablespace replication.
    */
  var ReadTableSpaceName: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the specified usePathPrefix setting to access the redo logs.
    */
  var ReplacePathPrefix: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the number of seconds that the system waits before resending a query. Example: retryInterval=6; 
    */
  var RetryInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary Reader. It is also the  TDE_Password  part of the comma-separated value you set to the Password request parameter when you create the endpoint. The SecurityDbEncryptian setting is related to this SecurityDbEncryptionName setting. For more information, see  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var SecurityDbEncryption: js.UndefOr[SecretString] = js.undefined
  
  /**
    * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the SecurityDbEncryption setting. For more information on setting the key name value of SecurityDbEncryptionName, see the information and example for setting the securityDbEncryptionName extra connection attribute in  Supported encryption methods for using Oracle as a source for AWS DMS in the AWS Database Migration Service User Guide.
    */
  var SecurityDbEncryptionName: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all online redo logs.
    */
  var UseAlternateFolderForOnline: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root to access the redo logs.
    */
  var UsePathPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object OracleSettings {
  
  @scala.inline
  def apply(): OracleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OracleSettings]
  }
  
  @scala.inline
  implicit class OracleSettingsMutableBuilder[Self <: OracleSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessAlternateDirectly(value: BooleanOptional): Self = StObject.set(x, "AccessAlternateDirectly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessAlternateDirectlyUndefined: Self = StObject.set(x, "AccessAlternateDirectly", js.undefined)
    
    @scala.inline
    def setAddSupplementalLogging(value: BooleanOptional): Self = StObject.set(x, "AddSupplementalLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSupplementalLoggingUndefined: Self = StObject.set(x, "AddSupplementalLogging", js.undefined)
    
    @scala.inline
    def setAdditionalArchivedLogDestId(value: IntegerOptional): Self = StObject.set(x, "AdditionalArchivedLogDestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalArchivedLogDestIdUndefined: Self = StObject.set(x, "AdditionalArchivedLogDestId", js.undefined)
    
    @scala.inline
    def setAllowSelectNestedTables(value: BooleanOptional): Self = StObject.set(x, "AllowSelectNestedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSelectNestedTablesUndefined: Self = StObject.set(x, "AllowSelectNestedTables", js.undefined)
    
    @scala.inline
    def setArchivedLogDestId(value: IntegerOptional): Self = StObject.set(x, "ArchivedLogDestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedLogDestIdUndefined: Self = StObject.set(x, "ArchivedLogDestId", js.undefined)
    
    @scala.inline
    def setArchivedLogsOnly(value: BooleanOptional): Self = StObject.set(x, "ArchivedLogsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedLogsOnlyUndefined: Self = StObject.set(x, "ArchivedLogsOnly", js.undefined)
    
    @scala.inline
    def setAsmPassword(value: SecretString): Self = StObject.set(x, "AsmPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsmPasswordUndefined: Self = StObject.set(x, "AsmPassword", js.undefined)
    
    @scala.inline
    def setAsmServer(value: String): Self = StObject.set(x, "AsmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsmServerUndefined: Self = StObject.set(x, "AsmServer", js.undefined)
    
    @scala.inline
    def setAsmUser(value: String): Self = StObject.set(x, "AsmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsmUserUndefined: Self = StObject.set(x, "AsmUser", js.undefined)
    
    @scala.inline
    def setCharLengthSemantics(value: CharLengthSemantics): Self = StObject.set(x, "CharLengthSemantics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharLengthSemanticsUndefined: Self = StObject.set(x, "CharLengthSemantics", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDirectPathNoLog(value: BooleanOptional): Self = StObject.set(x, "DirectPathNoLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectPathNoLogUndefined: Self = StObject.set(x, "DirectPathNoLog", js.undefined)
    
    @scala.inline
    def setDirectPathParallelLoad(value: BooleanOptional): Self = StObject.set(x, "DirectPathParallelLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectPathParallelLoadUndefined: Self = StObject.set(x, "DirectPathParallelLoad", js.undefined)
    
    @scala.inline
    def setEnableHomogenousTablespace(value: BooleanOptional): Self = StObject.set(x, "EnableHomogenousTablespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHomogenousTablespaceUndefined: Self = StObject.set(x, "EnableHomogenousTablespace", js.undefined)
    
    @scala.inline
    def setFailTasksOnLobTruncation(value: BooleanOptional): Self = StObject.set(x, "FailTasksOnLobTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailTasksOnLobTruncationUndefined: Self = StObject.set(x, "FailTasksOnLobTruncation", js.undefined)
    
    @scala.inline
    def setNumberDatatypeScale(value: IntegerOptional): Self = StObject.set(x, "NumberDatatypeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDatatypeScaleUndefined: Self = StObject.set(x, "NumberDatatypeScale", js.undefined)
    
    @scala.inline
    def setOraclePathPrefix(value: String): Self = StObject.set(x, "OraclePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOraclePathPrefixUndefined: Self = StObject.set(x, "OraclePathPrefix", js.undefined)
    
    @scala.inline
    def setParallelAsmReadThreads(value: IntegerOptional): Self = StObject.set(x, "ParallelAsmReadThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelAsmReadThreadsUndefined: Self = StObject.set(x, "ParallelAsmReadThreads", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setReadAheadBlocks(value: IntegerOptional): Self = StObject.set(x, "ReadAheadBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAheadBlocksUndefined: Self = StObject.set(x, "ReadAheadBlocks", js.undefined)
    
    @scala.inline
    def setReadTableSpaceName(value: BooleanOptional): Self = StObject.set(x, "ReadTableSpaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTableSpaceNameUndefined: Self = StObject.set(x, "ReadTableSpaceName", js.undefined)
    
    @scala.inline
    def setReplacePathPrefix(value: BooleanOptional): Self = StObject.set(x, "ReplacePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacePathPrefixUndefined: Self = StObject.set(x, "ReplacePathPrefix", js.undefined)
    
    @scala.inline
    def setRetryInterval(value: IntegerOptional): Self = StObject.set(x, "RetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryIntervalUndefined: Self = StObject.set(x, "RetryInterval", js.undefined)
    
    @scala.inline
    def setSecurityDbEncryption(value: SecretString): Self = StObject.set(x, "SecurityDbEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDbEncryptionName(value: String): Self = StObject.set(x, "SecurityDbEncryptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDbEncryptionNameUndefined: Self = StObject.set(x, "SecurityDbEncryptionName", js.undefined)
    
    @scala.inline
    def setSecurityDbEncryptionUndefined: Self = StObject.set(x, "SecurityDbEncryption", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setUseAlternateFolderForOnline(value: BooleanOptional): Self = StObject.set(x, "UseAlternateFolderForOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAlternateFolderForOnlineUndefined: Self = StObject.set(x, "UseAlternateFolderForOnline", js.undefined)
    
    @scala.inline
    def setUsePathPrefix(value: String): Self = StObject.set(x, "UsePathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePathPrefixUndefined: Self = StObject.set(x, "UsePathPrefix", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
