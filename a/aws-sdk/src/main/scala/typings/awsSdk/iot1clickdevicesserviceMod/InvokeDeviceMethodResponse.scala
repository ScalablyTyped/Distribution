package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeDeviceMethodResponse extends StObject {
  
  /**
    * A JSON encoded string containing the device method response.
    */
  var DeviceMethodResponse: js.UndefOr[string] = js.undefined
}
object InvokeDeviceMethodResponse {
  
  @scala.inline
  def apply(): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
  
  @scala.inline
  implicit class InvokeDeviceMethodResponseMutableBuilder[Self <: InvokeDeviceMethodResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceMethodResponse(value: string): Self = StObject.set(x, "DeviceMethodResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMethodResponseUndefined: Self = StObject.set(x, "DeviceMethodResponse", js.undefined)
  }
}
