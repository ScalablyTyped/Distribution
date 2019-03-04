package typings
package createjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventObjHandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): scala.Unit
}

object Anon_EventObjHandleEvent {
  @scala.inline
  def apply(handleEvent: js.Function1[js.Object, scala.Unit]): Anon_EventObjHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = handleEvent)
  
    __obj.asInstanceOf[Anon_EventObjHandleEvent]
  }
}

