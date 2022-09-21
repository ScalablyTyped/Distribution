package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12`[T] extends StObject {
  
  var date: T | (js.Array[js.UndefOr[T | Null]])
}
object `12` {
  
  inline def apply[T](date: T | (js.Array[js.UndefOr[T | Null]])): `12`[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`[T]]
  }
  
  extension [Self <: `12`[?], T](x: Self & `12`[T]) {
    
    inline def setDate(value: T | (js.Array[js.UndefOr[T | Null]])): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateVarargs(value: (js.UndefOr[T | Null])*): Self = StObject.set(x, "date", js.Array(value*))
  }
}
