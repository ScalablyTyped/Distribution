package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceResponse extends js.Object {
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.networkmanagerMod.Device] = js.native
}

object UpdateDeviceResponse {
  @scala.inline
  def apply(Device: Device = null): UpdateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceResponse]
  }
}

