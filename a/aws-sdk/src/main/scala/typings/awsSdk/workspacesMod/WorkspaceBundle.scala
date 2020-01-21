package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceBundle extends js.Object {
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.native
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typings.awsSdk.workspacesMod.ComputeType] = js.native
  /**
    * A description.
    */
  var Description: js.UndefOr[typings.awsSdk.workspacesMod.Description] = js.native
  /**
    * The image identifier of the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typings.awsSdk.workspacesMod.RootStorage] = js.native
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[typings.awsSdk.workspacesMod.UserStorage] = js.native
}

object WorkspaceBundle {
  @scala.inline
  def apply(
    BundleId: BundleId = null,
    ComputeType: ComputeType = null,
    Description: Description = null,
    ImageId: WorkspaceImageId = null,
    LastUpdatedTime: Timestamp = null,
    Name: NonEmptyString = null,
    Owner: BundleOwner = null,
    RootStorage: RootStorage = null,
    UserStorage: UserStorage = null
  ): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (ComputeType != null) __obj.updateDynamic("ComputeType")(ComputeType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (RootStorage != null) __obj.updateDynamic("RootStorage")(RootStorage.asInstanceOf[js.Any])
    if (UserStorage != null) __obj.updateDynamic("UserStorage")(UserStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceBundle]
  }
}

