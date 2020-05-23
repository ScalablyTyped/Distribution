package typings.cannon.global.CANNON

import typings.cannon.CANNON.IBodyOptions
import typings.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Body")
@js.native
class Body ()
  extends typings.cannon.CANNON.Body {
  def this(options: IBodyOptions) = this()
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
}

/* static members */
@JSGlobal("CANNON.Body")
@js.native
object Body extends js.Object {
  var AWAKE: Double = js.native
  var DYNAMIC: Double = js.native
  var KINEMATIC: Double = js.native
  var SLEEPING: Double = js.native
  var SLEEPY: Double = js.native
  var STATIC: Double = js.native
  var sleepEvent: IEvent = js.native
  var sleepyEvent: IEvent = js.native
}

