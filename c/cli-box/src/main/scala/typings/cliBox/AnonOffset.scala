package typings.cliBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: AnonY
  var text: String
}

object AnonOffset {
  @scala.inline
  def apply(offset: AnonY, text: String): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

