package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDates[T] extends StObject {
  
  var includeDates: js.UndefOr[js.Array[T]] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
}
object IncludeDates {
  
  inline def apply[T](): IncludeDates[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeDates[T]]
  }
  
  extension [Self <: IncludeDates[?], T](x: Self & IncludeDates[T]) {
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
