package typings.chartist.mod

import typings.chartist.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  var labelOffset: js.UndefOr[AnonY] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
}

object ILineChartAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: AnonY = null,
    offset: Int | Double = null,
    position: String = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined
  ): ILineChartAxis = {
    val __obj = js.Dynamic.literal()
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChartAxis]
  }
}

