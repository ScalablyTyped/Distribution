package typings.blueprintjsSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends js.Object {
  var fill: Boolean
  var placeholder: String
}

object Fill {
  @scala.inline
  def apply(fill: Boolean, placeholder: String): Fill = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

