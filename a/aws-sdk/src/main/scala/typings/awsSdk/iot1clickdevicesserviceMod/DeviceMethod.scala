package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMethod extends StObject {
  
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
  implicit class DeviceMethodMutableBuilder[Self <: DeviceMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceType(value: string): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    @scala.inline
    def setMethodName(value: string): Self = StObject.set(x, "MethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "MethodName", js.undefined)
  }
}
