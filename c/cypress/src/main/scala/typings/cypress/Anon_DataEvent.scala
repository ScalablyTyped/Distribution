package typings.cypress

import typings.cypress.JQuery.Event
import typings.cypress.JQuery._SpecialEventHook
import typings.cypress.cypressNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataEvent[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Called when the `.trigger()` or `.triggerHandler()` methods are used to trigger an event for the special type from code, as opposed to events that originate from within the browser. The `this` keyword will be the element being triggered, and the event argument will be a `jQuery.Event` object constructed from the caller's input. At minimum, the event type, data, namespace, and target properties are set on the event. The data argument represents additional data passed by `.trigger()` if present.
    *
    * The trigger hook is called early in the process of triggering an event, just after the `jQuery.Event` object is constructed and before any handlers have been called. It can process the triggered event in any way, for example by calling `event.stopPropagation()` or `event.preventDefault()` before returning. If the hook returns `false`, jQuery does not perform any further event triggering actions and returns immediately. Otherwise, it performs the normal trigger processing, calling any event handlers for the element and bubbling the event (unless propagation is stopped in advance or `noBubble` was specified for the special event) to call event handlers attached to parent elements.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#trigger-function-event-jquery-event-data-object }\`
    */
  def trigger(`this`: TTarget, event: Event, data: TData): Unit | `false`
}

object Anon_DataEvent {
  @scala.inline
  def apply[TTarget, TData](trigger: (TTarget, Event, TData) => Unit | `false`): Anon_DataEvent[TTarget, TData] = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction3(trigger))
  
    __obj.asInstanceOf[Anon_DataEvent[TTarget, TData]]
  }
}

