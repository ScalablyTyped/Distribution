package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDate extends StObject {
  
  var excludeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  
  var filterDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  
  var maxDate: js.UndefOr[js.Date] = js.undefined
  
  var minDate: js.UndefOr[js.Date] = js.undefined
}
object FilterDate {
  
  inline def apply(): FilterDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDate]
  }
  
  extension [Self <: FilterDate](x: Self) {
    
    inline def setExcludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    inline def setExcludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "excludeDates", js.Array(value*))
    
    inline def setFilterDate(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
