package typings.cypress.anon

import typings.cypress.JQuery.TriggeredEvent
import typings.cypress.JQuery._SpecialEventHook
import typings.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[TTarget, TData]
  extends StObject
     with _SpecialEventHook[TTarget, TData] {
  
  /**
    * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
    */
  def _default(event: TriggeredEvent[TTarget, TData, Any, Any], data: TData): Unit | `false`
}
object Default {
  
  inline def apply[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, Any, Any], TData) => Unit | `false`): Default[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
    __obj.asInstanceOf[Default[TTarget, TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default[?, ?], TTarget, TData] (val x: Self & (Default[TTarget, TData])) extends AnyVal {
    
    inline def set_default(value: (TriggeredEvent[TTarget, TData, Any, Any], TData) => Unit | `false`): Self = StObject.set(x, "_default", js.Any.fromFunction2(value))
  }
}
