package typings.canvasjs.mod

import typings.canvasjs.anon.Label
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
    gridThickness: js.UndefOr[Double] = js.undefined,
    includeZero: js.UndefOr[Boolean] = js.undefined,
    interlacedColor: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    intervalType: String = null,
    labelAngle: js.UndefOr[Double] = js.undefined,
    labelAutoFit: js.UndefOr[Boolean] = js.undefined,
    labelBackgroundColor: String = null,
    labelFontColor: String = null,
    labelFontFamily: String = null,
    labelFontSize: js.UndefOr[Double] = js.undefined,
    labelFontStyle: String = null,
    labelFontWeight: String = null,
    labelFormatter: /* e */ Label => String = null,
    labelMaxWidth: js.UndefOr[Double] = js.undefined,
    labelWrap: js.UndefOr[Boolean] = js.undefined,
    lineColor: String = null,
    lineDashType: DashType = null,
    lineThickness: js.UndefOr[Double] = js.undefined,
    logarithmBase: js.UndefOr[Double] = js.undefined,
    logarithmic: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    stripLines: ChartStripLinesOptions | js.Array[ChartStripLinesOptions] = null,
    suffix: String = null,
    tickColor: String = null,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickThickness: js.UndefOr[Double] = js.undefined,
    title: String = null,
    titleFontColor: String = null,
    titleFontFamily: String = null,
    titleFontSize: js.UndefOr[Double] = js.undefined,
    titleFontStyle: String = null,
    titleFontWeight: String = null,
    titleMaxWidth: js.UndefOr[Double] = js.undefined,
    titleWrap: js.UndefOr[Boolean] = js.undefined,
    valueFormatString: String = null,
    viewportMaximum: js.UndefOr[Double] = js.undefined,
    viewportMinimum: js.UndefOr[Double] = js.undefined
  ): ChartAxisYOptions = {
    val __obj = js.Dynamic.literal()
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (gridDashType != null) __obj.updateDynamic("gridDashType")(gridDashType.asInstanceOf[js.Any])
    if (!js.isUndefined(gridThickness)) __obj.updateDynamic("gridThickness")(gridThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeZero)) __obj.updateDynamic("includeZero")(includeZero.get.asInstanceOf[js.Any])
    if (interlacedColor != null) __obj.updateDynamic("interlacedColor")(interlacedColor.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAngle)) __obj.updateDynamic("labelAngle")(labelAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAutoFit)) __obj.updateDynamic("labelAutoFit")(labelAutoFit.get.asInstanceOf[js.Any])
    if (labelBackgroundColor != null) __obj.updateDynamic("labelBackgroundColor")(labelBackgroundColor.asInstanceOf[js.Any])
    if (labelFontColor != null) __obj.updateDynamic("labelFontColor")(labelFontColor.asInstanceOf[js.Any])
    if (labelFontFamily != null) __obj.updateDynamic("labelFontFamily")(labelFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(labelFontSize)) __obj.updateDynamic("labelFontSize")(labelFontSize.get.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle.asInstanceOf[js.Any])
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1(labelFormatter))
    if (!js.isUndefined(labelMaxWidth)) __obj.updateDynamic("labelMaxWidth")(labelMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrap)) __obj.updateDynamic("labelWrap")(labelWrap.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType.asInstanceOf[js.Any])
    if (!js.isUndefined(lineThickness)) __obj.updateDynamic("lineThickness")(lineThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmBase)) __obj.updateDynamic("logarithmBase")(logarithmBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmic)) __obj.updateDynamic("logarithmic")(logarithmic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (stripLines != null) __obj.updateDynamic("stripLines")(stripLines.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickThickness)) __obj.updateDynamic("tickThickness")(tickThickness.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor.asInstanceOf[js.Any])
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(titleFontSize)) __obj.updateDynamic("titleFontSize")(titleFontSize.get.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(titleMaxWidth)) __obj.updateDynamic("titleMaxWidth")(titleMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleWrap)) __obj.updateDynamic("titleWrap")(titleWrap.get.asInstanceOf[js.Any])
    if (valueFormatString != null) __obj.updateDynamic("valueFormatString")(valueFormatString.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportMaximum)) __obj.updateDynamic("viewportMaximum")(viewportMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportMinimum)) __obj.updateDynamic("viewportMinimum")(viewportMinimum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisYOptions]
  }
}

