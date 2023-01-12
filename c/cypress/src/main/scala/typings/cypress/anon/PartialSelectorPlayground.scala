package typings.cypress.anon

import typings.cypress.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.SelectorPlaygroundDefaultsOptions> */
trait PartialSelectorPlayground extends StObject {
  
  var onElement: js.UndefOr[js.Function1[/* $el */ JQuery[HTMLElement], js.UndefOr[String | Null]]] = js.undefined
  
  var selectorPriority: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialSelectorPlayground {
  
  inline def apply(): PartialSelectorPlayground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectorPlayground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSelectorPlayground] (val x: Self) extends AnyVal {
    
    inline def setOnElement(value: /* $el */ JQuery[HTMLElement] => js.UndefOr[String | Null]): Self = StObject.set(x, "onElement", js.Any.fromFunction1(value))
    
    inline def setOnElementUndefined: Self = StObject.set(x, "onElement", js.undefined)
    
    inline def setSelectorPriority(value: js.Array[String]): Self = StObject.set(x, "selectorPriority", value.asInstanceOf[js.Any])
    
    inline def setSelectorPriorityUndefined: Self = StObject.set(x, "selectorPriority", js.undefined)
    
    inline def setSelectorPriorityVarargs(value: String*): Self = StObject.set(x, "selectorPriority", js.Array(value*))
  }
}
