package typings.chartist.mod

import typings.chartist.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistAutoScaleAxis extends ILineChartAxis {
  var high: js.UndefOr[Double] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  var referenceValue: js.UndefOr[Double] = js.undefined
  var scaleMinSpace: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.undefined
}

object IChartistAutoScaleAxis {
  @scala.inline
  def apply(
    high: js.UndefOr[Double] = js.undefined,
    labelInterpolationFnc: js.Function = null,
    labelOffset: Y = null,
    low: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onlyInteger: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    referenceValue: js.UndefOr[Double] = js.undefined,
    scaleMinSpace: js.UndefOr[Double] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    `type`: IAutoScaleAxisStatic = null
  ): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceValue)) __obj.updateDynamic("referenceValue")(referenceValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleMinSpace)) __obj.updateDynamic("scaleMinSpace")(scaleMinSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
}

