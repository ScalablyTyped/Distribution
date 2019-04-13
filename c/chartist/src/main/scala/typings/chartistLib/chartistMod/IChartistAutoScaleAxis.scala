package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistAutoScaleAxis extends ILineChartAxis {
  var high: js.UndefOr[scala.Double] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var onlyInteger: js.UndefOr[scala.Boolean] = js.undefined
  var referenceValue: js.UndefOr[scala.Double] = js.undefined
  var scaleMinSpace: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.undefined
}

object IChartistAutoScaleAxis {
  @scala.inline
  def apply(
    high: scala.Int | scala.Double = null,
    labelInterpolationFnc: js.Function = null,
    labelOffset: chartistLib.Anon_X = null,
    low: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onlyInteger: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    referenceValue: scala.Int | scala.Double = null,
    scaleMinSpace: scala.Int | scala.Double = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: IAutoScaleAxisStatic = null
  ): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (labelInterpolationFnc != null) __obj.updateDynamic("labelInterpolationFnc")(labelInterpolationFnc)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset)
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyInteger)) __obj.updateDynamic("onlyInteger")(onlyInteger)
    if (position != null) __obj.updateDynamic("position")(position)
    if (referenceValue != null) __obj.updateDynamic("referenceValue")(referenceValue.asInstanceOf[js.Any])
    if (scaleMinSpace != null) __obj.updateDynamic("scaleMinSpace")(scaleMinSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
}

