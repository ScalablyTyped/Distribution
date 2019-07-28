package typings.c3.c3Mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: String | Double | Date
}

object LineOptions {
  @scala.inline
  def apply(
    value: String | Double | Date,
    axis: String = null,
    `class`: String = null,
    position: String = null,
    text: String = null
  ): LineOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LineOptions]
  }
}

