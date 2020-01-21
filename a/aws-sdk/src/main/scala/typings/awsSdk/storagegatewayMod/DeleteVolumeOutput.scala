package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the storage volume that was deleted. It is the same ARN you provided in the request.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object DeleteVolumeOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DeleteVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVolumeOutput]
  }
}

