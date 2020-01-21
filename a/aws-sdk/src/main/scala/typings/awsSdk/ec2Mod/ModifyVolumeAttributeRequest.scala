package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVolumeAttributeRequest extends js.Object {
  /**
    * Indicates whether the volume should be auto-enabled for I/O operations.
    */
  var AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object ModifyVolumeAttributeRequest {
  @scala.inline
  def apply(
    VolumeId: VolumeId,
    AutoEnableIO: AttributeBooleanValue = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (AutoEnableIO != null) __obj.updateDynamic("AutoEnableIO")(AutoEnableIO.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeAttributeRequest]
  }
}

