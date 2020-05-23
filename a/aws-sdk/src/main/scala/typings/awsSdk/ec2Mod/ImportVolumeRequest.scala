package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVolumeRequest extends js.Object {
  /**
    * The Availability Zone for the resulting EBS volume.
    */
  var AvailabilityZone: String = js.native
  /**
    * A description of the volume.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The disk image.
    */
  var Image: DiskImageDetail = js.native
  /**
    * The volume size.
    */
  var Volume: VolumeDetail = js.native
}

object ImportVolumeRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String,
    Image: DiskImageDetail,
    Volume: VolumeDetail,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ImportVolumeRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVolumeRequest]
  }
}

