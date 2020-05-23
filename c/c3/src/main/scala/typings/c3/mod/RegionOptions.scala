package typings.c3.mod

import typings.c3.c3Strings.dashed
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOptions extends js.Object {
  /**
    * The axis on which `start` and `end` values lie.
    */
  var axis: js.UndefOr[AxisName] = js.undefined
  /**
    * An optional class to apply to the region, which can be used for styling
    * or targeting.
    */
  var `class`: js.UndefOr[String] = js.undefined
  /**
    * The point on the axis at which to end the region. If not provided, will
    * use the end edge of the axis.
    */
  var end: js.UndefOr[String | Double | Date] = js.undefined
  /**
    * Control the opacity of the region area.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The point on the axis at which to start the region. If not provided, will
    * use the start edge of the axis.
    */
  var start: js.UndefOr[String | Double | Date] = js.undefined
  /**
    * If `'dashed'`, renders the line as dashed in this range instead of showing a region block.
    */
  var style: js.UndefOr[dashed] = js.undefined
}

object RegionOptions {
  @scala.inline
  def apply(
    axis: AxisName = null,
    `class`: String = null,
    end: String | Double | Date = null,
    opacity: js.UndefOr[Double] = js.undefined,
    start: String | Double | Date = null,
    style: dashed = null
  ): RegionOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionOptions]
  }
}

