package typings.chartist.chartistMod

import typings.chartist.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  var labelOffset: js.UndefOr[Anon_XY] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
}

object ILineChartAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: Anon_XY = null,
    offset: Int | Double = null,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined
  ): ILineChartAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    __obj.asInstanceOf[ILineChartAxis]
  }
}

