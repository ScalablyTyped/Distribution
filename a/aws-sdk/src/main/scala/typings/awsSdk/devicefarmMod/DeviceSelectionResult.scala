package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSelectionResult extends StObject {
  
  /**
    * The filters in a device selection result.
    */
  var filters: js.UndefOr[DeviceFilters] = js.undefined
  
  /**
    * The number of devices that matched the device filter selection criteria.
    */
  var matchedDevicesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of devices to be selected by a device filter and included in a test run.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
}
object DeviceSelectionResult {
  
  inline def apply(): DeviceSelectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSelectionResult]
  }
  
  extension [Self <: DeviceSelectionResult](x: Self) {
    
    inline def setFilters(value: DeviceFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: DeviceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setMatchedDevicesCount(value: Integer): Self = StObject.set(x, "matchedDevicesCount", value.asInstanceOf[js.Any])
    
    inline def setMatchedDevicesCountUndefined: Self = StObject.set(x, "matchedDevicesCount", js.undefined)
    
    inline def setMaxDevices(value: Integer): Self = StObject.set(x, "maxDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxDevicesUndefined: Self = StObject.set(x, "maxDevices", js.undefined)
  }
}
