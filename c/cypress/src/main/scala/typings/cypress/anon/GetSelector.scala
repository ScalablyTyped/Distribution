package typings.cypress.anon

import typings.cypress.JQuery
import typings.cypress.JQuery.Selector
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelector extends StObject {
  
  def defaults(options: PartialSelectorPlayground): Unit
  
  def getSelector($el: JQuery[HTMLElement]): Selector
}
object GetSelector {
  
  inline def apply(defaults: PartialSelectorPlayground => Unit, getSelector: JQuery[HTMLElement] => Selector): GetSelector = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults), getSelector = js.Any.fromFunction1(getSelector))
    __obj.asInstanceOf[GetSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSelector] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: PartialSelectorPlayground => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
    
    inline def setGetSelector(value: JQuery[HTMLElement] => Selector): Self = StObject.set(x, "getSelector", js.Any.fromFunction1(value))
  }
}
