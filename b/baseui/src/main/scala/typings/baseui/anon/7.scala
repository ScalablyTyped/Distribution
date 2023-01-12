package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[T] extends StObject {
  
  var date: js.UndefOr[T | Null | js.Array[T]] = js.undefined
}
object `7` {
  
  inline def apply[T](): `7`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?], T] (val x: Self & `7`[T]) extends AnyVal {
    
    inline def setDate(value: T | js.Array[T]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDateVarargs(value: T*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
