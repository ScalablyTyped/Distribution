package typings.chartist.chartistMod

import typings.chartist.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleChartAxis extends js.Object {
  /**
    * Interpolation function that allows you to intercept the value from the axis label
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  /**
    * Allows you to correct label positioning on this axis by positive or negative x and y offset.
    */
  var labelOffset: js.UndefOr[Anon_XY] = js.undefined
  /**
    * The offset of the chart drawing area to the border of the container
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Position where labels are placed. Can be set to `start` or `end` where `start` is equivalent to left or top on vertical axis and `end` is equivalent to right or bottom on horizontal axis.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * If the axis grid should be drawn or not
    */
  var showGrid: js.UndefOr[Boolean] = js.undefined
  /**
    * If labels should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the axis type to be used to project values on this axis. If not defined, Chartist.StepAxis will be used for the X-Axis, where the ticks option will be set to the labels in the data and the stretch option will be set to the global fullWidth option. This type can be changed to any axis constructor available (e.g. Chartist.FixedScaleAxis), where all axis options should be present here.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object ICandleChartAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: Anon_XY = null,
    offset: Int | Double = null,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    `type`: js.Any = null
  ): ICandleChartAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICandleChartAxis]
  }
}

