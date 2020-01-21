package typings.canvasjs.mod

import typings.canvasjs.AnonAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStripLinesOptions extends js.Object {
  /**
    * Sets the color of the stripLine.
    * Default: "orange"
    * Example: "green", "#23EA23"
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Sets the point where the stripLine’s shaded region ends on the x-axis.
    * Default: null
    * Example: 50,60,200,300
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /**
    * Sets the label of the stripLine. These are shown on top of axis labels.
    * Default: "" (empty string)
    * Example: "Threshold", "Deaths in 1920"
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * labelAlign allows you to place the stripline’s Label far, center or near the axis.
    * Default: “far”
    * Options: “far”, “center”, “near”
    */
  var labelAlign: js.UndefOr[String] = js.undefined
  /**
    * Sets the background color of stripLine’s label.
    * Default: "#eeeeee"
    * Example: "red","#fabd76"
    */
  var labelBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the font color of label.
    * Default: "orange"
    * Example: "blue","#4135e9"
    */
  var labelFontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the font-family of stripLine’s label. If the first font is not found in the system from the specified font-family list, it tries to use the next font in the list.
    * Default: "arial"
    * Example: "Arial, Trebuchet MS, Tahoma, sans-serif"
    */
  var labelFontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the font size of the label in pixels.
    * Default: 12
    * Example: 18,19,20,22
    */
  var labelFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font style of stripLine’s label.
    * Default: "normal"
    * Example: "normal","italic","oblique"
    */
  var labelFontStyle: js.UndefOr[String] = js.undefined
  /**
    * Sets the font weight of stripLine’s label.
    * Default: "normal"
    * Example: "lighter","normal","bold","bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.undefined
  /**
    * A custom formatter function that returns stripLine’s label.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[AnonAxis], String]] = js.undefined
  /**
    * labelMaxWidth defines the maximum width of labels after which they get wrapped or clipped depending on labelWrap’s value.
    * It overrides the labelMaxWidth value set at axis level.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: Double
  /**
    * labelPlacement allows you to place stripline’s Label either inside or outside of plotArea.
    * Default: “inside”
    * Options: “inside”, “outside”
    */
  var labelPlacement: js.UndefOr[String] = js.undefined
  /**
    * Setting labelWrap to true wraps the labels at labelMaxWidth. Clips the same when set to false. It overrides the labelWrap set at axis level.
    * Default: true
    * Example: true, false.
    */
  var labelWrap: Boolean
  /**
    * Sets the Dash Type for stripLine.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Sets opacity of stripLine.
    * Default: null
    * Example: .1, .5, 1 etc.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * stripLine is displayed on top of dataPoints when showOnTop is set to true.
    * Default: false
    * Example: true, false
    */
  var showOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the point where the stripLine’s shaded region begins on the x-axis.
    * Default: null
    * Example: 20,30,100,50
    */
  var startValue: js.UndefOr[Double] = js.undefined
  /**
    * Sets the thickness of the stripLine in pixels.
    * Default: 2
    * Example: 2,4,5,6
    */
  var thickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the point where the stripLine has to be plotted or drawn along the axis X.
    * Default: null
    * Example: 20,30,100,50
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ChartStripLinesOptions {
  @scala.inline
  def apply(
    labelMaxWidth: Double,
    labelWrap: Boolean,
    color: String = null,
    endValue: Int | Double = null,
    label: String = null,
    labelAlign: String = null,
    labelBackgroundColor: String = null,
    labelFontColor: String = null,
    labelFontFamily: String = null,
    labelFontSize: Int | Double = null,
    labelFontStyle: String = null,
    labelFontWeight: String = null,
    labelFormatter: /* e */ js.UndefOr[AnonAxis] => String = null,
    labelPlacement: String = null,
    lineDashType: DashType = null,
    opacity: Int | Double = null,
    showOnTop: js.UndefOr[Boolean] = js.undefined,
    startValue: Int | Double = null,
    thickness: Int | Double = null,
    value: Int | Double = null
  ): ChartStripLinesOptions = {
    val __obj = js.Dynamic.literal(labelMaxWidth = labelMaxWidth.asInstanceOf[js.Any], labelWrap = labelWrap.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelBackgroundColor != null) __obj.updateDynamic("labelBackgroundColor")(labelBackgroundColor.asInstanceOf[js.Any])
    if (labelFontColor != null) __obj.updateDynamic("labelFontColor")(labelFontColor.asInstanceOf[js.Any])
    if (labelFontFamily != null) __obj.updateDynamic("labelFontFamily")(labelFontFamily.asInstanceOf[js.Any])
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle.asInstanceOf[js.Any])
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1(labelFormatter))
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnTop)) __obj.updateDynamic("showOnTop")(showOnTop.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStripLinesOptions]
  }
}

