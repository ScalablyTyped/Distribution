package typings.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var border: js.Array[String]
  var compact: Boolean
  var head: js.Array[String]
  var `padding-left`: Double
  var `padding-right`: Double
}

object AnonBorder {
  @scala.inline
  def apply(
    border: js.Array[String],
    compact: Boolean,
    head: js.Array[String],
    `padding-left`: Double,
    `padding-right`: Double
  ): AnonBorder = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorder]
  }
}

