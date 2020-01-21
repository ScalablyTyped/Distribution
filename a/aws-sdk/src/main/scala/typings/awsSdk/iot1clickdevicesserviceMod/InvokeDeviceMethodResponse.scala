package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeDeviceMethodResponse extends js.Object {
  /**
    * A JSON encoded string containing the device method response.
    */
  var DeviceMethodResponse: js.UndefOr[string] = js.native
}

object InvokeDeviceMethodResponse {
  @scala.inline
  def apply(DeviceMethodResponse: string = null): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceMethodResponse != null) __obj.updateDynamic("DeviceMethodResponse")(DeviceMethodResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
}

