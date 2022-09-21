package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDateMinDate[T] extends StObject {
  
  var maxDate: js.UndefOr[T | Null] = js.undefined
  
  var minDate: js.UndefOr[T | Null] = js.undefined
}
object MaxDateMinDate {
  
  inline def apply[T](): MaxDateMinDate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxDateMinDate[T]]
  }
  
  extension [Self <: MaxDateMinDate[?], T](x: Self & MaxDateMinDate[T]) {
    
    inline def setMaxDate(value: T): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: T): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
  }
}
