package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#events/event-object
  */
trait AbstractEventObject extends js.Object {
  /** a reference to the corresponding core Core */
  var cy: Core
  /** the event namespace string (e.g. "foo" for "foo.tap") */
  var namespace: String
  /** indicates the element or core that first caused the event */
  var target: js.Any
  /** Unix epoch time of event in milliseconds */
  var timeStamp: Double
  /** the event type string (e.g. "tap") */
  var `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object AbstractEventObject {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    namespace: String,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): AbstractEventObject = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), namespace = namespace.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractEventObject]
  }
}

