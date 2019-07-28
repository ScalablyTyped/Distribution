package typings.chartist.chartistMod

import typings.chartist.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistStepAxis extends ILineChartAxis {
  var stretch: js.UndefOr[Boolean] = js.undefined
  var ticks: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `type`: js.UndefOr[IStepAxisStatic] = js.undefined
}

object IChartistStepAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: Anon_XY = null,
    offset: Int | Double = null,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    stretch: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[Double | String] = null,
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
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChartistStepAxis]
  }
}

