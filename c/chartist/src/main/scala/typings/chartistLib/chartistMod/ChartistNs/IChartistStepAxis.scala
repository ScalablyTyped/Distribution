package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistStepAxis extends ILineChartAxis {
  var stretch: js.UndefOr[scala.Boolean] = js.undefined
  var ticks: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  var `type`: js.UndefOr[IStepAxisStatic] = js.undefined
}

object IChartistStepAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: chartistLib.Anon_X = null,
    offset: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    stretch: js.UndefOr[scala.Boolean] = js.undefined,
    ticks: js.Array[java.lang.String] | js.Array[scala.Double] = null,
    `type`: IStepAxisStatic = null
  ): IChartistStepAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChartistStepAxis]
  }
}

