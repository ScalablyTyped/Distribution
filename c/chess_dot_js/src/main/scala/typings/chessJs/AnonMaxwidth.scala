package typings.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxwidth extends js.Object {
  /** the maximum width of a line */
  var max_width: js.UndefOr[Double] = js.undefined
  /** Specific newline character */
  var newline_char: js.UndefOr[String] = js.undefined
}

object AnonMaxwidth {
  @scala.inline
  def apply(max_width: Int | Double = null, newline_char: String = null): AnonMaxwidth = {
    val __obj = js.Dynamic.literal()
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (newline_char != null) __obj.updateDynamic("newline_char")(newline_char.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxwidth]
  }
}

