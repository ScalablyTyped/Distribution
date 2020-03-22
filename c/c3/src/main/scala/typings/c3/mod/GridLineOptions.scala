package typings.c3.mod

import typings.c3.c3Strings.end
import typings.c3.c3Strings.middle
import typings.c3.c3Strings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLineOptions extends js.Object {
  /** Class to give the grid line for styling. */
  var `class`: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[start | end | middle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  /** Value to place the grid line at. */
  var value: String | Double | Date
}

object GridLineOptions {
  @scala.inline
  def apply(
    value: String | Double | Date,
    `class`: String = null,
    position: start | end | middle = null,
    text: String = null
  ): GridLineOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
}

