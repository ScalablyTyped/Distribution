package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointDescription extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) associated with the access point.
    */
  var AccessPointArn: js.UndefOr[typings.awsSdk.efsMod.AccessPointArn] = js.native
  /**
    * The ID of the access point, assigned by Amazon EFS.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.native
  /**
    * The opaque string specified in the request to ensure idempotent creation.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.efsMod.ClientToken] = js.native
  /**
    * The ID of the EFS file system that the access point applies to.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * Identifies the lifecycle phase of the access point.
    */
  var LifeCycleState: js.UndefOr[typings.awsSdk.efsMod.LifeCycleState] = js.native
  /**
    * The name of the access point. This is the value of the Name tag.
    */
  var Name: js.UndefOr[typings.awsSdk.efsMod.Name] = js.native
  /**
    * Identified the AWS account that owns the access point resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is used for all file operations by NFS clients using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.native
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.native
  /**
    * The tags associated with the access point, presented as an array of Tag objects.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.native
}

object AccessPointDescription {
  @scala.inline
  def apply(
    AccessPointArn: AccessPointArn = null,
    AccessPointId: AccessPointId = null,
    ClientToken: ClientToken = null,
    FileSystemId: FileSystemId = null,
    LifeCycleState: LifeCycleState = null,
    Name: Name = null,
    OwnerId: AwsAccountId = null,
    PosixUser: PosixUser = null,
    RootDirectory: RootDirectory = null,
    Tags: Tags = null
  ): AccessPointDescription = {
    val __obj = js.Dynamic.literal()
    if (AccessPointArn != null) __obj.updateDynamic("AccessPointArn")(AccessPointArn.asInstanceOf[js.Any])
    if (AccessPointId != null) __obj.updateDynamic("AccessPointId")(AccessPointId.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (LifeCycleState != null) __obj.updateDynamic("LifeCycleState")(LifeCycleState.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PosixUser != null) __obj.updateDynamic("PosixUser")(PosixUser.asInstanceOf[js.Any])
    if (RootDirectory != null) __obj.updateDynamic("RootDirectory")(RootDirectory.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointDescription]
  }
}

