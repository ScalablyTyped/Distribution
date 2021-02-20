package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnclaimDeviceRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
}
object UnclaimDeviceRequest {
  
  @scala.inline
  def apply(DeviceId: string): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
  
  @scala.inline
  implicit class UnclaimDeviceRequestMutableBuilder[Self <: UnclaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
