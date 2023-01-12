package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In[T] extends StObject {
  
  def in(input: js.Array[T]): Unit
  
  def is(input: T): Unit
}
object In {
  
  inline def apply[T](in: js.Array[T] => Unit, is: T => Unit): In[T] = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), is = js.Any.fromFunction1(is))
    __obj.asInstanceOf[In[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: In[?], T] (val x: Self & In[T]) extends AnyVal {
    
    inline def setIn(value: js.Array[T] => Unit): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIs(value: T => Unit): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
  }
}
