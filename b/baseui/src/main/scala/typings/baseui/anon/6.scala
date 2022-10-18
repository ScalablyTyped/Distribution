package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[T] extends StObject {
  
  var date: T
}
object `6` {
  
  inline def apply[T](date: T): `6`[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`[T]]
  }
  
  extension [Self <: `6`[?], T](x: Self & `6`[T]) {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
