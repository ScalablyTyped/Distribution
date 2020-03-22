package typings.canvasjs.mod

import typings.canvasjs.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisXOptions extends ChartAxisOptions {
  /**
    * Sets the Color of Grid Lines. Value of gridColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#FEFDDF" ..
    */
  var gridColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Dash Type for grid lines on axisX.
    * Default: solid
    */
  var gridDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Sets the Thickness of Grid Lines. To display grid on Axis X, set the Grid Thickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var gridThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Interlacing Color that alternates between the set interval.
    * If the interval is not set explicitly, then the auto calculated interval is considered. The value of interlacedColor can be a “HTML Color Name” or “hex” code.
    * Default: null
    * Example: "#F8F1E4", "#FEFDDF"...
    */
  var interlacedColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the distance between Tick Marks, Grid Lines and Interlaced Colors.
    * Default: Automatically Calculated
    * Example: 50, 75..
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * intervalType is the unit of interval property.
    *  intervalType is by default set to "number" and hence you need to specify the interval type (eg "week", "month", etc) depending on the type of interval you intend to set.
    * If required interval is 3 months, you need to provide interval as 3 and intervalType as "month"
    * Default: Automatically handled when interval property is not set. Defaults to "number" when you set the interval.
    * Option: "number","millisecond" ,"second"," minute", "hour", "day", "month" ,"year"
    * Example: for interval as 15 minutes, set interval as 15, and set intervalType as "minute",
    */
  var intervalType: js.UndefOr[String] = js.undefined
  /**
    * Sets the angle for Axis Labels.
    * Notes:
    * 1.Units in degrees.
    * 2.Values can be positive or negative.
    * Default: null;
    * Example: 20, 45, -30..
    */
  var labelAngle: js.UndefOr[Double] = js.undefined
  /**
    * Setting labelAutoFit to true automatically wraps and/or rotates and/or reduces font size of label when they are too long and overlaps,
    * finds the best-fit and automatically manages label overlapping.
    * Default: true
    * Options: true, false
    */
  var labelAutoFit: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the Axis Label background color. The value of labelBackgroundColor can be a “HTML Color Name” or “hex” code.
    * Default: “transparent”
    * Example: “red”,”#fabd76″
    */
  var labelBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Axis Label color. The value of labelFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var labelFontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Family of Axis labels.
    * Default: “calibri, optima, Candara, Verdana, Geneva, sans-serif”
    * Example: “calibri”, “tahoma”, “verdana” ..
    */
  var labelFontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the Axis Label Font Size in pixels.
    * Default: Automatically Calculated based on Chart Size
    * Example: 16, 18, 22..
    */
  var labelFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Font Style of Axis Labels. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var labelFontStyle: js.UndefOr[String] = js.undefined
  /**
    * Set the font Weight used in Axis Labels. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.undefined
  /**
    * A custom formatter function that returns label to be displayed on axisX.
    * Notes:
    * 1.labelFormatter function should return a string.
    * 2.You can use formatNumber and formatDate functions to format number/date values inside the formatter function.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ AnonLabel, String]] = js.undefined
  /**
    * Sets the maximum width of label after which it gets wrapped or clipped depending on whether labelWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * labelWrap specifies whether to wrap or clip label once its width crosses labelMaxWidth.
    * Default: true
    * Example: true, false
    */
  var labelWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the logarithm base for Axis X. Works only when logarithm property is set to true.
    * Default: 10
    * Options: 2, 16, Math.E, ..
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /**
    * Setting logarithmic property to true changes axis scale to logarithmic scale. Default Logarithm Base is 10 – which you can customize using logarithmBase property.
    * Default: false
    * Options: true, false
    */
  var logarithmic: js.UndefOr[Boolean] = js.undefined
  /**
    * A string that prepends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Setting reversed property to true shows axis in reverse order.
    * Default: false
    * Options: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * Strip Lines / Trend Lines are vertical or horizontal lines used to highlight/mark a certain region on the plot area.
    * You can choose whether to draw a line at a specific position or shade a region on the plot area. Strip Lines are also referred to as Trend Lines.
    */
  var stripLines: js.UndefOr[ChartStripLinesOptions | js.Array[ChartStripLinesOptions]] = js.undefined
  /**
    * A string that appends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Sets the color of Tick Marks drawn on the axis. The value of tickColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#006400".
    */
  var tickColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the length of Tick Marks that are drawn on the Axis.
    * Default: 5
    * Example: 10, 14..
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  /**
    * Sets the thickness of the Tick Marks in pixels.
    * Default: 2
    * Example: 3, 4..
    */
  var tickThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether titleWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of axis.
    * Example: 100, 200...
    */
  var titleMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * TitleWrap specifies whether to wrap or clip axis title once its width crosses titleMaxWidth.
    * Default: true
    * Options: true, false
    */
  var titleWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines how values must be formatted before they appear on Axis X.
    * You can format numbers and date time values using this property.
    * More Detail: https://canvasjs.com/docs/charts/chart-options/axisx/valueformatstring/
    */
  var valueFormatString: js.UndefOr[String] = js.undefined
}

object ChartAxisXOptions {
  @scala.inline
  def apply(
    gridColor: String = null,
    gridDashType: DashType = null,
    gridThickness: Int | Double = null,
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
    labelFormatter: /* e */ AnonLabel => String = null,
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
  ): ChartAxisXOptions = {
    val __obj = js.Dynamic.literal()
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (gridDashType != null) __obj.updateDynamic("gridDashType")(gridDashType.asInstanceOf[js.Any])
    if (gridThickness != null) __obj.updateDynamic("gridThickness")(gridThickness.asInstanceOf[js.Any])
    if (interlacedColor != null) __obj.updateDynamic("interlacedColor")(interlacedColor.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAutoFit)) __obj.updateDynamic("labelAutoFit")(labelAutoFit.asInstanceOf[js.Any])
    if (labelBackgroundColor != null) __obj.updateDynamic("labelBackgroundColor")(labelBackgroundColor.asInstanceOf[js.Any])
    if (labelFontColor != null) __obj.updateDynamic("labelFontColor")(labelFontColor.asInstanceOf[js.Any])
    if (labelFontFamily != null) __obj.updateDynamic("labelFontFamily")(labelFontFamily.asInstanceOf[js.Any])
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle.asInstanceOf[js.Any])
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1(labelFormatter))
    if (labelMaxWidth != null) __obj.updateDynamic("labelMaxWidth")(labelMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrap)) __obj.updateDynamic("labelWrap")(labelWrap.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmic)) __obj.updateDynamic("logarithmic")(logarithmic.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (stripLines != null) __obj.updateDynamic("stripLines")(stripLines.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickThickness != null) __obj.updateDynamic("tickThickness")(tickThickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor.asInstanceOf[js.Any])
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleMaxWidth != null) __obj.updateDynamic("titleMaxWidth")(titleMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(titleWrap)) __obj.updateDynamic("titleWrap")(titleWrap.asInstanceOf[js.Any])
    if (valueFormatString != null) __obj.updateDynamic("valueFormatString")(valueFormatString.asInstanceOf[js.Any])
    if (viewportMaximum != null) __obj.updateDynamic("viewportMaximum")(viewportMaximum.asInstanceOf[js.Any])
    if (viewportMinimum != null) __obj.updateDynamic("viewportMinimum")(viewportMinimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisXOptions]
  }
}

