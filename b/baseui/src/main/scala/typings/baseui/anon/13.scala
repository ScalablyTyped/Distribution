package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[T] extends StObject {
  
  var date: js.UndefOr[T | Null | js.Array[T]] = js.undefined
}
object `13` {
  
  inline def apply[T](): `13`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[T]]
  }
  
  extension [Self <: `13`[?], T](x: Self & `13`[T]) {
    
    inline def setDate(value: T | js.Array[T]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: T*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
