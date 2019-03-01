package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistFixedScaleAxis extends ILineChartAxis {
  var divisor: js.UndefOr[scala.Double] = js.undefined
  var high: js.UndefOr[scala.Double] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var ticks: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  var `type`: js.UndefOr[IFixedScaleAxisStatic] = js.undefined
}

object IChartistFixedScaleAxis {
  @scala.inline
  def apply(
    divisor: scala.Int | scala.Double = null,
    high: scala.Int | scala.Double = null,
    labelInterpolationFnc: js.Function = null,
    labelOffset: chartistLib.Anon_X = null,
    low: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    ticks: js.Array[java.lang.String] | js.Array[scala.Double] = null,
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
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChartistFixedScaleAxis]
  }
}

