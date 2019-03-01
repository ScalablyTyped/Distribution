package typings
package clipboardLib.clipboardMod.ClipboardJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var action: java.lang.String
  var text: java.lang.String
  var trigger: stdLib.Element
  def clearSelection(): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    action: java.lang.String,
    clearSelection: js.Function0[scala.Unit],
    text: java.lang.String,
    trigger: stdLib.Element
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("clearSelection")(clearSelection)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[Event]
  }
}

