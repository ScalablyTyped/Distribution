package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[T] extends StObject {
  
  val date: js.UndefOr[T | Null | (js.Array[js.UndefOr[T | Null]])] = js.undefined
}
object `8` {
  
  inline def apply[T](): `8`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[T]]
  }
  
  extension [Self <: `8`[?], T](x: Self & `8`[T]) {
    
    inline def setDate(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
