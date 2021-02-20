package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends StObject {
  
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
  implicit class BackupMutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    @scala.inline
    def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineModel(value: String): Self = StObject.set(x, "EngineModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineModelUndefined: Self = StObject.set(x, "EngineModel", js.undefined)
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setInstanceProfileArn(value: String): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileArnUndefined: Self = StObject.set(x, "InstanceProfileArn", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKeyPair(value: String): Self = StObject.set(x, "KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "KeyPair", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setS3DataSize(value: Integer): Self = StObject.set(x, "S3DataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataSizeUndefined: Self = StObject.set(x, "S3DataSize", js.undefined)
    
    @scala.inline
    def setS3DataUrl(value: String): Self = StObject.set(x, "S3DataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataUrlUndefined: Self = StObject.set(x, "S3DataUrl", js.undefined)
    
    @scala.inline
    def setS3LogUrl(value: String): Self = StObject.set(x, "S3LogUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LogUrlUndefined: Self = StObject.set(x, "S3LogUrl", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: BackupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDescription(value: String): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDescriptionUndefined: Self = StObject.set(x, "StatusDescription", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Strings): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setToolsVersion(value: String): Self = StObject.set(x, "ToolsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsVersionUndefined: Self = StObject.set(x, "ToolsVersion", js.undefined)
    
    @scala.inline
    def setUserArn(value: String): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
