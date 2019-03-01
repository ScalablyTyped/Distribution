package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendKeyEventParameters extends js.Object {
  /** ID of the context where the key events will be sent, or zero to send key events to non-input field. */
  var contextID: scala.Double
  /** Data on the key event. */
  var keyData: js.Array[KeyboardEvent]
}

object SendKeyEventParameters {
  @scala.inline
  def apply(contextID: scala.Double, keyData: js.Array[KeyboardEvent]): SendKeyEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contextID")(contextID)
    __obj.updateDynamic("keyData")(keyData)
    __obj.asInstanceOf[SendKeyEventParameters]
  }
}

