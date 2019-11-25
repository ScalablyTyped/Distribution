package typings.canvasjs.canvasjsMod

import typings.canvasjs.Anon_ChartDataPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataSeriesOptions extends ChartDataCommon {
  /**
    * Setting axisXIndex lets you choose to which X axis the dataSeries should be attached.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first X axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisXIndex: js.UndefOr[Double] = js.undefined
  /**
    * Setting axisXType lets you choose between primary and secondary X Axis for a dataSeries to plot against. By choosing “secondary” Axis you can plot the series against axisX2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary X axis.
    */
  var axisXType: js.UndefOr[String] = js.undefined
  /**
    * Setting axisYIndex lets you choose to which Y axis the dataSeries should be attached to.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first Y axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisYIndex: js.UndefOr[Double] = js.undefined
  /**
    * Setting axisYType lets you choose between primary and secondary Y Axis for a dataSeries to plot against. By choosing "secondary" Axis you can plot the series against axisY2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary Y axis.
    * Default: "primary"
    * Options: "primary", "secondary"
    */
  var axisYType: js.UndefOr[String] = js.undefined
  /**
    * Sets the bevel property, which creates a chiselled effect at the corners of a Column Charts and Bar Charts.
    * Default: "true"
    * Example: "true", "false"
    */
  var bevelEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, a line breaks wherever a null dataPoint (y = null) is present.
    * You can change this behaviour to draw a line between adjacent non-null dataPoints by setting connectNullData to true.
    * Default: false
    * Example: true, false
    */
  var connectNullData: js.UndefOr[Boolean] = js.undefined
  /**
    * It represents collection dataPoint inside dataSeries.
    */
  var dataPoints: js.Array[ChartDataPoint]
  /**
    * Enables or disables exploding of Pie/Doughnut segment on click.
    * Default: true
    * Options: false, true
    */
  var explodeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets opacity of the filled color.
    * Default: .7 for Area Charts and 1 for all other chart types.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * innerRadius property allows you to set a Doughnut chart’s inner radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the outer radius of doughnut chart.
    * Default: “70%”
    * Example: 200, 150, “90%”, “75%”
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * Sets the Line Dash Type for all Line and Area Charts.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Sets the thickness of line in line charts and area charts.
    * Default: 2
    * Example: 3,4..
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Line Dash Type of line wherever null data is present.
    * Note:
    * 1.Will effect only if connectNullData is set to true.
    * 2.Supported with all Line and Area Charts.
    * 3.Not Supported on IE8.
    * Default: "dash"
    */
  var nullDataLineDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Defines how percent values are formatted before they appear on the indexLabel or toolTip. You can format percent values using this property.
    */
  var percentFormatString: js.UndefOr[String] = js.undefined
  /**
    * radius property allows you to set the Pie/Doughnut chart’s (outer) radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the plot area’s size.
    * By default, a pie/doughnut chart’s size(radius) changes in order to best fit the indexLabels. This can lead to charts of different sizes in the same page.
    * In order to override this behavior and set equal sizes to all pie/doughnut charts in a page, you can use radius property.
    * Default: Automatically calculate in order to best fit the indexLabels.
    * Example: 200, 150, “90%”, “75%”
    */
  var radius: js.UndefOr[Double | String] = js.undefined
  /**
    * In candle Stick chart, when Closing Price is greater than Opening price, the body is filled with white by default and it can be overridden by risingColor property.
    * Default: "white"
    * Options: "red", "#DD7E86", etc.
    */
  var risingColor: js.UndefOr[String] = js.undefined
  /**
    * Setting this property to true makes the dataSeries to appear in legend. In case of pie/ doughnut chart, dataPoints of the single series chart appear in legend.
    * Default: false
    * Options: false, true
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the starting Angle of the Pie or Doughnut Chart in degrees.
    * Default: 0
    * Example: 30, 240, -100..
    */
  var startAngle: js.UndefOr[Double] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of dataSeries. Data Series is visible by default and you can hide the same by setting visible property to false.
    * Default: true
    * Example: true, false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines how x axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var xValueFormatString: js.UndefOr[String] = js.undefined
  /**
    * This defines the data type of x values. Data Type is normally figured out by default based on the object type that is assigned to x.
    * But if you are providing time stamp (which is integer) values instead of Date objects, you’ll have to explicitly set the xValueType to "dateTime".
    * Default: Automatically Calculated
    * Options: "number", "dateTime"
    */
  var xValueType: js.UndefOr[String] = js.undefined
  /**
    * Defines how y axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var yValueFormatString: js.UndefOr[String] = js.undefined
  /**
    * Defines how z values is formatted before they appear on the indexLabel or toolTip. You can format numbers using this property.
    */
  var zValueFormatString: js.UndefOr[String] = js.undefined
}

