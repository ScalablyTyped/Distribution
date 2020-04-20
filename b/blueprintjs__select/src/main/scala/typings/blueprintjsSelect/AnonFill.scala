package typings.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var fill: Boolean
  var placeholder: String
}

object AnonFill {
  @scala.inline
  def apply(fill: Boolean, placeholder: String): AnonFill = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFill]
  }
}

