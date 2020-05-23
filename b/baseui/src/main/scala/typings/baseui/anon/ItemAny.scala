package typings.baseui.anon

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAny extends js.Object {
  var event: typings.std.Event | KeyboardEvent
  var item: js.Any
}

object ItemAny {
  @scala.inline
  def apply(event: typings.std.Event | KeyboardEvent, item: js.Any): ItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
}

