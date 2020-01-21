package typings.chartist.mod

import typings.chartist.AnonXY
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
    high: Int | Double = null,
    labelInterpolationFnc: js.Function = null,
    labelOffset: AnonXY = null,
    low: Int | Double = null,
    offset: Int | Double = null,
    onlyInteger: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    referenceValue: Int | Double = null,
    scaleMinSpace: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    `type`: IAutoScaleAxisStatic = null
  ): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (referenceValue != null) __obj.updateDynamic("referenceValue")(referenceValue.asInstanceOf[js.Any])
    if (scaleMinSpace != null) __obj.updateDynamic("scaleMinSpace")(scaleMinSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
}

