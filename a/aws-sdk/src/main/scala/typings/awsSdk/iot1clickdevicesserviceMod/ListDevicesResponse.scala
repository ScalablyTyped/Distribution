package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicesResponse extends js.Object {
  /**
    * A list of devices.
    */
  var Devices: js.UndefOr[listOfDeviceDescription] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDevicesResponse {
  @scala.inline
  def apply(): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResponse]
  }
  @scala.inline
  implicit class ListDevicesResponseOps[Self <: ListDevicesResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: DeviceDescription*): Self = this.set("Devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: listOfDeviceDescription): Self = this.set("Devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("Devices", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

