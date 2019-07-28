package typings.c3.c3Mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOptions extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String | Double | Date] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String | Double | Date] = js.undefined
}

object RegionOptions {
  @scala.inline
  def apply(
    axis: String = null,
    `class`: String = null,
    end: String | Double | Date = null,
    opacity: Int | Double = null,
    start: String | Double | Date = null
  ): RegionOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionOptions]
  }
}

