package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceResponse extends StObject {
  
  /**
    * The device.
    */
  var Device: DeviceType
}
object GetDeviceResponse {
  
  @scala.inline
  def apply(Device: DeviceType): GetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResponse]
  }
  
  @scala.inline
  implicit class GetDeviceResponseMutableBuilder[Self <: GetDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: DeviceType): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
  }
}
