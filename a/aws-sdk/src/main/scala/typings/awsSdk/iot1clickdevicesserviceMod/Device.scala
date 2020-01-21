package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The user specified attributes associated with the device for an event.
    */
  var Attributes: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.Attributes] = js.native
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[string] = js.native
  /**
    * The device type, such as "button".
    */
  var Type: js.UndefOr[string] = js.native
}

object Device {
  @scala.inline
  def apply(Attributes: Attributes = null, DeviceId: string = null, Type: string = null): Device = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

