package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventAny extends js.Object {
  var event: js.Any
}

object AnonEventAny {
  @scala.inline
  def apply(event: js.Any): AnonEventAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventAny]
  }
}

