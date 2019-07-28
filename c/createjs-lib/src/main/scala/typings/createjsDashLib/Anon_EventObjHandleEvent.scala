package typings.createjsDashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventObjHandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Unit
}

object Anon_EventObjHandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => Unit): Anon_EventObjHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[Anon_EventObjHandleEvent]
  }
}

