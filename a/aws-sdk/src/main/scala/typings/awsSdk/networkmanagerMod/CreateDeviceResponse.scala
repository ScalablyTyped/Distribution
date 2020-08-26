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
  def apply(): CreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeviceResponse]
  }
  @scala.inline
  implicit class CreateDeviceResponseOps[Self <: CreateDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevice(value: Device): Self = this.set("Device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
  }
  
}

