package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Between[T] extends StObject {
  
  /** Inclusive */
  def between(lowerBound: T, upperBoundIncl: T): Unit
  
  def is(input: T): Unit
  
  def max(maximum: T): Unit
  
  def min(minimum: T): Unit
}
object Between {
  
  inline def apply[T](between: (T, T) => Unit, is: T => Unit, max: T => Unit, min: T => Unit): Between[T] = {
    val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), is = js.Any.fromFunction1(is), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min))
    __obj.asInstanceOf[Between[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Between[?], T] (val x: Self & Between[T]) extends AnyVal {
    
    inline def setBetween(value: (T, T) => Unit): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
    
    inline def setIs(value: T => Unit): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setMax(value: T => Unit): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: T => Unit): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
  }
}
