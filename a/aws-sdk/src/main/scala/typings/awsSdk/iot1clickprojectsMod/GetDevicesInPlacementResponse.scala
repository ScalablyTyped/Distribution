package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicesInPlacementResponse extends js.Object {
  /**
    * An object containing the devices (zero or more) within the placement.
    */
  var devices: DeviceMap = js.native
}

object GetDevicesInPlacementResponse {
  @scala.inline
  def apply(devices: DeviceMap): GetDevicesInPlacementResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementResponse]
  }
  @scala.inline
  implicit class GetDevicesInPlacementResponseOps[Self <: GetDevicesInPlacementResponse] (val x: Self) extends AnyVal {
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
    def setDevices(value: DeviceMap): Self = this.set("devices", value.asInstanceOf[js.Any])
  }
  
}

