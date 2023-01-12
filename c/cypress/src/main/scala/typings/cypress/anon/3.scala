package typings.cypress.anon

import typings.cypress.JQuery._ValHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[TElement]
  extends StObject
     with _ValHook[TElement] {
  
  def set(elem: TElement, value: Any): Any
}
object `3` {
  
  inline def apply[TElement](set: (TElement, Any) => Any): `3`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`3`[TElement]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`[?], TElement] (val x: Self & `3`[TElement]) extends AnyVal {
    
    inline def setSet(value: (TElement, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
