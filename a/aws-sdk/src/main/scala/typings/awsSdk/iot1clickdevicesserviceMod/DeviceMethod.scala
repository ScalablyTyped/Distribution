package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMethod extends js.Object {
  
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.native
  
  /**
    * The name of the method applicable to the deviceType.
    */
  var MethodName: js.UndefOr[string] = js.native
}
object DeviceMethod {
  
  @scala.inline
  def apply(): DeviceMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMethod]
  }
  
  @scala.inline
  implicit class DeviceMethodOps[Self <: DeviceMethod] (val x: Self) extends AnyVal {
    
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
    def setDeviceType(value: string): Self = this.set("DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("DeviceType", js.undefined)
    
    @scala.inline
    def setMethodName(value: string): Self = this.set("MethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("MethodName", js.undefined)
  }
}
