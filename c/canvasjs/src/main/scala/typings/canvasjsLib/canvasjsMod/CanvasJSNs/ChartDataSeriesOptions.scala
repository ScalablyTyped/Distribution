package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataSeriesOptions extends ChartDataCommon {
  /**
    * Setting axisXIndex lets you choose to which X axis the dataSeries should be attached.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first X axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisXIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting axisXType lets you choose between primary and secondary X Axis for a dataSeries to plot against. By choosing “secondary” Axis you can plot the series against axisX2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary X axis.
    */
  var axisXType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setting axisYIndex lets you choose to which Y axis the dataSeries should be attached to.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first Y axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisYIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting axisYType lets you choose between primary and secondary Y Axis for a dataSeries to plot against. By choosing "secondary" Axis you can plot the series against axisY2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary Y axis.
    * Default: "primary"
    * Options: "primary", "secondary"
    */
  var axisYType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the bevel property, which creates a chiselled effect at the corners of a Column Charts and Bar Charts.
    * Default: "true"
    * Example: "true", "false"
    */
  var bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, a line breaks wherever a null dataPoint (y = null) is present.
    * You can change this behaviour to draw a line between adjacent non-null dataPoints by setting connectNullData to true.
    * Default: false
    * Example: true, false
    */
  var connectNullData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It represents collection dataPoint inside dataSeries.
    */
  var dataPoints: js.Array[ChartDataPoint]
  /**
    * Enables or disables exploding of Pie/Doughnut segment on click.
    * Default: true
    * Options: false, true
    */
  var explodeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets opacity of the filled color.
    * Default: .7 for Area Charts and 1 for all other chart types.
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * innerRadius property allows you to set a Doughnut chart’s inner radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the outer radius of doughnut chart.
    * Default: “70%”
    * Example: 200, 150, “90%”, “75%”
    */
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Sets the Line Dash Type for all Line and Area Charts.
    * Default: solid
    */
  var lineDashType: js.UndefOr[canvasjsLib.DashType] = js.undefined
  /**
    * Sets the thickness of line in line charts and area charts.
    * Default: 2
    * Example: 3,4..
    */
  var lineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the Line Dash Type of line wherever null data is present.
    * Note:
    * 1.Will effect only if connectNullData is set to true.
    * 2.Supported with all Line and Area Charts.
    * 3.Not Supported on IE8.
    * Default: "dash"
    */
  var nullDataLineDashType: js.UndefOr[canvasjsLib.DashType] = js.undefined
  /**
    * Defines how percent values are formatted before they appear on the indexLabel or toolTip. You can format percent values using this property.
    */
  var percentFormatString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * radius property allows you to set the Pie/Doughnut chart’s (outer) radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the plot area’s size.
    * By default, a pie/doughnut chart’s size(radius) changes in order to best fit the indexLabels. This can lead to charts of different sizes in the same page.
    * In order to override this behavior and set equal sizes to all pie/doughnut charts in a page, you can use radius property.
    * Default: Automatically calculate in order to best fit the indexLabels.
    * Example: 200, 150, “90%”, “75%”
    */
  var radius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * In candle Stick chart, when Closing Price is greater than Opening price, the body is filled with white by default and it can be overridden by risingColor property.
    * Default: "white"
    * Options: "red", "#DD7E86", etc.
    */
  var risingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setting this property to true makes the dataSeries to appear in legend. In case of pie/ doughnut chart, dataPoints of the single series chart appear in legend.
    * Default: false
    * Options: false, true
    */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the starting Angle of the Pie or Doughnut Chart in degrees.
    * Default: 0
    * Example: 30, 240, -100..
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the type of chart to be rendered for corresponding dataSeries. One can choose from the following options.
    * Default: "column"
    * Options:
    *     "line"
    *     "column"
    *     "bar"
    *     "area"
    *     "spline"
    *     "splineArea"
    *     "stepLine"
    *     "scatter"
    *     "bubble"
    *     "stackedColumn"
    *     "stackedBar"
    *     "stackedArea"
    *     "stackedColumn100"
    *     "stackedBar100"
    *     "stackedArea100"
    *     "pie"
    *     "doughnut"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the visibility of dataSeries. Data Series is visible by default and you can hide the same by setting visible property to false.
    * Default: true
    * Example: true, false
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines how x axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var xValueFormatString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This defines the data type of x values. Data Type is normally figured out by default based on the object type that is assigned to x.
    * But if you are providing time stamp (which is integer) values instead of Date objects, you’ll have to explicitly set the xValueType to "dateTime".
    * Default: Automatically Calculated
    * Options: "number", "dateTime"
    */
  var xValueType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines how y axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var yValueFormatString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines how z values is formatted before they appear on the indexLabel or toolTip. You can format numbers using this property.
    */
  var zValueFormatString: js.UndefOr[java.lang.String] = js.undefined
}

