package typings.chromeApps.anon

import typings.chromeApps.chrome.usb.DeviceFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setFilters(value: js.Array[DeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: DeviceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
