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
    clearSelection: () => scala.Unit,
    text: java.lang.String,
    trigger: stdLib.Element
  ): Event = {
    val __obj = js.Dynamic.literal(action = action, clearSelection = js.Any.fromFunction0(clearSelection), text = text, trigger = trigger)
  
    __obj.asInstanceOf[Event]
  }
}

