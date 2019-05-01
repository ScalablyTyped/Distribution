package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataCommon extends js.Object {
  /**
    * Sets the click event handler for dataSeries which is triggered when user clicks on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var click: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
    * Sets the color of dataSeries. The value of tickColor can be a "HTML Color Name" or "Hex Code".
    * Default: Automatically set from Theme.
    * Example: "red", "green" ..
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enables or Disables highlighting of dataPoints on mouse hover.
    * Default: true
    * Example: true,false
    */
  var highlightEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Instead of setting string values for all indexLabels, you can also use keywords like x, y, etc that will automatically show corresponding properties as indexLabel.
    * This will allow you to define indexLabel at the series level once. While setting indexLabel you specify a keyword by enclosing it in flower brackets like {x}, {y}, {color}, etc.
    * Range Charts have two indexLabels – one for each y value. This requires the use of a special keyword #index to show index label on either sides of the column/bar/area.
    * eg: indexLabel: "{x}: {y[#index]}"
    * Important keywords to keep in mind are. {x}, {y}, {name}, {label}.
    * Default: null
    * Example: "{label}", "Win", "x: {x}, y: {y} "
    */
  var indexLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Background color of Index Labels. The value of indexLabelBackgroundColor can be a "HTML Color Name" or "Hex Code".
    * Default: null
    * Example: "red", "#FAC003" ..
    */
  var indexLabelBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Index Label’s Font color. The value of IndexLabelFontColor can be a "HTML Color Name" or "Hex Code".
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelFontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Index Label’s Font Family.
    * Default: "Calibri, Optima, Candara, Verdana, Geneva, sans-serif"
    * Example: "calibri", "tahoma", "verdana"..
    */
  var indexLabelFontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Index Label’s Font Size in pixels.
    * Default: 18
    * Example: 12, 16, 22..
    */
  var indexLabelFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the Index Label’s Font Style. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var indexLabelFontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Index Label’s Font Weight. It can be set to one of the below options.
    * Default: "normal"
    * Example: "lighter", "normal" ,"bold" , "bolder"
    */
  var indexLabelFontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A custom formatter function which returns the text to be displayed as indexLabel on dataPoints.
    * @param e event object
    */
  var indexLabelFormatter: js.UndefOr[js.Function1[/* e */ canvasjsLib.Anon_ChartDataPoint, java.lang.String]] = js.undefined
  /**
    * Sets the color of line connecting index labels with their dataPoint. It is only applicable for pie and doughnut chart when indexLabelPlacment is outside.
    * The value of indexLineColor can be a "HTML Color Name" or "Hex Code".
    * Default: "lightgrey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelLineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Dash Type for indexLabel’s line. It is applicable only for pie and doughnut charts when indexLabelPlacement is set to “outside”.
    * For other chart-types, indexLabelLineThickness should be set greater than zero.
    * Default: solid
    */
  var indexLabelLineDashType: js.UndefOr[DashType] = js.undefined
  /**
    * Sets the thickness of line connecting indexLabel with its corresponding dataPoint.
    * It is only applicable for pie and doughnut chart when indexLabelPlacement is set to "outside".
    * Default: 2
    * Example: 4, 6
    */
  var indexLabelLineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the Orientation of indexLabel to "horizontal" or "vertical".
    * Default: "horizontal"
    * Options: "horizontal", "vertical"
    */
  var indexLabelOrientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Using this property you can define whether to render indexLabel "inside" or "outside" the dataPoint.
    * Default: "outside"
    * Example: "outside", "inside"
    */
  var indexLabelPlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the border color around the legend marker. Value of legendMarkerBorderColor can be “color names” or “hex code”.
    * Default: dataSeries color.
    * Example: “red”, “#008000” ..
    */
  var legendMarkerBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the thickness of the legend’s Marker Border in pixels.
    * Default: 0
    * Example: 2, 4 ..
    */
  var legendMarkerBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the color of marker that is displayed on legend. This property overrides default Marker’s Color in Legend, which is same as dataSeries Marker Color.
    * Value of legendMarkerColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries marker color
    * Example: "red", "#008000" ..
    */
  var legendMarkerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Legend Marker to one of the options below. This property is used to override the default marker in legend, which is same as dataSeries Marker Type.
    * Default: same as markerType
    * Options: "circle", "square", "cross" and "triangle"
    */
  var legendMarkerType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the text that describes the dataSeries in legend.
    * Default: "DataSeries 1", "DataSeries 2" ..etc
    * Example: "2010", "2011"..
    */
  var legendText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the border color around marker. Value of markerBorderColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries color.
    * Example: "red", "#008000" ..
    */
  var markerBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the thickness of the Marker’s Border in pixels.
    * Default: 1
    * Example: 2,4 ..
    */
  var markerBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the color of marker that is displayed on the Chart. Legend Marker for the series uses the same Color as set here unless overridden using legendMarkerColor property.
    * Default: dataSeries Color
    * Example: "red", "#008000" ..
    */
  var markerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the Size of the marker that is drawn. To display marker in area Chart, set markerSize to a value greater than zero.
    * For line, scatter chart, size it is automatically set unless overridden.
    * Default: auto. Zero for area chart
    * Example: 5, 10..
    */
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets marker type to be rendered at each dataPoint. While markers are helpful in highlighting individual dataPoints, they do not help much when the dataPoints are crowded.
    * In case of large number of dataPoints it is recommended to disable markers in order to improve the appearance and performance of chart.
    * Same marker type is also used in legend unless overridden by legendMarkerType property.
    * Default: "circle"
    * Options: "none", "circle", "square", "triangle" and "cross"
    */
  var markerType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the mousemove event handler for dataSeries which is triggered when user Moves mouse on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
    * Sets the mouseout event handler for dataSeries which is triggered when user moves mouse out of a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
    * Sets the mouseover event handler for dataSeries which is triggered when user moves Mouse Over a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
    * Sets the dataPoint Name. dataPoint name is shown in various places like toolTip & legend unless overridden.
    * Default: Automatically Named ("dataPoint 1", "dataPoint 2" .. )
    * Example: "apple", "mango" ..
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default Tooltip can be modified at dataSeries or dataPoint level. You can add content to be displayed in toolTip using toolTipContent.
    * toolTipContent set at dataPoint will override toolTipContent set at dataSeries level.
    * Default: auto set depending on chart type.
    */
  var toolTipContent: js.UndefOr[java.lang.String] = js.undefined
}

object ChartDataCommon {
  @scala.inline
  def apply(
    click: /* event */ ChartEvent => scala.Unit = null,
    color: java.lang.String = null,
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
    toolTipContent: java.lang.String = null
  ): ChartDataCommon = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (color != null) __obj.updateDynamic("color")(color)
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
    __obj.asInstanceOf[ChartDataCommon]
  }
}

