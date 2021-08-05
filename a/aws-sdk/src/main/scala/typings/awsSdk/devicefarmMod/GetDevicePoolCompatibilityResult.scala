package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePoolCompatibilityResult extends StObject {
  
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined
  
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined
}
object GetDevicePoolCompatibilityResult {
  
  inline def apply(): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
  
  extension [Self <: GetDevicePoolCompatibilityResult](x: Self) {
    
    inline def setCompatibleDevices(value: DevicePoolCompatibilityResults): Self = StObject.set(x, "compatibleDevices", value.asInstanceOf[js.Any])
    
    inline def setCompatibleDevicesUndefined: Self = StObject.set(x, "compatibleDevices", js.undefined)
    
    inline def setCompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = StObject.set(x, "compatibleDevices", js.Array(value :_*))
    
    inline def setIncompatibleDevices(value: DevicePoolCompatibilityResults): Self = StObject.set(x, "incompatibleDevices", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleDevicesUndefined: Self = StObject.set(x, "incompatibleDevices", js.undefined)
    
    inline def setIncompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = StObject.set(x, "incompatibleDevices", js.Array(value :_*))
  }
}
