package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends js.Object {
  
  /**
    * The ARN of the backup. 
    */
  var BackupArn: js.UndefOr[String] = js.native
  
  /**
    *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
    */
  var BackupId: js.UndefOr[typings.awsSdk.opsworkscmMod.BackupId] = js.native
  
  /**
    *  The backup type. Valid values are automated or manual. 
    */
  var BackupType: js.UndefOr[typings.awsSdk.opsworkscmMod.BackupType] = js.native
  
  /**
    *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    *  A user-provided description for a manual backup. This field is empty for automated backups. 
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    *  The engine type that is obtained from the server when the backup is created. 
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    *  The engine model that is obtained from the server when the backup is created. 
    */
  var EngineModel: js.UndefOr[String] = js.native
  
  /**
    *  The engine version that is obtained from the server when the backup is created. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    *  The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup. 
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  
  /**
    *  The instance type that is obtained from the server when the backup is created. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    *  The key pair that is obtained from the server when the backup is created. 
    */
  var KeyPair: js.UndefOr[String] = js.native
  
  /**
    *  The preferred backup period that is obtained from the server when the backup is created. 
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    *  The preferred maintenance period that is obtained from the server when the backup is created. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataSize: js.UndefOr[Integer] = js.native
  
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataUrl: js.UndefOr[String] = js.native
  
  /**
    *  The Amazon S3 URL of the backup's log file. 
    */
  var S3LogUrl: js.UndefOr[String] = js.native
  
  /**
    *  The security group IDs that are obtained from the server when the backup is created. 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  
  /**
    *  The name of the server from which the backup was made. 
    */
  var ServerName: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerName] = js.native
  
  /**
    *  The service role ARN that is obtained from the server when the backup is created. 
    */
  var ServiceRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The status of a backup while in progress. 
    */
  var Status: js.UndefOr[BackupStatus] = js.native
  
  /**
    *  An informational message about backup status. 
    */
  var StatusDescription: js.UndefOr[String] = js.native
  
  /**
    *  The subnet IDs that are obtained from the server when the backup is created. 
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  
  /**
    *  The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created. 
    */
  var ToolsVersion: js.UndefOr[String] = js.native
  
  /**
    *  The IAM user ARN of the requester for manual backups. This field is empty for automated backups. 
    */
  var UserArn: js.UndefOr[String] = js.native
}
object Backup {
  
  @scala.inline
  def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
    
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
    def setBackupArn(value: String): Self = this.set("BackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupArn: Self = this.set("BackupArn", js.undefined)
    
    @scala.inline
    def setBackupId(value: BackupId): Self = this.set("BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupId: Self = this.set("BackupId", js.undefined)
    
    @scala.inline
    def setBackupType(value: BackupType): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupType: Self = this.set("BackupType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineModel(value: String): Self = this.set("EngineModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineModel: Self = this.set("EngineModel", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setInstanceProfileArn(value: String): Self = this.set("InstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileArn: Self = this.set("InstanceProfileArn", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKeyPair(value: String): Self = this.set("KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("KeyPair", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setS3DataSize(value: Integer): Self = this.set("S3DataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DataSize: Self = this.set("S3DataSize", js.undefined)
    
    @scala.inline
    def setS3DataUrl(value: String): Self = this.set("S3DataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DataUrl: Self = this.set("S3DataUrl", js.undefined)
    
    @scala.inline
    def setS3LogUrl(value: String): Self = this.set("S3LogUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3LogUrl: Self = this.set("S3LogUrl", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: BackupStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDescription(value: String): Self = this.set("StatusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDescription: Self = this.set("StatusDescription", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Strings): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setToolsVersion(value: String): Self = this.set("ToolsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolsVersion: Self = this.set("ToolsVersion", js.undefined)
    
    @scala.inline
    def setUserArn(value: String): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
}
