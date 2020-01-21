package typings.canvasjs.mod

import typings.canvasjs.AnonChartDataPoint
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataPoint extends ChartDataCommon {
  /**
    * Sets the exploded value of dataPoint. It is applicable only in case of Pie and Doughnut Charts. This property causes the Pie/Doughnut slice to separate out.
    * Default: true
    * Example: true, false
    */
  var exploded: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets label value of a dataPoint. The value appears next to the dataPoint on axisX Line. If not provided, it takes x value for label.
    * Default: x value
    * Example: "label1", "label2"..
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Sets the x value. It determines the position of the dataPoint on X Axis. It can be numeric or a dateTime value. Values can be positive or Negative.
    * If no x value is provided, they are automatically set sequentially starting from zero
    * Default: null
    * Example: 10, 20, 30 ..
    * new Date(2011, 08, 01)
    */
  var x: js.UndefOr[Double | Date] = js.undefined
  /**
    * Sets the y value of dataPoint. It determines the position of dataPoint on Y Axis. Values can be positive or Negative
    * Default: null
    * Example: 5, 20, -30 ..
    */
  var y: js.UndefOr[Double | Null] = js.undefined
  /**
    * Sets the z value of dataPoint. It is only applicable in case of Bubble chart. This value determines the size of the bubble.
    * Default: 1
    * Example: 10, 20, 35..
    */
  var z: js.UndefOr[Double] = js.undefined
}

object ChartDataPoint {
  @scala.inline
  def apply(
    click: /* event */ ChartEvent => Unit = null,
    color: String = null,
    exploded: js.UndefOr[Boolean] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    indexLabel: String = null,
    indexLabelBackgroundColor: String = null,
    indexLabelFontColor: String = null,
    indexLabelFontFamily: String = null,
    indexLabelFontSize: Int | Double = null,
    indexLabelFontStyle: String = null,
    indexLabelFontWeight: String = null,
    indexLabelFormatter: /* e */ AnonChartDataPoint => String = null,
    indexLabelLineColor: String = null,
    indexLabelLineDashType: DashType = null,
    indexLabelLineThickness: Int | Double = null,
    indexLabelOrientation: String = null,
    indexLabelPlacement: String = null,
    label: String = null,
    legendMarkerBorderColor: String = null,
    legendMarkerBorderThickness: Int | Double = null,
    legendMarkerColor: String = null,
    legendMarkerType: String = null,
    legendText: String = null,
    markerBorderColor: String = null,
    markerBorderThickness: Int | Double = null,
    markerColor: String = null,
    markerSize: Int | Double = null,
    markerType: String = null,
    mousemove: /* event */ ChartEvent => Unit = null,
    mouseout: /* event */ ChartEvent => Unit = null,
    mouseover: /* event */ ChartEvent => Unit = null,
    name: String = null,
    toolTipContent: String = null,
    x: Double | Date = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): ChartDataPoint = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(exploded)) __obj.updateDynamic("exploded")(exploded.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel.asInstanceOf[js.Any])
    if (indexLabelBackgroundColor != null) __obj.updateDynamic("indexLabelBackgroundColor")(indexLabelBackgroundColor.asInstanceOf[js.Any])
    if (indexLabelFontColor != null) __obj.updateDynamic("indexLabelFontColor")(indexLabelFontColor.asInstanceOf[js.Any])
    if (indexLabelFontFamily != null) __obj.updateDynamic("indexLabelFontFamily")(indexLabelFontFamily.asInstanceOf[js.Any])
    if (indexLabelFontSize != null) __obj.updateDynamic("indexLabelFontSize")(indexLabelFontSize.asInstanceOf[js.Any])
    if (indexLabelFontStyle != null) __obj.updateDynamic("indexLabelFontStyle")(indexLabelFontStyle.asInstanceOf[js.Any])
    if (indexLabelFontWeight != null) __obj.updateDynamic("indexLabelFontWeight")(indexLabelFontWeight.asInstanceOf[js.Any])
    if (indexLabelFormatter != null) __obj.updateDynamic("indexLabelFormatter")(js.Any.fromFunction1(indexLabelFormatter))
    if (indexLabelLineColor != null) __obj.updateDynamic("indexLabelLineColor")(indexLabelLineColor.asInstanceOf[js.Any])
    if (indexLabelLineDashType != null) __obj.updateDynamic("indexLabelLineDashType")(indexLabelLineDashType.asInstanceOf[js.Any])
    if (indexLabelLineThickness != null) __obj.updateDynamic("indexLabelLineThickness")(indexLabelLineThickness.asInstanceOf[js.Any])
    if (indexLabelOrientation != null) __obj.updateDynamic("indexLabelOrientation")(indexLabelOrientation.asInstanceOf[js.Any])
    if (indexLabelPlacement != null) __obj.updateDynamic("indexLabelPlacement")(indexLabelPlacement.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legendMarkerBorderColor != null) __obj.updateDynamic("legendMarkerBorderColor")(legendMarkerBorderColor.asInstanceOf[js.Any])
    if (legendMarkerBorderThickness != null) __obj.updateDynamic("legendMarkerBorderThickness")(legendMarkerBorderThickness.asInstanceOf[js.Any])
    if (legendMarkerColor != null) __obj.updateDynamic("legendMarkerColor")(legendMarkerColor.asInstanceOf[js.Any])
    if (legendMarkerType != null) __obj.updateDynamic("legendMarkerType")(legendMarkerType.asInstanceOf[js.Any])
    if (legendText != null) __obj.updateDynamic("legendText")(legendText.asInstanceOf[js.Any])
    if (markerBorderColor != null) __obj.updateDynamic("markerBorderColor")(markerBorderColor.asInstanceOf[js.Any])
    if (markerBorderThickness != null) __obj.updateDynamic("markerBorderThickness")(markerBorderThickness.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerType != null) __obj.updateDynamic("markerType")(markerType.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (toolTipContent != null) __obj.updateDynamic("toolTipContent")(toolTipContent.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataPoint]
  }
}

