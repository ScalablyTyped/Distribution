package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maxwidth extends js.Object {
  /** the maximum width of a line */
  var max_width: js.UndefOr[scala.Double] = js.undefined
  /** Specific newline character */
  var newline_char: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Maxwidth {
  @scala.inline
  def apply(max_width: scala.Int | scala.Double = null, newline_char: java.lang.String = null): Anon_Maxwidth = {
    val __obj = js.Dynamic.literal()
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (newline_char != null) __obj.updateDynamic("newline_char")(newline_char)
    __obj.asInstanceOf[Anon_Maxwidth]
  }
}

