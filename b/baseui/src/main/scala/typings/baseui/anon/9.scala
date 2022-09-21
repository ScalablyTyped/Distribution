package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[T] extends StObject {
  
  var date: T
}
object `9` {
  
  inline def apply[T](date: T): `9`[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[T]]
  }
  
  extension [Self <: `9`[?], T](x: Self & `9`[T]) {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
