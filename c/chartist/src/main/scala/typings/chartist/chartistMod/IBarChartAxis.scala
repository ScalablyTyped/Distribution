package typings.chartist.chartistMod

import typings.chartist.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  var labelOffset: js.UndefOr[Anon_XY] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var scaleMinSpace: js.UndefOr[Double] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
}

object IBarChartAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: Anon_XY = null,
    offset: Int | Double = null,
    onlyInteger: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    scaleMinSpace: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined
  ): IBarChartAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleMinSpace != null) __obj.updateDynamic("scaleMinSpace")(scaleMinSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    __obj.asInstanceOf[IBarChartAxis]
  }
}

