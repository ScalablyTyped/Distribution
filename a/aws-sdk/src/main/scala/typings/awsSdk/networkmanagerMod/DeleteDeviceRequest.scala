package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceRequest extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: String = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
}

object DeleteDeviceRequest {
  @scala.inline
  def apply(DeviceId: String, GlobalNetworkId: String): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  @scala.inline
  implicit class DeleteDeviceRequestOps[Self <: DeleteDeviceRequest] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
  }
  
}

