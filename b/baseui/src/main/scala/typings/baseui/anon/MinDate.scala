package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinDate[T] extends StObject {
  
  var includeDates: js.UndefOr[js.Array[T] | Null] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
}
object MinDate {
  
  inline def apply[T](): MinDate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinDate[T]]
  }
  
  extension [Self <: MinDate[?], T](x: Self & MinDate[T]) {
    
    inline def setIncludeDates(value: js.Array[T]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesNull: Self = StObject.set(x, "includeDates", null)
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: T*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
