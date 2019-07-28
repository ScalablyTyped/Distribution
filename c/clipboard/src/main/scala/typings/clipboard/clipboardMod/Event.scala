package typings.clipboard.clipboardMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var action: String
  var text: String
  var trigger: Element
  def clearSelection(): Unit
}

object Event {
  @scala.inline
  def apply(action: String, clearSelection: () => Unit, text: String, trigger: Element): Event = {
    val __obj = js.Dynamic.literal(action = action, clearSelection = js.Any.fromFunction0(clearSelection), text = text, trigger = trigger)
  
    __obj.asInstanceOf[Event]
  }
}

