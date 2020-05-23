package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceStateRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  /**
    * If true, the device is enabled. If false, the device is
    disabled.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object UpdateDeviceStateRequest {
  @scala.inline
  def apply(DeviceId: string, Enabled: js.UndefOr[boolean] = js.undefined): UpdateDeviceStateRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStateRequest]
  }
}

