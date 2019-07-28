package typings.canvasjs.canvasjsMod

import typings.canvasjs.Anon_AxisChart
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
  var includeZero: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisYOptions {
  @scala.inline
  def apply(
    gridColor: String = null,
    gridDashType: DashType = null,
    gridThickness: Int | Double = null,
    includeZero: js.UndefOr[Boolean] = js.undefined,
    interlacedColor: String = null,
    interval: Int | Double = null,
    intervalType: String = null,
    labelAngle: Int | Double = null,
    labelAutoFit: js.UndefOr[Boolean] = js.undefined,
    labelBackgroundColor: String = null,
    labelFontColor: String = null,
    labelFontFamily: String = null,
    labelFontSize: Int | Double = null,
    labelFontStyle: String = null,
    labelFontWeight: String = null,
    labelFormatter: /* e */ Anon_AxisChart => String = null,
    labelMaxWidth: Int | Double = null,
    labelWrap: js.UndefOr[Boolean] = js.undefined,
    lineColor: String = null,
    lineDashType: DashType = null,
    lineThickness: Int | Double = null,
    logarithmBase: Int | Double = null,
    logarithmic: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    prefix: String = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    stripLines: ChartStripLinesOptions | js.Array[ChartStripLinesOptions] = null,
    suffix: String = null,
    tickColor: String = null,
    tickLength: Int | Double = null,
    tickThickness: Int | Double = null,
    title: String = null,
    titleFontColor: String = null,
    titleFontFamily: String = null,
    titleFontSize: Int | Double = null,
    titleFontStyle: String = null,
    titleFontWeight: String = null,
    titleMaxWidth: Int | Double = null,
    titleWrap: js.UndefOr[Boolean] = js.undefined,
    valueFormatString: String = null,
    viewportMaximum: Int | Double = null,
    viewportMinimum: Int | Double = null
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

