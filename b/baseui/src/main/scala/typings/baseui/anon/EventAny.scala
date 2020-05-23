package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAny extends js.Object {
  var event: js.Any
}

object EventAny {
  @scala.inline
  def apply(event: js.Any): EventAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAny]
  }
}

