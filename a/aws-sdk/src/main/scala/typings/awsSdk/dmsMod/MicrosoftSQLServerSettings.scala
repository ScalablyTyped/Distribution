package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrosoftSQLServerSettings extends js.Object {
  
  /**
    * The maximum size of the packets (in bytes) used to transfer data using BCP.
    */
  var BcpPacketSize: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal AWS DMS control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the specified filegroup.
    */
  var ControlTablesFileGroup: js.UndefOr[String] = js.native
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * When this attribute is set to Y, AWS DMS only reads changes from transaction log backups and doesn't read from the active transaction log file during ongoing replication. Setting this parameter to Y enables you to control active transaction log file growth during full load and ongoing replication tasks. However, it can add some source latency to ongoing replication.
    */
  var ReadBackupOnly: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using one of the following two methods.  Start transactions in the database: This is the default method. When this method is used, AWS DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your database, then you must choose this method.  Exclusively use sp_repldone within a single task: When this method is used, AWS DMS reads the changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel AWS DMS tasks against the same database, use the default method.
    */
  var SafeguardPolicy: js.UndefOr[typings.awsSdk.dmsMod.SafeguardPolicy] = js.native
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an identity column that does not exist in the source table, you must disable the use BCP for loading table option.
    */
  var UseBcpFullLoad: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.native
}
object MicrosoftSQLServerSettings {
  
  @scala.inline
  def apply(): MicrosoftSQLServerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftSQLServerSettings]
  }
  
  @scala.inline
  implicit class MicrosoftSQLServerSettingsOps[Self <: MicrosoftSQLServerSettings] (val x: Self) extends AnyVal {
    
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
    def setBcpPacketSize(value: IntegerOptional): Self = this.set("BcpPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBcpPacketSize: Self = this.set("BcpPacketSize", js.undefined)
    
    @scala.inline
    def setControlTablesFileGroup(value: String): Self = this.set("ControlTablesFileGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlTablesFileGroup: Self = this.set("ControlTablesFileGroup", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setReadBackupOnly(value: BooleanOptional): Self = this.set("ReadBackupOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadBackupOnly: Self = this.set("ReadBackupOnly", js.undefined)
    
    @scala.inline
    def setSafeguardPolicy(value: SafeguardPolicy): Self = this.set("SafeguardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeguardPolicy: Self = this.set("SafeguardPolicy", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setUseBcpFullLoad(value: BooleanOptional): Self = this.set("UseBcpFullLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBcpFullLoad: Self = this.set("UseBcpFullLoad", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
