package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisYOptions extends ChartAxisXOptions {
  /**
    * When includeZero is set to true, axisY sets the range in such a way that Zero is a part of it. It is set to true by default.
    * But, whenever y values are very big and difference among dataPoints are hard to judge,
    * setting includeZero to false makes axisY to set a range that makes the differences prominently visible.
    * Default: true
    * Example: true, false
    */
  var includeZero: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAxisYOptions {
  @scala.inline
  def apply(
    gridColor: java.lang.String = null,
    gridDashType: canvasjsLib.DashType = null,
    gridThickness: scala.Int | scala.Double = null,
    includeZero: js.UndefOr[scala.Boolean] = js.undefined,
    interlacedColor: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    intervalType: java.lang.String = null,
    labelAngle: scala.Int | scala.Double = null,
    labelAutoFit: js.UndefOr[scala.Boolean] = js.undefined,
    labelBackgroundColor: java.lang.String = null,
    labelFontColor: java.lang.String = null,
    labelFontFamily: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelFontStyle: java.lang.String = null,
    labelFontWeight: java.lang.String = null,
    labelFormatter: /* e */ canvasjsLib.Anon_AxisChart => java.lang.String = null,
    labelMaxWidth: scala.Int | scala.Double = null,
    labelWrap: js.UndefOr[scala.Boolean] = js.undefined,
    lineColor: java.lang.String = null,
    lineDashType: canvasjsLib.DashType = null,
    lineThickness: scala.Int | scala.Double = null,
    logarithmBase: scala.Int | scala.Double = null,
    logarithmic: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    stripLines: ChartStripLinesOptions | js.Array[ChartStripLinesOptions] = null,
    suffix: java.lang.String = null,
    tickColor: java.lang.String = null,
    tickLength: scala.Int | scala.Double = null,
    tickThickness: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    titleFontColor: java.lang.String = null,
    titleFontFamily: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontStyle: java.lang.String = null,
    titleFontWeight: java.lang.String = null,
    titleMaxWidth: scala.Int | scala.Double = null,
    titleWrap: js.UndefOr[scala.Boolean] = js.undefined,
    valueFormatString: java.lang.String = null,
    viewportMaximum: scala.Int | scala.Double = null,
    viewportMinimum: scala.Int | scala.Double = null
  ): ChartAxisYOptions = {
    val __obj = js.Dynamic.literal()
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor)
    if (gridDashType != null) __obj.updateDynamic("gridDashType")(gridDashType)
    if (gridThickness != null) __obj.updateDynamic("gridThickness")(gridThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(includeZero)) __obj.updateDynamic("includeZero")(includeZero)
    if (interlacedColor != null) __obj.updateDynamic("interlacedColor")(interlacedColor)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType)
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAutoFit)) __obj.updateDynamic("labelAutoFit")(labelAutoFit)
    if (labelBackgroundColor != null) __obj.updateDynamic("labelBackgroundColor")(labelBackgroundColor)
    if (labelFontColor != null) __obj.updateDynamic("labelFontColor")(labelFontColor)
    if (labelFontFamily != null) __obj.updateDynamic("labelFontFamily")(labelFontFamily)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle)
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight)
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1(labelFormatter))
    if (labelMaxWidth != null) __obj.updateDynamic("labelMaxWidth")(labelMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrap)) __obj.updateDynamic("labelWrap")(labelWrap)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType)
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmic)) __obj.updateDynamic("logarithmic")(logarithmic)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (stripLines != null) __obj.updateDynamic("stripLines")(stripLines.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickThickness != null) __obj.updateDynamic("tickThickness")(tickThickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor)
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle)
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight)
    if (titleMaxWidth != null) __obj.updateDynamic("titleMaxWidth")(titleMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(titleWrap)) __obj.updateDynamic("titleWrap")(titleWrap)
    if (valueFormatString != null) __obj.updateDynamic("valueFormatString")(valueFormatString)
    if (viewportMaximum != null) __obj.updateDynamic("viewportMaximum")(viewportMaximum.asInstanceOf[js.Any])
    if (viewportMinimum != null) __obj.updateDynamic("viewportMinimum")(viewportMinimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisYOptions]
  }
}

