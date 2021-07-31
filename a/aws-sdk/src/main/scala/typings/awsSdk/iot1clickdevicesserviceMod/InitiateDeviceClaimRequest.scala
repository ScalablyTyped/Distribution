package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateDeviceClaimRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
}
object InitiateDeviceClaimRequest {
  
  @scala.inline
  def apply(DeviceId: string): InitiateDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDeviceClaimRequest]
  }
  
  @scala.inline
  implicit class InitiateDeviceClaimRequestMutableBuilder[Self <: InitiateDeviceClaimRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
