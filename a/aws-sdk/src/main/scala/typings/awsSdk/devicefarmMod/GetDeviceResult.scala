package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceResult extends StObject {
  
  /**
    * An object that contains information about the requested device.
    */
  var device: js.UndefOr[Device] = js.undefined
}
object GetDeviceResult {
  
  inline def apply(): GetDeviceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceResult]
  }
  
  extension [Self <: GetDeviceResult](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
