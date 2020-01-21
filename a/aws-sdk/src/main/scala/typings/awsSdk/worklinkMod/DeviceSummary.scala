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
  def apply(DeviceId: Id = null, DeviceStatus: DeviceStatus = null): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSummary]
  }
}

