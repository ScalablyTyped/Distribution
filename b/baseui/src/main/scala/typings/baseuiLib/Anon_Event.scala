package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[
    (reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]) | stdLib.KeyboardEvent
  ] = js.undefined
  var item: js.Any
}

object Anon_Event {
  @scala.inline
  def apply(
    item: js.Any,
    event: (reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]) | stdLib.KeyboardEvent = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(item = item)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Event]
  }
}

