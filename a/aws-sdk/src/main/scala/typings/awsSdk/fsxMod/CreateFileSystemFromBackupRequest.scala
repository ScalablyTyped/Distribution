package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemFromBackupRequest extends js.Object {
  var BackupId: typings.awsSdk.fsxMod.BackupId = js.native
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later DescribeFileSystem requests.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.fsxMod.SecurityGroupIds] = js.native
  /**
    * Sets the storage type for the Windows file system you're creating from a backup. Valid values are SSD and HDD.   Set to SSD to use solid state drive storage. Supported on all Windows deployment types.   Set to HDD to use hard disk drive storage. Supported on SINGLE_AZ_2 and MULTI_AZ_1 Windows file system deployment types.     Default value is SSD.   HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at least 2000 GiB.  
    */
  var StorageType: js.UndefOr[typings.awsSdk.fsxMod.StorageType] = js.native
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows MULTI_AZ_1 file system deployment types, provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID property. For Windows SINGLE_AZ_1 and SINGLE_AZ_2 deployment types and Lustre file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsSdk.fsxMod.SubnetIds = js.native
  /**
    * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}

object CreateFileSystemFromBackupRequest {
  @scala.inline
  def apply(
    BackupId: BackupId,
    SubnetIds: SubnetIds,
    ClientRequestToken: ClientRequestToken = null,
    SecurityGroupIds: SecurityGroupIds = null,
    StorageType: StorageType = null,
    Tags: Tags = null,
    WindowsConfiguration: CreateFileSystemWindowsConfiguration = null
  ): CreateFileSystemFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
  }
}

