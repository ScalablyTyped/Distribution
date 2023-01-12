package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDatesMaxDate[T] extends StObject {
  
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
}
object IncludeDatesMaxDate {
  
  inline def apply[T](): IncludeDatesMaxDate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeDatesMaxDate[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeDatesMaxDate[?], T] (val x: Self & IncludeDatesMaxDate[T]) extends AnyVal {
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
  }
}
