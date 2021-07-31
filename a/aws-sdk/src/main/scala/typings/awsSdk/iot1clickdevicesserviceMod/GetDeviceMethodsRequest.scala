package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceMethodsRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
}
object GetDeviceMethodsRequest {
  
  @scala.inline
  def apply(DeviceId: string): GetDeviceMethodsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceMethodsRequest]
  }
  
  @scala.inline
  implicit class GetDeviceMethodsRequestMutableBuilder[Self <: GetDeviceMethodsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
