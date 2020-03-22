package typings.createjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Boolean
}

object AnonHandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => Boolean): AnonHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[AnonHandleEvent]
  }
}

