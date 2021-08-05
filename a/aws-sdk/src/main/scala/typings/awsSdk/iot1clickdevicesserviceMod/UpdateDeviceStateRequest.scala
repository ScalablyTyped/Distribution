package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceStateRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
  
  /**
    * If true, the device is enabled. If false, the device is
    disabled.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object UpdateDeviceStateRequest {
  
  inline def apply(DeviceId: string): UpdateDeviceStateRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStateRequest]
  }
  
  extension [Self <: UpdateDeviceStateRequest](x: Self) {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