object ChartDataSeriesOptions {
  @scala.inline
  def apply(
    dataPoints: js.Array[ChartDataPoint],
    axisXIndex: Int | Double = null,
    axisXType: String = null,
    axisYIndex: Int | Double = null,
    axisYType: String = null,
    bevelEnabled: js.UndefOr[Boolean] = js.undefined,
    click: /* event */ ChartEvent => Unit = null,
    color: String = null,
    connectNullData: js.UndefOr[Boolean] = js.undefined,
    explodeOnClick: js.UndefOr[Boolean] = js.undefined,
    fillOpacity: Int | Double = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    indexLabel: String = null,
    indexLabelBackgroundColor: String = null,
    indexLabelFontColor: String = null,
    indexLabelFontFamily: String = null,
    indexLabelFontSize: Int | Double = null,
    indexLabelFontStyle: String = null,
    indexLabelFontWeight: String = null,
    indexLabelFormatter: /* e */ Anon_ChartDataPoint => String = null,
    indexLabelLineColor: String = null,
    indexLabelLineDashType: DashType = null,
    indexLabelLineThickness: Int | Double = null,
    indexLabelOrientation: String = null,
    indexLabelPlacement: String = null,
    innerRadius: Double | String = null,
    legendMarkerBorderColor: String = null,
    legendMarkerBorderThickness: Int | Double = null,
    legendMarkerColor: String = null,
    legendMarkerType: String = null,
    legendText: String = null,
    lineDashType: DashType = null,
    lineThickness: Int | Double = null,
    markerBorderColor: String = null,
    markerBorderThickness: Int | Double = null,
    markerColor: String = null,
    markerSize: Int | Double = null,
    markerType: String = null,
    mousemove: /* event */ ChartEvent => Unit = null,
    mouseout: /* event */ ChartEvent => Unit = null,
    mouseover: /* event */ ChartEvent => Unit = null,
    name: String = null,
    nullDataLineDashType: DashType = null,
    percentFormatString: String = null,
    radius: Double | String = null,
    risingColor: String = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    toolTipContent: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xValueFormatString: String = null,
    xValueType: String = null,
    yValueFormatString: String = null,
    zValueFormatString: String = null
  ): ChartDataSeriesOptions = {
    val __obj = js.Dynamic.literal(dataPoints = dataPoints.asInstanceOf[js.Any])
    if (axisXIndex != null) __obj.updateDynamic("axisXIndex")(axisXIndex.asInstanceOf[js.Any])
    if (axisXType != null) __obj.updateDynamic("axisXType")(axisXType.asInstanceOf[js.Any])
    if (axisYIndex != null) __obj.updateDynamic("axisYIndex")(axisYIndex.asInstanceOf[js.Any])
    if (axisYType != null) __obj.updateDynamic("axisYType")(axisYType.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(connectNullData)) __obj.updateDynamic("connectNullData")(connectNullData.asInstanceOf[js.Any])
    if (!js.isUndefined(explodeOnClick)) __obj.updateDynamic("explodeOnClick")(explodeOnClick.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
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
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (legendMarkerBorderColor != null) __obj.updateDynamic("legendMarkerBorderColor")(legendMarkerBorderColor.asInstanceOf[js.Any])
    if (legendMarkerBorderThickness != null) __obj.updateDynamic("legendMarkerBorderThickness")(legendMarkerBorderThickness.asInstanceOf[js.Any])
    if (legendMarkerColor != null) __obj.updateDynamic("legendMarkerColor")(legendMarkerColor.asInstanceOf[js.Any])
    if (legendMarkerType != null) __obj.updateDynamic("legendMarkerType")(legendMarkerType.asInstanceOf[js.Any])
    if (legendText != null) __obj.updateDynamic("legendText")(legendText.asInstanceOf[js.Any])
    if (lineDashType != null) __obj.updateDynamic("lineDashType")(lineDashType.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (markerBorderColor != null) __obj.updateDynamic("markerBorderColor")(markerBorderColor.asInstanceOf[js.Any])
    if (markerBorderThickness != null) __obj.updateDynamic("markerBorderThickness")(markerBorderThickness.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerType != null) __obj.updateDynamic("markerType")(markerType.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nullDataLineDashType != null) __obj.updateDynamic("nullDataLineDashType")(nullDataLineDashType.asInstanceOf[js.Any])
    if (percentFormatString != null) __obj.updateDynamic("percentFormatString")(percentFormatString.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (risingColor != null) __obj.updateDynamic("risingColor")(risingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (toolTipContent != null) __obj.updateDynamic("toolTipContent")(toolTipContent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xValueFormatString != null) __obj.updateDynamic("xValueFormatString")(xValueFormatString.asInstanceOf[js.Any])
    if (xValueType != null) __obj.updateDynamic("xValueType")(xValueType.asInstanceOf[js.Any])
    if (yValueFormatString != null) __obj.updateDynamic("yValueFormatString")(yValueFormatString.asInstanceOf[js.Any])
    if (zValueFormatString != null) __obj.updateDynamic("zValueFormatString")(zValueFormatString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSeriesOptions]
  }
}

