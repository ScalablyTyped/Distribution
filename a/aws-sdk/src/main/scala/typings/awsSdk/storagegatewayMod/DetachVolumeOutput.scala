package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume that was detached.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object DetachVolumeOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DetachVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeOutput]
  }
}

