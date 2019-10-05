package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.EventTarget")
@js.native
class EventTarget () extends js.Object {
  def addEventListener(`type`: String, listener: js.Function): EventTarget = js.native
  def dispatchEvent(event: IEvent): IEvent = js.native
  def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Function): EventTarget = js.native
}

