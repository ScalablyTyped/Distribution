package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeDeviceMethodRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.DeviceMethod] = js.native
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[string] = js.native
}

object InvokeDeviceMethodRequest {
  @scala.inline
  def apply(DeviceId: string, DeviceMethod: DeviceMethod = null, DeviceMethodParameters: string = null): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    if (DeviceMethod != null) __obj.updateDynamic("DeviceMethod")(DeviceMethod.asInstanceOf[js.Any])
    if (DeviceMethodParameters != null) __obj.updateDynamic("DeviceMethodParameters")(DeviceMethodParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
}

