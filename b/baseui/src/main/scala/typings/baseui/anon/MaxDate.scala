package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDate[T] extends StObject {
  
  var includeDates: js.UndefOr[js.Array[T]] = js.undefined
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
}
object MaxDate {
  
  inline def apply[T](): MaxDate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxDate[T]]
  }
  
  extension [Self <: MaxDate[?], T](x: Self & MaxDate[T]) {
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
  }
}
