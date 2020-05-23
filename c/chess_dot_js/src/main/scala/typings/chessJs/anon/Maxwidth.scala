package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maxwidth extends js.Object {
  /** the maximum width of a line */
  var max_width: js.UndefOr[Double] = js.undefined
  /** Specific newline character */
  var newline_char: js.UndefOr[String] = js.undefined
}

object Maxwidth {
  @scala.inline
  def apply(max_width: js.UndefOr[Double] = js.undefined, newline_char: String = null): Maxwidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max_width)) __obj.updateDynamic("max_width")(max_width.get.asInstanceOf[js.Any])
    if (newline_char != null) __obj.updateDynamic("newline_char")(newline_char.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxwidth]
  }
}

