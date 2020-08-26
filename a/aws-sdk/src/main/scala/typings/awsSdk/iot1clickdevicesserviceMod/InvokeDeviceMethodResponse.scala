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
  def apply(): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
  @scala.inline
  implicit class InvokeDeviceMethodResponseOps[Self <: InvokeDeviceMethodResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceMethodResponse(value: string): Self = this.set("DeviceMethodResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMethodResponse: Self = this.set("DeviceMethodResponse", js.undefined)
  }
  
}

