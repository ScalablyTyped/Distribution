package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataPoint extends ChartDataCommon {
  /**
    * Sets the exploded value of dataPoint. It is applicable only in case of Pie and Doughnut Charts. This property causes the Pie/Doughnut slice to separate out.
    * Default: true
    * Example: true, false
    */
  var exploded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets label value of a dataPoint. The value appears next to the dataPoint on axisX Line. If not provided, it takes x value for label.
    * Default: x value
    * Example: "label1", "label2"..
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the x value. It determines the position of the dataPoint on X Axis. It can be numeric or a dateTime value. Values can be positive or Negative.
    * If no x value is provided, they are automatically set sequentially starting from zero
    * Default: null
    * Example: 10, 20, 30 ..
    * new Date(2011, 08, 01)
    */
  var x: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
    * Sets the y value of dataPoint. It determines the position of dataPoint on Y Axis. Values can be positive or Negative
    * Default: null
    * Example: 5, 20, -30 ..
    */
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Sets the z value of dataPoint. It is only applicable in case of Bubble chart. This value determines the size of the bubble.
    * Default: 1
    * Example: 10, 20, 35..
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object ChartDataPoint {
  @scala.inline
  def apply(
    click: /* event */ ChartEvent => scala.Unit = null,
    color: java.lang.String = null,
    exploded: js.UndefOr[scala.Boolean] = js.undefined,
    highlightEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    indexLabel: java.lang.String = null,
    indexLabelBackgroundColor: java.lang.String = null,
    indexLabelFontColor: java.lang.String = null,
    indexLabelFontFamily: java.lang.String = null,
    indexLabelFontSize: scala.Int | scala.Double = null,
    indexLabelFontStyle: java.lang.String = null,
    indexLabelFontWeight: java.lang.String = null,
    indexLabelFormatter: /* e */ canvasjsLib.Anon_ChartDataPoint => java.lang.String = null,
    indexLabelLineColor: java.lang.String = null,
    indexLabelLineDashType: DashType = null,
    indexLabelLineThickness: scala.Int | scala.Double = null,
    indexLabelOrientation: java.lang.String = null,
    indexLabelPlacement: java.lang.String = null,
    label: java.lang.String = null,
    legendMarkerBorderColor: java.lang.String = null,
    legendMarkerBorderThickness: scala.Int | scala.Double = null,
    legendMarkerColor: java.lang.String = null,
    legendMarkerType: java.lang.String = null,
    legendText: java.lang.String = null,
    markerBorderColor: java.lang.String = null,
    markerBorderThickness: scala.Int | scala.Double = null,
    markerColor: java.lang.String = null,
    markerSize: scala.Int | scala.Double = null,
    markerType: java.lang.String = null,
    mousemove: /* event */ ChartEvent => scala.Unit = null,
    mouseout: /* event */ ChartEvent => scala.Unit = null,
    mouseover: /* event */ ChartEvent => scala.Unit = null,
    name: java.lang.String = null,
    toolTipContent: java.lang.String = null,
    x: scala.Double | stdLib.Date = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): ChartDataPoint = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(exploded)) __obj.updateDynamic("exploded")(exploded)
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled)
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel)
    if (indexLabelBackgroundColor != null) __obj.updateDynamic("indexLabelBackgroundColor")(indexLabelBackgroundColor)
    if (indexLabelFontColor != null) __obj.updateDynamic("indexLabelFontColor")(indexLabelFontColor)
    if (indexLabelFontFamily != null) __obj.updateDynamic("indexLabelFontFamily")(indexLabelFontFamily)
    if (indexLabelFontSize != null) __obj.updateDynamic("indexLabelFontSize")(indexLabelFontSize.asInstanceOf[js.Any])
    if (indexLabelFontStyle != null) __obj.updateDynamic("indexLabelFontStyle")(indexLabelFontStyle)
    if (indexLabelFontWeight != null) __obj.updateDynamic("indexLabelFontWeight")(indexLabelFontWeight)
    if (indexLabelFormatter != null) __obj.updateDynamic("indexLabelFormatter")(js.Any.fromFunction1(indexLabelFormatter))
    if (indexLabelLineColor != null) __obj.updateDynamic("indexLabelLineColor")(indexLabelLineColor)
    if (indexLabelLineDashType != null) __obj.updateDynamic("indexLabelLineDashType")(indexLabelLineDashType)
    if (indexLabelLineThickness != null) __obj.updateDynamic("indexLabelLineThickness")(indexLabelLineThickness.asInstanceOf[js.Any])
    if (indexLabelOrientation != null) __obj.updateDynamic("indexLabelOrientation")(indexLabelOrientation)
    if (indexLabelPlacement != null) __obj.updateDynamic("indexLabelPlacement")(indexLabelPlacement)
    if (label != null) __obj.updateDynamic("label")(label)
    if (legendMarkerBorderColor != null) __obj.updateDynamic("legendMarkerBorderColor")(legendMarkerBorderColor)
    if (legendMarkerBorderThickness != null) __obj.updateDynamic("legendMarkerBorderThickness")(legendMarkerBorderThickness.asInstanceOf[js.Any])
    if (legendMarkerColor != null) __obj.updateDynamic("legendMarkerColor")(legendMarkerColor)
    if (legendMarkerType != null) __obj.updateDynamic("legendMarkerType")(legendMarkerType)
    if (legendText != null) __obj.updateDynamic("legendText")(legendText)
    if (markerBorderColor != null) __obj.updateDynamic("markerBorderColor")(markerBorderColor)
    if (markerBorderThickness != null) __obj.updateDynamic("markerBorderThickness")(markerBorderThickness.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerType != null) __obj.updateDynamic("markerType")(markerType)
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (name != null) __obj.updateDynamic("name")(name)
    if (toolTipContent != null) __obj.updateDynamic("toolTipContent")(toolTipContent)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataPoint]
  }
}

