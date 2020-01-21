package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeviceResponse extends js.Object {
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.networkmanagerMod.Device] = js.native
}

object CreateDeviceResponse {
  @scala.inline
  def apply(Device: Device = null): CreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceResponse]
  }
}

