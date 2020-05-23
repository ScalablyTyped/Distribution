package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachVolumeInput extends js.Object {
  /**
    * Set to true to forcibly remove the iSCSI connection of the target volume and detach the volume. The default is false. If this value is set to false, you must manually disconnect the iSCSI connection from the target volume.
    */
  var ForceDetach: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object DetachVolumeInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN, ForceDetach: js.UndefOr[Boolean] = js.undefined): DetachVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceDetach)) __obj.updateDynamic("ForceDetach")(ForceDetach.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeInput]
  }
}

