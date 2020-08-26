package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEvent extends js.Object {
  /**
    * An object representing the device associated with the event.
    */
  var Device: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.Device] = js.native
  /**
    * A serialized JSON object representing the device-type specific event.
    */
  var StdEvent: js.UndefOr[string] = js.native
}

object DeviceEvent {
  @scala.inline
  def apply(): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvent]
  }
  @scala.inline
  implicit class DeviceEventOps[Self <: DeviceEvent] (val x: Self) extends AnyVal {
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
    def setDevice(value: Device): Self = this.set("Device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    @scala.inline
    def setStdEvent(value: string): Self = this.set("StdEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdEvent: Self = this.set("StdEvent", js.undefined)
  }
  
}

