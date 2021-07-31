package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemFromBackupRequest extends StObject {
  
  var BackupId: typings.awsSdk.fsxMod.BackupId
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined
  
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later DescribeFileSystem requests.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.fsxMod.SecurityGroupIds] = js.undefined
  
  /**
    * Sets the storage type for the Windows file system you're creating from a backup. Valid values are SSD and HDD.   Set to SSD to use solid state drive storage. Supported on all Windows deployment types.   Set to HDD to use hard disk drive storage. Supported on SINGLE_AZ_2 and MULTI_AZ_1 Windows file system deployment types.     Default value is SSD.   HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at least 2000 GiB.  
    */
  var StorageType: js.UndefOr[typings.awsSdk.fsxMod.StorageType] = js.undefined
  
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows MULTI_AZ_1 file system deployment types, provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID property. For Windows SINGLE_AZ_1 and SINGLE_AZ_2 deployment types and Lustre file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsSdk.fsxMod.SubnetIds
  
  /**
    * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
  
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
}
object CreateFileSystemFromBackupRequest {
  
  @scala.inline
  def apply(BackupId: BackupId, SubnetIds: SubnetIds): CreateFileSystemFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
  }
  
  @scala.inline
  implicit class CreateFileSystemFromBackupRequestMutableBuilder[Self <: CreateFileSystemFromBackupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setLustreConfiguration(value: CreateFileSystemLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setWindowsConfiguration(value: CreateFileSystemWindowsConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
