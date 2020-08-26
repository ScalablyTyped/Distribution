package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceMethodsResponse extends js.Object {
  /**
    * List of available device APIs.
    */
  var DeviceMethods: js.UndefOr[listOfDeviceMethod] = js.native
}

object GetDeviceMethodsResponse {
  @scala.inline
  def apply(): GetDeviceMethodsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceMethodsResponse]
  }
  @scala.inline
  implicit class GetDeviceMethodsResponseOps[Self <: GetDeviceMethodsResponse] (val x: Self) extends AnyVal {
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
    def setDeviceMethodsVarargs(value: DeviceMethod*): Self = this.set("DeviceMethods", js.Array(value :_*))
    @scala.inline
    def setDeviceMethods(value: listOfDeviceMethod): Self = this.set("DeviceMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMethods: Self = this.set("DeviceMethods", js.undefined)
  }
  
}

