package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolCompatibilityResult extends js.Object {
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
}

object GetDevicePoolCompatibilityResult {
  @scala.inline
  def apply(
    compatibleDevices: DevicePoolCompatibilityResults = null,
    incompatibleDevices: DevicePoolCompatibilityResults = null
  ): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    if (compatibleDevices != null) __obj.updateDynamic("compatibleDevices")(compatibleDevices.asInstanceOf[js.Any])
    if (incompatibleDevices != null) __obj.updateDynamic("incompatibleDevices")(incompatibleDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
}

