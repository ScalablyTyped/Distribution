package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceResponse extends js.Object {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.networkmanagerMod.Device] = js.native
}
object UpdateDeviceResponse {
  
  @scala.inline
  def apply(): UpdateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceResponse]
  }
  
  @scala.inline
  implicit class UpdateDeviceResponseOps[Self <: UpdateDeviceResponse] (val x: Self) extends AnyVal {
    
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
