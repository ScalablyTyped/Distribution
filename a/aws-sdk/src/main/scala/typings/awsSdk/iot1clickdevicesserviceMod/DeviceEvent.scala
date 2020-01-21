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
  def apply(Device: Device = null, StdEvent: string = null): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    if (StdEvent != null) __obj.updateDynamic("StdEvent")(StdEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEvent]
  }
}

