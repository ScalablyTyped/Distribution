package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVTLDeviceTypeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the medium changer you have selected.
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
}

object UpdateVTLDeviceTypeOutput {
  @scala.inline
  def apply(VTLDeviceARN: VTLDeviceARN = null): UpdateVTLDeviceTypeOutput = {
    val __obj = js.Dynamic.literal()
    if (VTLDeviceARN != null) __obj.updateDynamic("VTLDeviceARN")(VTLDeviceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
  }
}

