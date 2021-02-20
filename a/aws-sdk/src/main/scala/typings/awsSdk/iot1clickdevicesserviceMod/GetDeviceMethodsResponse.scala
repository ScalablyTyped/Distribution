package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceMethodsResponse extends StObject {
  
  /**
    * List of available device APIs.
    */
  var DeviceMethods: js.UndefOr[listOfDeviceMethod] = js.native
}
object GetDeviceMethodsResponse {
  
  @scala.inline
  def apply(): GetDeviceMethodsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceMethodsResponse]
  }
  
  @scala.inline
  implicit class GetDeviceMethodsResponseMutableBuilder[Self <: GetDeviceMethodsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceMethods(value: listOfDeviceMethod): Self = StObject.set(x, "DeviceMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMethodsUndefined: Self = StObject.set(x, "DeviceMethods", js.undefined)
    
    @scala.inline
    def setDeviceMethodsVarargs(value: DeviceMethod*): Self = StObject.set(x, "DeviceMethods", js.Array(value :_*))
  }
}
