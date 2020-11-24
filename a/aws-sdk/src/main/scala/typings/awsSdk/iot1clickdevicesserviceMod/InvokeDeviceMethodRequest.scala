package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeDeviceMethodRequest extends js.Object {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.DeviceMethod] = js.native
  
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[string] = js.native
}
object InvokeDeviceMethodRequest {
  
  @scala.inline
  def apply(DeviceId: string): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
  
  @scala.inline
  implicit class InvokeDeviceMethodRequestOps[Self <: InvokeDeviceMethodRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: string): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMethod(value: DeviceMethod): Self = this.set("DeviceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMethod: Self = this.set("DeviceMethod", js.undefined)
    
    @scala.inline
    def setDeviceMethodParameters(value: string): Self = this.set("DeviceMethodParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMethodParameters: Self = this.set("DeviceMethodParameters", js.undefined)
  }
}
