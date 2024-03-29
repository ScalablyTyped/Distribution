package typings.chaiThings

import typings.chaiThings.Chai.ArrayAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array[T] extends StObject {
  
  var should: ArrayAssertion
}
object Array {
  
  inline def apply[T](should: ArrayAssertion): Array[T] = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Array[?], T] (val x: Self & Array[T]) extends AnyVal {
    
    inline def setShould(value: ArrayAssertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
  }
}
