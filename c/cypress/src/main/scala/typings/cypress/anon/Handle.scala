package typings.cypress.anon

import typings.cypress.JQuery.TriggeredEvent
import typings.cypress.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle[TTarget, TData]
  extends StObject
     with _SpecialEventHook[TTarget, TData] {
  
  /**
    * jQuery calls a handle hook when the event has occurred and jQuery would normally call the user's event handler specified by `.on()` or another event binding method. If the hook exists, jQuery calls it _instead_ of that event handler, passing it the event and any data passed from `.trigger()` if it was not a native event. The `this` keyword is the DOM element being handled, and `event.handleObj` property has the detailed event information.
    *
    * Based in the information it has, the handle hook should decide whether to call the original handler function which is in `event.handleObj.handler`. It can modify information in the event object before calling the original handler, but _must restore_ that data before returning or subsequent unrelated event handlers may act unpredictably. In most cases, the handle hook should return the result of the original handler, but that is at the discretion of the hook. The handle hook is unique in that it is the only special event function hook that is called under its original special event name when the type is mapped using `bindType` and `delegateType`. For that reason, it is almost always an error to have anything other than a handle hook present if the special event defines a `bindType` and `delegateType`, since those other hooks will never be called.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#handle-function-event-jquery-event-data-object }\`
    */
  def handle(event: (TriggeredEvent[TTarget, TData, Any, Any]) & (HandleObj[TTarget, TData]), data: TData*): Unit
}
object Handle {
  
  inline def apply[TTarget, TData](
    handle: ((TriggeredEvent[TTarget, TData, Any, Any]) & (HandleObj[TTarget, TData]), /* repeated */ TData) => Unit
  ): Handle[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
    __obj.asInstanceOf[Handle[TTarget, TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handle[?, ?], TTarget, TData] (val x: Self & (Handle[TTarget, TData])) extends AnyVal {
    
    inline def setHandle(
      value: ((TriggeredEvent[TTarget, TData, Any, Any]) & (HandleObj[TTarget, TData]), /* repeated */ TData) => Unit
    ): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
  }
}
