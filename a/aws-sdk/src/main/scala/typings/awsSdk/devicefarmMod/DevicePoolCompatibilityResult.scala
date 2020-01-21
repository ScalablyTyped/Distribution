package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePoolCompatibilityResult extends js.Object {
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.native
  /**
    * The device (phone or tablet) to return information about.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.native
}

object DevicePoolCompatibilityResult {
  @scala.inline
  def apply(
    compatible: js.UndefOr[scala.Boolean] = js.undefined,
    device: Device = null,
    incompatibilityMessages: IncompatibilityMessages = null
  ): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compatible)) __obj.updateDynamic("compatible")(compatible.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (incompatibilityMessages != null) __obj.updateDynamic("incompatibilityMessages")(incompatibilityMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
}

