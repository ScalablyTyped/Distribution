package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  def is(input: T): Unit
}
object `0` {
  
  inline def apply[T](is: T => Unit): `0`[T] = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is))
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T](x: Self & `0`[T]) {
    
    inline def setIs(value: T => Unit): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
  }
}
