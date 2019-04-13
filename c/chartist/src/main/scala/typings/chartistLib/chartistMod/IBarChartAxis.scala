package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  var labelOffset: js.UndefOr[chartistLib.Anon_X] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onlyInteger: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var scaleMinSpace: js.UndefOr[scala.Double] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object IBarChartAxis {
  @scala.inline
  def apply(
    labelInterpolationFnc: js.Function = null,
    labelOffset: chartistLib.Anon_X = null,
    offset: scala.Int | scala.Double = null,
    onlyInteger: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    scaleMinSpace: scala.Int | scala.Double = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined
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

