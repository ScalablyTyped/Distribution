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
}

