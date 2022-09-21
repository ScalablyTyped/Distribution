package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePoolCompatibilityResult extends StObject {
  
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The device (phone or tablet) to return information about.
    */
  var device: js.UndefOr[Device] = js.undefined
  
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.undefined
}
object DevicePoolCompatibilityResult {
  
  inline def apply(): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
  
  extension [Self <: DevicePoolCompatibilityResult](x: Self) {
    
    inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
    
    inline def setCompatibleUndefined: Self = StObject.set(x, "compatible", js.undefined)
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setIncompatibilityMessages(value: IncompatibilityMessages): Self = StObject.set(x, "incompatibilityMessages", value.asInstanceOf[js.Any])
    
    inline def setIncompatibilityMessagesUndefined: Self = StObject.set(x, "incompatibilityMessages", js.undefined)
    
    inline def setIncompatibilityMessagesVarargs(value: IncompatibilityMessage*): Self = StObject.set(x, "incompatibilityMessages", js.Array(value*))
  }
}
