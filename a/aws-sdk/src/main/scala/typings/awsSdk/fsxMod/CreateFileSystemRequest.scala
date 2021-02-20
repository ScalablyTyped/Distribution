package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFileSystemRequest extends StObject {
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  
  /**
    * The type of Amazon FSx file system to create, either WINDOWS or LUSTRE.
    */
  var FileSystemType: typings.awsSdk.fsxMod.FileSystemType = js.native
  
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.native
  
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.native
  
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for file system access. This list isn't returned in later requests to describe the file system.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.fsxMod.SecurityGroupIds] = js.native
  
  /**
    * Sets the storage capacity of the file system that you're creating. For Lustre file systems:   For SCRATCH_2 and PERSISTENT_1 SSD deployment types, valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.   For PERSISTENT HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.   For SCRATCH_1 deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600 GiB.   For Windows file systems:   If StorageType=SSD, valid values are 32 GiB - 65,536 GiB (64 TiB).   If StorageType=HDD, valid values are 2000 GiB - 65,536 GiB (64 TiB).  
    */
  var StorageCapacity: typings.awsSdk.fsxMod.StorageCapacity = js.native
  
  /**
    * Sets the storage type for the file system you're creating. Valid values are SSD and HDD.   Set to SSD to use solid state drive storage. SSD is supported on all Windows and Lustre deployment types.   Set to HDD to use hard disk drive storage. HDD is supported on SINGLE_AZ_2 and MULTI_AZ_1 Windows file system deployment types, and on PERSISTENT Lustre file system deployment types.     Default value is SSD. For more information, see  Storage Type Options in the Amazon FSx for Windows User Guide and Multiple Storage Options in the Amazon FSx for Lustre User Guide. 
    */
  var StorageType: js.UndefOr[typings.awsSdk.fsxMod.StorageType] = js.native
  
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows MULTI_AZ_1 file system deployment types, provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID property. For Windows SINGLE_AZ_1 and SINGLE_AZ_2 file system deployment types and Lustre file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsSdk.fsxMod.SubnetIds = js.native
  
  /**
    * The tags to apply to the file system being created. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
  
  /**
    * The Microsoft Windows configuration for the file system being created. 
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}
object CreateFileSystemRequest {
  
  @scala.inline
  def apply(FileSystemType: FileSystemType, StorageCapacity: StorageCapacity, SubnetIds: SubnetIds): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemType = FileSystemType.asInstanceOf[js.Any], StorageCapacity = StorageCapacity.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
  
  @scala.inline
  implicit class CreateFileSystemRequestMutableBuilder[Self <: CreateFileSystemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setFileSystemType(value: FileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
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
    def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
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
