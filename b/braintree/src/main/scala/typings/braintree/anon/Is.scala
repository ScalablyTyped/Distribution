package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Is[T] extends StObject {
  
  def is(input: T): Unit
  
  def isNot(input: T): Unit
}
object Is {
  
  inline def apply[T](is: T => Unit, isNot: T => Unit): Is[T] = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), isNot = js.Any.fromFunction1(isNot))
    __obj.asInstanceOf[Is[T]]
  }
  
  extension [Self <: Is[?], T](x: Self & Is[T]) {
    
    inline def setIs(value: T => Unit): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setIsNot(value: T => Unit): Self = StObject.set(x, "isNot", js.Any.fromFunction1(value))
  }
}