object ChartDataSeriesOptions {
  @scala.inline
  def apply(
    dataPoints: js.Array[ChartDataPoint],
    axisXIndex: scala.Int | scala.Double = null,
    axisXType: java.lang.String = null,
    axisYIndex: scala.Int | scala.Double = null,
    axisYType: java.lang.String = null,
    bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    click: js.Function1[/* event */ ChartEvent, scala.Unit] = null,
    color: java.lang.String = null,
    connectNullData: js.UndefOr[scala.Boolean] = js.undefined,
    explodeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    fillOpacity: scala.Int | scala.Double = null,
    highlightEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    indexLabel: java.lang.String = null,
    indexLabelBackgroundColor: java.lang.String = null,
    indexLabelFontColor: java.lang.String = null,
    indexLabelFontFamily: java.lang.String = null,
    indexLabelFontSize: scala.Int | scala.Double = null,
    indexLabelFontStyle: java.lang.String = null,
    indexLabelFontWeight: java.lang.String = null,
    indexLabelFormatter: js.Function1[/* e */ canvasjsLib.Anon_ChartDataPoint, java.lang.String] = null,
    indexLabelLineColor: java.lang.String = null,
    indexLabelLineDashType: canvasjsLib.DashType = null,
    indexLabelLineThickness: scala.Int | scala.Double = null,
    indexLabelOrientation: java.lang.String = null,
    indexLabelPlacement: java.lang.String = null,
    innerRadius: scala.Double | java.lang.String = null,
    legendMarkerBorderColor: java.lang.String = null,
    legendMarkerBorderThickness: scala.Int | scala.Double = null,
    legendMarkerColor: java.lang.String = null,
    legendMarkerType: java.lang.String = null,
    legendText: java.lang.String = null,
    lineDashType: canvasjsLib.DashType = null,
    lineThickness: scala.Int | scala.Double = null,
    markerBorderColor: java.lang.String = null,
    markerBorderThickness: scala.Int | scala.Double = null,
    markerColor: java.lang.String = null,
    markerSize: scala.Int | scala.Double = null,
    markerType: java.lang.String = null,
    mousemove: js.Function1[/* event */ ChartEvent, scala.Unit] = null,
    mouseout: js.Function1[/* event */ ChartEvent, scala.Unit] = null,
    mouseover: js.Function1[/* event */ ChartEvent, scala.Unit] = null,
    name: java.lang.String = null,
    nullDataLineDashType: canvasjsLib.DashType = null,
    percentFormatString: java.lang.String = null,
    radius: scala.Double | java.lang.String = null,
    risingColor: java.lang.String = null,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    startAngle: scala.Int | scala.Double = null,
    toolTipContent: java.lang.String = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xValueFormatString: java.lang.String = null,
    xValueType: java.lang.String = null,
    yValueFormatString: java.lang.String = null,
    zValueFormatString: java.lang.String = null
  ): ChartDataSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataPoints")(dataPoints)
    if (axisXIndex != null) __obj.updateDynamic("axisXIndex")(axisXIndex.asInstanceOf[js.Any])
    if (axisXType != null) __obj.updateDynamic("axisXType")(axisXType)
    if (axisYIndex != null) __obj.updateDynamic("axisYIndex")(axisYIndex.asInstanceOf[js.Any])
    if (axisYType != null) __obj.updateDynamic("axisYType")(axisYType)
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled)
    if (click != null) __obj.updateDynamic("click")(click)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(connectNullData)) __obj.updateDynamic("connectNullData")(connectNullData)
    if (!js.isUndefined(explodeOnClick)) __obj.updateDynamic("explodeOnClick")(explodeOnClick)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled)
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel)
    if (indexLabelBackgroundColor != null) __obj.updateDynamic("indexLabelBackgroundColor")(indexLabelBackgroundColor)
    if (indexLabelFontColor != null) __obj.updateDynamic("indexLabelFontColor")(indexLabelFontColor)
    if (indexLabelFontFamily != null) __obj.updateDynamic("indexLabelFontFamily")(indexLabelFontFamily)
    if (indexLabelFontSize != null) __obj.updateDynamic("indexLabelFontSize")(indexLabelFontSize.asInstanceOf[js.Any])
    if (indexLabelFontStyle != null) __obj.updateDynamic("indexLabelFontStyle")(indexLabelFontStyle)
    if (indexLabelFontWeight != null) __obj.updateDynamic("indexLabelFontWeight")(indexLabelFontWeight)
    if (indexLabelFormatter != null) __obj.updateDynamic("indexLabelFormatter")(indexLabelFormatter)
    if (indexLabelLineColor != null) __obj.updateDynamic("indexLabelLineColor")(indexLabelLineColor)
    if (indexLabelLineDashType != null) __obj.updateDynamic("indexLabelLineDashType")(indexLabelLineDashType)
    if (indexLabelLineThickness != null) __obj.updateDynamic("indexLabelLineThickness")(indexLabelLineThickness.asInstanceOf[js.Any])
    if (indexLabelOrientation != null) __obj.updateDynamic("indexLabelOrientation")(indexLabelOrientation)
    if (indexLabelPlacement != null) __obj.updateDynamic("indexLabelPlacement")(indexLabelPlacement)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (legendMarkerBorderColor != null) __obj.updateDynamic("legendMarkerBorderColor")(legendMarkerBorderColor)
    if (legendMarkerBorderThickness != null) __obj.updateDynamic("legendMarkerBorderThickness")(legendMarkerBorderThickness.asInstanceOf[js.Any])
    if (legendMarkerColor != null) __obj.updateDynamic("legendMarkerColor")(legendMarkerColor)
    if (legendMarkerType != null) __obj.updateDynamic("legendMarkerType")(legendMarkerType)
    if (legendText != null) __obj.updateDynamic("legendText")(legendText)
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType)
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (markerBorderColor != null) __obj.updateDynamic("markerBorderColor")(markerBorderColor)
    if (markerBorderThickness != null) __obj.updateDynamic("markerBorderThickness")(markerBorderThickness.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerType != null) __obj.updateDynamic("markerType")(markerType)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nullDataLineDashType != null) __obj.updateDynamic("nullDataLineDashType")(nullDataLineDashType)
    if (percentFormatString != null) __obj.updateDynamic("percentFormatString")(percentFormatString)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (risingColor != null) __obj.updateDynamic("risingColor")(risingColor)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (toolTipContent != null) __obj.updateDynamic("toolTipContent")(toolTipContent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xValueFormatString != null) __obj.updateDynamic("xValueFormatString")(xValueFormatString)
    if (xValueType != null) __obj.updateDynamic("xValueType")(xValueType)
    if (yValueFormatString != null) __obj.updateDynamic("yValueFormatString")(yValueFormatString)
    if (zValueFormatString != null) __obj.updateDynamic("zValueFormatString")(zValueFormatString)
    __obj.asInstanceOf[ChartDataSeriesOptions]
  }
}

