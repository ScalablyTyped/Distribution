package typings.cypress.anon

import typings.cypress.JQuery.HandleObject
import typings.cypress.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove[TTarget, TData]
  extends StObject
     with _SpecialEventHook[TTarget, TData] {
  
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(handleObj: HandleObject[TTarget, TData]): Unit
}
object Remove {
  
  inline def apply[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): Remove[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Remove[TTarget, TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Remove[?, ?], TTarget, TData] (val x: Self & (Remove[TTarget, TData])) extends AnyVal {
    
    inline def setRemove(value: HandleObject[TTarget, TData] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
