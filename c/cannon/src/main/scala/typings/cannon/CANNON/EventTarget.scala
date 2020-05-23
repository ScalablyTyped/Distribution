package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function): EventTarget
  def dispatchEvent(event: IEvent): IEvent
  def hasEventListener(`type`: String, listener: js.Function): Boolean
  def removeEventListener(`type`: String, listener: js.Function): EventTarget
}

object EventTarget {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function) => EventTarget,
    dispatchEvent: IEvent => IEvent,
    hasEventListener: (String, js.Function) => Boolean,
    removeEventListener: (String, js.Function) => EventTarget
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction2(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[EventTarget]
  }
}

