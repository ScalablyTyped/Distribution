package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSummary extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[Id] = js.native
  /**
    * The status of the device.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.worklinkMod.DeviceStatus] = js.native
}

object DeviceSummary {
  @scala.inline
  def apply(): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSummary]
  }
  @scala.inline
  implicit class DeviceSummaryOps[Self <: DeviceSummary] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: Id): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = this.set("DeviceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceStatus: Self = this.set("DeviceStatus", js.undefined)
  }
  
}

