package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationFsxWindowsRequest extends js.Object {
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  var FsxFilesystemArn: typings.awsSdk.datasyncMod.FsxFilesystemArn = js.native
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var Password: SmbPassword = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  /**
    * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
    */
  var Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.native
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: SmbUser = js.native
}

object CreateLocationFsxWindowsRequest {
  @scala.inline
  def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Password: SmbPassword,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    User: SmbUser,
    Domain: SmbDomain = null,
    Subdirectory: FsxWindowsSubdirectory = null,
    Tags: TagList = null
  ): CreateLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (Subdirectory != null) __obj.updateDynamic("Subdirectory")(Subdirectory.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
  }
}

