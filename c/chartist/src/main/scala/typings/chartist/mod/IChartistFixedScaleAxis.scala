package typings.chartist.mod

import typings.chartist.anon.Y
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
    divisor: js.UndefOr[Double] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    labelInterpolationFnc: js.Function = null,
    labelOffset: Y = null,
    low: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[Double | String] = null,
    `type`: IFixedScaleAxisStatic = null
  ): IChartistFixedScaleAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(divisor)) __obj.updateDynamic("divisor")(divisor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistFixedScaleAxis]
  }
}

