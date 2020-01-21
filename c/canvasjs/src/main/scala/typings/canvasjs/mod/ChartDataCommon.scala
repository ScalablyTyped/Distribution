package typings.canvasjs.mod

import typings.canvasjs.AnonChartDataPoint
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
  var click: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the color of dataSeries. The value of tickColor can be a "HTML Color Name" or "Hex Code".
    * Default: Automatically set from Theme.
    * Example: "red", "green" ..
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Enables or Disables highlighting of dataPoints on mouse hover.
    * Default: true
    * Example: true,false
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Instead of setting string values for all indexLabels, you can also use keywords like x, y, etc that will automatically show corresponding properties as indexLabel.
    * This will allow you to define indexLabel at the series level once. While setting indexLabel you specify a keyword by enclosing it in flower brackets like {x}, {y}, {color}, etc.
    * Range Charts have two indexLabels – one for each y value. This requires the use of a special keyword #index to show index label on either sides of the column/bar/area.
    * eg: indexLabel: "{x}: {y[#index]}"
    * Important keywords to keep in mind are. {x}, {y}, {name}, {label}.
    * Default: null
    * Example: "{label}", "Win", "x: {x}, y: {y} "
    */
  var indexLabel: js.UndefOr[String] = js.undefined
  /**
    * Sets the Background color of Index Labels. The value of indexLabelBackgroundColor can be a "HTML Color Name" or "Hex Code".
    * Default: null
    * Example: "red", "#FAC003" ..
    */
  var indexLabelBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Index Label’s Font color. The value of IndexLabelFontColor can be a "HTML Color Name" or "Hex Code".
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelFontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Index Label’s Font Family.
    * Default: "Calibri, Optima, Candara, Verdana, Geneva, sans-serif"
    * Example: "calibri", "tahoma", "verdana"..
    */
  var indexLabelFontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the Index Label’s Font Size in pixels.
    * Default: 18
    * Example: 12, 16, 22..
    */
  var indexLabelFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Index Label’s Font Style. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var indexLabelFontStyle: js.UndefOr[String] = js.undefined
  /**
    * Sets the Index Label’s Font Weight. It can be set to one of the below options.
    * Default: "normal"
    * Example: "lighter", "normal" ,"bold" , "bolder"
    */
  var indexLabelFontWeight: js.UndefOr[String] = js.undefined
  /**
    * A custom formatter function which returns the text to be displayed as indexLabel on dataPoints.
    * @param e event object
    */
  var indexLabelFormatter: js.UndefOr[js.Function1[/* e */ AnonChartDataPoint, String]] = js.undefined
  /**
    * Sets the color of line connecting index labels with their dataPoint. It is only applicable for pie and doughnut chart when indexLabelPlacment is outside.
    * The value of indexLineColor can be a "HTML Color Name" or "Hex Code".
    * Default: "lightgrey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelLineColor: js.UndefOr[String] = js.undefined
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
  var indexLabelLineThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Orientation of indexLabel to "horizontal" or "vertical".
    * Default: "horizontal"
    * Options: "horizontal", "vertical"
    */
  var indexLabelOrientation: js.UndefOr[String] = js.undefined
  /**
    * Using this property you can define whether to render indexLabel "inside" or "outside" the dataPoint.
    * Default: "outside"
    * Example: "outside", "inside"
    */
  var indexLabelPlacement: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color around the legend marker. Value of legendMarkerBorderColor can be “color names” or “hex code”.
    * Default: dataSeries color.
    * Example: “red”, “#008000” ..
    */
  var legendMarkerBorderColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the thickness of the legend’s Marker Border in pixels.
    * Default: 0
    * Example: 2, 4 ..
    */
  var legendMarkerBorderThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the color of marker that is displayed on legend. This property overrides default Marker’s Color in Legend, which is same as dataSeries Marker Color.
    * Value of legendMarkerColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries marker color
    * Example: "red", "#008000" ..
    */
  var legendMarkerColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Legend Marker to one of the options below. This property is used to override the default marker in legend, which is same as dataSeries Marker Type.
    * Default: same as markerType
    * Options: "circle", "square", "cross" and "triangle"
    */
  var legendMarkerType: js.UndefOr[String] = js.undefined
  /**
    * Sets the text that describes the dataSeries in legend.
    * Default: "DataSeries 1", "DataSeries 2" ..etc
    * Example: "2010", "2011"..
    */
  var legendText: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color around marker. Value of markerBorderColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries color.
    * Example: "red", "#008000" ..
    */
  var markerBorderColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the thickness of the Marker’s Border in pixels.
    * Default: 1
    * Example: 2,4 ..
    */
  var markerBorderThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the color of marker that is displayed on the Chart. Legend Marker for the series uses the same Color as set here unless overridden using legendMarkerColor property.
    * Default: dataSeries Color
    * Example: "red", "#008000" ..
    */
  var markerColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Size of the marker that is drawn. To display marker in area Chart, set markerSize to a value greater than zero.
    * For line, scatter chart, size it is automatically set unless overridden.
    * Default: auto. Zero for area chart
    * Example: 5, 10..
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets marker type to be rendered at each dataPoint. While markers are helpful in highlighting individual dataPoints, they do not help much when the dataPoints are crowded.
    * In case of large number of dataPoints it is recommended to disable markers in order to improve the appearance and performance of chart.
    * Same marker type is also used in legend unless overridden by legendMarkerType property.
    * Default: "circle"
    * Options: "none", "circle", "square", "triangle" and "cross"
    */
  var markerType: js.UndefOr[String] = js.undefined
  /**
    * Sets the mousemove event handler for dataSeries which is triggered when user Moves mouse on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the mouseout event handler for dataSeries which is triggered when user moves mouse out of a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the mouseover event handler for dataSeries which is triggered when user moves Mouse Over a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the dataPoint Name. dataPoint name is shown in various places like toolTip & legend unless overridden.
    * Default: Automatically Named ("dataPoint 1", "dataPoint 2" .. )
    * Example: "apple", "mango" ..
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Default Tooltip can be modified at dataSeries or dataPoint level. You can add content to be displayed in toolTip using toolTipContent.
    * toolTipContent set at dataPoint will override toolTipContent set at dataSeries level.
    * Default: auto set depending on chart type.
    */
  var toolTipContent: js.UndefOr[String] = js.undefined
}

object ChartDataCommon {
  @scala.inline
  def apply(
    click: /* event */ ChartEvent => Unit = null,
    color: String = null,
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
    toolTipContent: String = null
  ): ChartDataCommon = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ChartDataCommon]
  }
}

