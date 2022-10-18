package typings.cypress.anon

import typings.cypress.JQuery.Event
import typings.cypress.JQuery._SpecialEventHook
import typings.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreDispatch[TTarget]
  extends StObject
     with _SpecialEventHook[TTarget, Any] {
  
  def preDispatch(event: Event): `false` | Unit
}
object PreDispatch {
  
  inline def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
  
  extension [Self <: PreDispatch[?], TTarget](x: Self & PreDispatch[TTarget]) {
    
    inline def setPreDispatch(value: Event => `false` | Unit): Self = StObject.set(x, "preDispatch", js.Any.fromFunction1(value))
  }
}
