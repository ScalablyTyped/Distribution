package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndsWith[T] extends StObject {
  
  def endsWith(input: T): Unit
  
  def startsWith(input: T): Unit
}
object EndsWith {
  
  inline def apply[T](endsWith: T => Unit, startsWith: T => Unit): EndsWith[T] = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction1(endsWith), startsWith = js.Any.fromFunction1(startsWith))
    __obj.asInstanceOf[EndsWith[T]]
  }
  
  extension [Self <: EndsWith[?], T](x: Self & EndsWith[T]) {
    
    inline def setEndsWith(value: T => Unit): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    inline def setStartsWith(value: T => Unit): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
  }
}
