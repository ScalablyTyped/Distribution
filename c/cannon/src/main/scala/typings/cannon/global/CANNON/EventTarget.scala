package typings.cannon.global.CANNON

import typings.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.EventTarget")
@js.native
class EventTarget ()
  extends typings.cannon.CANNON.EventTarget {
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
}

