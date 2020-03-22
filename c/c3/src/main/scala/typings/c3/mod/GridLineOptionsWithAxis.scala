package typings.c3.mod

import typings.c3.c3Strings.end
import typings.c3.c3Strings.middle
import typings.c3.c3Strings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLineOptionsWithAxis extends GridLineOptions {
  var axis: js.UndefOr[AxisName] = js.undefined
}

object GridLineOptionsWithAxis {
  @scala.inline
  def apply(
    value: String | Double | Date,
    axis: AxisName = null,
    `class`: String = null,
    position: start | end | middle = null,
    text: String = null
  ): GridLineOptionsWithAxis = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptionsWithAxis]
  }
}

