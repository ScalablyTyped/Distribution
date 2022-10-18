package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[T] extends StObject {
  
  var date: js.UndefOr[T | Null | js.Array[T]] = js.undefined
}
object `9` {
  
  inline def apply[T](): `9`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`[T]]
  }
  
  extension [Self <: `9`[?], T](x: Self & `9`[T]) {
    
    inline def setDate(value: T | js.Array[T]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: T*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
