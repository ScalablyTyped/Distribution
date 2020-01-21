package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotRequest extends js.Object {
  /**
    * A description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tags to apply to the snapshot during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object CreateSnapshotRequest {
  @scala.inline
  def apply(
    VolumeId: VolumeId,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
}

