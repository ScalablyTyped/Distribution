package typings.cypress.anon

import typings.cypress.JQuery._ValHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TElement]
  extends StObject
     with _ValHook[TElement] {
  
  def get(elem: TElement): Any
}
object `2` {
  
  inline def apply[TElement](get: TElement => Any): `2`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`2`[TElement]]
  }
  
  extension [Self <: `2`[?], TElement](x: Self & `2`[TElement]) {
    
    inline def setGet(value: TElement => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
