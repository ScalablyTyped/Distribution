package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: String
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
}
object DeleteDeviceRequest {
  
  inline def apply(DeviceId: String, GlobalNetworkId: String): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
  
  extension [Self <: DeleteDeviceRequest](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
