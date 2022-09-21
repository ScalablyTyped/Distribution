package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceStats extends StObject {
  
  /**
    * The number of devices connected with a heartbeat.
    */
  var ConnectedDeviceCount: Long
  
  /**
    * The number of registered devices.
    */
  var RegisteredDeviceCount: Long
}
object DeviceStats {
  
  inline def apply(ConnectedDeviceCount: Long, RegisteredDeviceCount: Long): DeviceStats = {
    val __obj = js.Dynamic.literal(ConnectedDeviceCount = ConnectedDeviceCount.asInstanceOf[js.Any], RegisteredDeviceCount = RegisteredDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStats]
  }
  
  extension [Self <: DeviceStats](x: Self) {
    
    inline def setConnectedDeviceCount(value: Long): Self = StObject.set(x, "ConnectedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDeviceCount(value: Long): Self = StObject.set(x, "RegisteredDeviceCount", value.asInstanceOf[js.Any])
  }
}
