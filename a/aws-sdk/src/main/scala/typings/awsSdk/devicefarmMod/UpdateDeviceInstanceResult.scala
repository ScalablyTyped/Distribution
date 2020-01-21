package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceInstanceResult extends js.Object {
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.native
}

object UpdateDeviceInstanceResult {
  @scala.inline
  def apply(deviceInstance: DeviceInstance = null): UpdateDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstance != null) __obj.updateDynamic("deviceInstance")(deviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceInstanceResult]
  }
}

