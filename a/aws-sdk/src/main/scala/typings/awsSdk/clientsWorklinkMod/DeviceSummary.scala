package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSummary extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the device.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DeviceStatus] = js.undefined
}
object DeviceSummary {
  
  inline def apply(): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSummary]
  }
  
  extension [Self <: DeviceSummary](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "DeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatusUndefined: Self = StObject.set(x, "DeviceStatus", js.undefined)
  }
}
