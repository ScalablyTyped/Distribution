package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.EventTarget")
@js.native
class EventTarget () extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: js.Function): EventTarget = js.native
  def dispatchEvent(event: IEvent): IEvent = js.native
  def hasEventListener(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function): EventTarget = js.native
}

