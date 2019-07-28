package typings.cypress.JQueryNs

import typings.cypress._Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance members
// Generic members
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<std.PointerEvent & std.KeyboardEvent & std.TouchEvent, 'altKey' | 'bubbles' | 'cancelable' | 'changedTouches' | 'ctrlKey' | 'detail' | 'eventPhase' | 'metaKey' | 'pageX' | 'pageY' | 'shiftKey' | 'view' | 'char' | 'charCode' | 'key' | 'keyCode' | 'button' | 'buttons' | 'clientX' | 'clientY' | 'offsetX' | 'offsetY' | 'pointerId' | 'pointerType' | 'screenX' | 'screenY' | 'targetTouches' | 'toElement' | 'touches'> ]:? std.Pick<std.PointerEvent & std.KeyboardEvent & std.TouchEvent, 'altKey' | 'bubbles' | 'cancelable' | 'changedTouches' | 'ctrlKey' | 'detail' | 'eventPhase' | 'metaKey' | 'pageX' | 'pageY' | 'shiftKey' | 'view' | 'char' | 'charCode' | 'key' | 'keyCode' | 'button' | 'buttons' | 'clientX' | 'clientY' | 'offsetX' | 'offsetY' | 'pointerId' | 'pointerType' | 'screenX' | 'screenY' | 'targetTouches' | 'toElement' | 'touches'>[P]} */ trait Event[TTarget, TData] extends js.Object {
  /**
    * The current DOM element within the event bubbling phase.
    *
    * @see \`{@link https://api.jquery.com/event.currentTarget/ }\`
    * @since 1.3
    */
  var currentTarget: TTarget
  /**
    * An optional object of data passed to an event method when the current executing handler is bound.
    *
    * @see \`{@link https://api.jquery.com/event.data/ }\`
    * @since 1.1
    */
  var data: TData
  /**
    * The element where the currently-called jQuery event handler was attached.
    *
    * @see \`{@link https://api.jquery.com/event.delegateTarget/ }\`
    * @since 1.7
    */
  var delegateTarget: TTarget
  /**
    * Indicates whether the META key was pressed when the event fired.
    *
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    * @since 1.0.4
    */
  var metaKey: Boolean
  /**
    * The namespace specified when the event was triggered.
    *
    * @see \`{@link https://api.jquery.com/event.namespace/ }\`
    * @since 1.4.3
    */
  var namespace: String
  var originalEvent: _Event
  /**
    * The mouse position relative to the left edge of the document.
    *
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    * @since 1.0.4
    */
  var pageX: Double
  /**
    * The mouse position relative to the top edge of the document.
    *
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    * @since 1.0.4
    */
  var pageY: Double
  /**
    * The other DOM element involved in the event, if any.
    *
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    */
  var relatedTarget: TTarget | Null
  /**
    * The last value returned by an event handler that was triggered by this event, unless the value was undefined.
    *
    * @see \`{@link https://api.jquery.com/event.result/ }\`
    * @since 1.3
    */
  var result: js.Any
  /**
    * The DOM element that initiated the event.
    *
    * @see \`{@link https://api.jquery.com/event.target/ }\`
    * @since 1.0
    */
  var target: TTarget
  /**
    * The difference in milliseconds between the time the browser created the event and January 1, 1970.
    *
    * @see \`{@link https://api.jquery.com/event.timeStamp/ }\`
    * @since 1.2.6
    */
  var timeStamp: Double
  /**
    * Describes the nature of the event.
    *
    * @see \`{@link https://api.jquery.com/event.type/ }\`
    * @since 1.0
    */
  var `type`: String
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    *
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    * @since 1.1.3
    */
  var which: Double
  /**
    * Returns whether event.preventDefault() was ever called on this event object.
    *
    * @see \`{@link https://api.jquery.com/event.isDefaultPrevented/ }\`
    * @since 1.3
    */
  def isDefaultPrevented(): Boolean
  /**
    * Returns whether event.stopImmediatePropagation() was ever called on this event object.
    *
    * @see \`{@link https://api.jquery.com/event.isImmediatePropagationStopped/ }\`
    * @since 1.3
    */
  def isImmediatePropagationStopped(): Boolean
  /**
    * Returns whether event.stopPropagation() was ever called on this event object.
    *
    * @see \`{@link https://api.jquery.com/event.isPropagationStopped/ }\`
    * @since 1.3
    */
  def isPropagationStopped(): Boolean
  /**
    * If this method is called, the default action of the event will not be triggered.
    *
    * @see \`{@link https://api.jquery.com/event.preventDefault/ }\`
    * @since 1.0
    */
  def preventDefault(): Unit
  /**
    * Keeps the rest of the handlers from being executed and prevents the event from bubbling up the DOM tree.
    *
    * @see \`{@link https://api.jquery.com/event.stopImmediatePropagation/ }\`
    * @since 1.3
    */
  def stopImmediatePropagation(): Unit
  /**
    * Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.
    *
    * @see \`{@link https://api.jquery.com/event.stopPropagation/ }\`
    * @since 1.0
    */
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply[TTarget, TData](
    currentTarget: TTarget,
    data: TData,
    delegateTarget: TTarget,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    metaKey: Boolean,
    namespace: String,
    originalEvent: _Event,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    result: js.Any,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String,
    which: Double,
    relatedTarget: TTarget = null
  ): Event[TTarget, TData] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), metaKey = metaKey, namespace = namespace, originalEvent = originalEvent, pageX = pageX, pageY = pageY, preventDefault = js.Any.fromFunction0(preventDefault), result = result, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp, which = which)
    __obj.updateDynamic("type")(`type`)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TTarget, TData]]
  }
}

