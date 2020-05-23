package typings.chartist.mod

import typings.chartist.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  var labelOffset: js.UndefOr[Y] = js.undefined
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
    labelOffset: Y = null,
    offset: js.UndefOr[Double] = js.undefined,
    onlyInteger: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    scaleMinSpace: js.UndefOr[Double] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined
  ): IBarChartAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleMinSpace)) __obj.updateDynamic("scaleMinSpace")(scaleMinSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarChartAxis]
  }
}

