package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachVolumeRequest extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var Device: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object AttachVolumeRequest {
  @scala.inline
  def apply(
    Device: String,
    InstanceId: InstanceId,
    VolumeId: VolumeId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AttachVolumeRequest = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVolumeRequest]
  }
}

