package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[T] extends StObject {
  
  var date: T | (js.Array[js.UndefOr[T | Null]])
}
object `9` {
  
  inline def apply[T](date: T | (js.Array[js.UndefOr[T | Null]])): `9`[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`[?], T] (val x: Self & `9`[T]) extends AnyVal {
    
    inline def setDate(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
