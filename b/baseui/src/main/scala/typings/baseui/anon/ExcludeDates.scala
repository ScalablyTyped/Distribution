package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeDates[T] extends StObject {
  
  var excludeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var filterDate: js.UndefOr[(js.Function1[/* day */ T, Boolean]) | Null] = js.undefined
  
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
}
object ExcludeDates {
  
  inline def apply[T](): ExcludeDates[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeDates[T]]
  }
  
  extension [Self <: ExcludeDates[?], T](x: Self & ExcludeDates[T]) {
    
    inline def setExcludeDates(value: js.Array[T]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setExcludeDatesNull: Self = StObject.set(x, "excludeDates", null)
    
    inline def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    inline def setExcludeDatesVarargs(value: T*): Self = StObject.set(x, "excludeDates", js.Array(value*))
    
    inline def setFilterDate(value: /* day */ T => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    inline def setFilterDateNull: Self = StObject.set(x, "filterDate", null)
    
    inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
