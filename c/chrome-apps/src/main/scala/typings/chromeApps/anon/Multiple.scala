package typings.chromeApps.anon

import typings.chromeApps.chrome.usb.DeviceFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiple extends StObject {
  
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object Multiple {
  
  inline def apply(): Multiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[DeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: DeviceFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
