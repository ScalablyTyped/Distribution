package typings.chartist.chartistMod

import typings.chartist.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistFixedScaleAxis extends ILineChartAxis {
  var divisor: js.UndefOr[Double] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var ticks: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `type`: js.UndefOr[IFixedScaleAxisStatic] = js.undefined
}

object IChartistFixedScaleAxis {
  @scala.inline
  def apply(
    divisor: Int | Double = null,
    high: Int | Double = null,
    labelInterpolationFnc: js.Function = null,
    labelOffset: Anon_XY = null,
    low: Int | Double = null,
    offset: Int | Double = null,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[Double | String] = null,
    `type`: IFixedScaleAxisStatic = null
  ): IChartistFixedScaleAxis = {
    val __obj = js.Dynamic.literal()
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChartistFixedScaleAxis]
  }
}

