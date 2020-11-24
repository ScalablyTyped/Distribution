package typings.canvasjs.mod

import typings.canvasjs.anon.DataSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataCommon extends js.Object {
  
  /**
    * Sets the click event handler for dataSeries which is triggered when user clicks on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var click: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  
  /**
    * Sets the color of dataSeries. The value of tickColor can be a "HTML Color Name" or "Hex Code".
    * Default: Automatically set from Theme.
    * Example: "red", "green" ..
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Enables or Disables highlighting of dataPoints on mouse hover.
    * Default: true
    * Example: true,false
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Instead of setting string values for all indexLabels, you can also use keywords like x, y, etc that will automatically show corresponding properties as indexLabel.
    * This will allow you to define indexLabel at the series level once. While setting indexLabel you specify a keyword by enclosing it in flower brackets like {x}, {y}, {color}, etc.
    * Range Charts have two indexLabels – one for each y value. This requires the use of a special keyword #index to show index label on either sides of the column/bar/area.
    * eg: indexLabel: "{x}: {y[#index]}"
    * Important keywords to keep in mind are. {x}, {y}, {name}, {label}.
    * Default: null
    * Example: "{label}", "Win", "x: {x}, y: {y} "
    */
  var indexLabel: js.UndefOr[String] = js.native
  
  /**
    * Sets the Background color of Index Labels. The value of indexLabelBackgroundColor can be a "HTML Color Name" or "Hex Code".
    * Default: null
    * Example: "red", "#FAC003" ..
    */
  var indexLabelBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Index Label’s Font color. The value of IndexLabelFontColor can be a "HTML Color Name" or "Hex Code".
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelFontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Index Label’s Font Family.
    * Default: "Calibri, Optima, Candara, Verdana, Geneva, sans-serif"
    * Example: "calibri", "tahoma", "verdana"..
    */
  var indexLabelFontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the Index Label’s Font Size in pixels.
    * Default: 18
    * Example: 12, 16, 22..
    */
  var indexLabelFontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Index Label’s Font Style. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var indexLabelFontStyle: js.UndefOr[String] = js.native
  
  /**
    * Sets the Index Label’s Font Weight. It can be set to one of the below options.
    * Default: "normal"
    * Example: "lighter", "normal" ,"bold" , "bolder"
    */
  var indexLabelFontWeight: js.UndefOr[String] = js.native
  
  /**
    * A custom formatter function which returns the text to be displayed as indexLabel on dataPoints.
    * @param e event object
    */
  var indexLabelFormatter: js.UndefOr[js.Function1[/* e */ DataSeries, String]] = js.native
  
  /**
    * Sets the color of line connecting index labels with their dataPoint. It is only applicable for pie and doughnut chart when indexLabelPlacment is outside.
    * The value of indexLineColor can be a "HTML Color Name" or "Hex Code".
    * Default: "lightgrey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelLineColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Dash Type for indexLabel’s line. It is applicable only for pie and doughnut charts when indexLabelPlacement is set to “outside”.
    * For other chart-types, indexLabelLineThickness should be set greater than zero.
    * Default: solid
    */
  var indexLabelLineDashType: js.UndefOr[DashType] = js.native
  
  /**
    * Sets the thickness of line connecting indexLabel with its corresponding dataPoint.
    * It is only applicable for pie and doughnut chart when indexLabelPlacement is set to "outside".
    * Default: 2
    * Example: 4, 6
    */
  var indexLabelLineThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Orientation of indexLabel to "horizontal" or "vertical".
    * Default: "horizontal"
    * Options: "horizontal", "vertical"
    */
  var indexLabelOrientation: js.UndefOr[String] = js.native
  
  /**
    * Using this property you can define whether to render indexLabel "inside" or "outside" the dataPoint.
    * Default: "outside"
    * Example: "outside", "inside"
    */
  var indexLabelPlacement: js.UndefOr[String] = js.native
  
  /**
    * Sets the border color around the legend marker. Value of legendMarkerBorderColor can be “color names” or “hex code”.
    * Default: dataSeries color.
    * Example: “red”, “#008000” ..
    */
  var legendMarkerBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the thickness of the legend’s Marker Border in pixels.
    * Default: 0
    * Example: 2, 4 ..
    */
  var legendMarkerBorderThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the color of marker that is displayed on legend. This property overrides default Marker’s Color in Legend, which is same as dataSeries Marker Color.
    * Value of legendMarkerColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries marker color
    * Example: "red", "#008000" ..
    */
  var legendMarkerColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Legend Marker to one of the options below. This property is used to override the default marker in legend, which is same as dataSeries Marker Type.
    * Default: same as markerType
    * Options: "circle", "square", "cross" and "triangle"
    */
  var legendMarkerType: js.UndefOr[String] = js.native
  
  /**
    * Sets the text that describes the dataSeries in legend.
    * Default: "DataSeries 1", "DataSeries 2" ..etc
    * Example: "2010", "2011"..
    */
  var legendText: js.UndefOr[String] = js.native
  
  /**
    * Sets the border color around marker. Value of markerBorderColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries color.
    * Example: "red", "#008000" ..
    */
  var markerBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the thickness of the Marker’s Border in pixels.
    * Default: 1
    * Example: 2,4 ..
    */
  var markerBorderThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the color of marker that is displayed on the Chart. Legend Marker for the series uses the same Color as set here unless overridden using legendMarkerColor property.
    * Default: dataSeries Color
    * Example: "red", "#008000" ..
    */
  var markerColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Size of the marker that is drawn. To display marker in area Chart, set markerSize to a value greater than zero.
    * For line, scatter chart, size it is automatically set unless overridden.
    * Default: auto. Zero for area chart
    * Example: 5, 10..
    */
  var markerSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets marker type to be rendered at each dataPoint. While markers are helpful in highlighting individual dataPoints, they do not help much when the dataPoints are crowded.
    * In case of large number of dataPoints it is recommended to disable markers in order to improve the appearance and performance of chart.
    * Same marker type is also used in legend unless overridden by legendMarkerType property.
    * Default: "circle"
    * Options: "none", "circle", "square", "triangle" and "cross"
    */
  var markerType: js.UndefOr[String] = js.native
  
  /**
    * Sets the mousemove event handler for dataSeries which is triggered when user Moves mouse on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  
  /**
    * Sets the mouseout event handler for dataSeries which is triggered when user moves mouse out of a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  
  /**
    * Sets the mouseover event handler for dataSeries which is triggered when user moves Mouse Over a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  
  /**
    * Sets the dataPoint Name. dataPoint name is shown in various places like toolTip & legend unless overridden.
    * Default: Automatically Named ("dataPoint 1", "dataPoint 2" .. )
    * Example: "apple", "mango" ..
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Default Tooltip can be modified at dataSeries or dataPoint level. You can add content to be displayed in toolTip using toolTipContent.
    * toolTipContent set at dataPoint will override toolTipContent set at dataSeries level.
    * Default: auto set depending on chart type.
    */
  var toolTipContent: js.UndefOr[String] = js.native
}
object ChartDataCommon {
  
  @scala.inline
  def apply(): ChartDataCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataCommon]
  }
  
  @scala.inline
  implicit class ChartDataCommonOps[Self <: ChartDataCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClick(value: /* event */ ChartEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = this.set("highlightEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightEnabled: Self = this.set("highlightEnabled", js.undefined)
    
    @scala.inline
    def setIndexLabel(value: String): Self = this.set("indexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabel: Self = this.set("indexLabel", js.undefined)
    
    @scala.inline
    def setIndexLabelBackgroundColor(value: String): Self = this.set("indexLabelBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelBackgroundColor: Self = this.set("indexLabelBackgroundColor", js.undefined)
    
    @scala.inline
    def setIndexLabelFontColor(value: String): Self = this.set("indexLabelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelFontColor: Self = this.set("indexLabelFontColor", js.undefined)
    
    @scala.inline
    def setIndexLabelFontFamily(value: String): Self = this.set("indexLabelFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelFontFamily: Self = this.set("indexLabelFontFamily", js.undefined)
    
    @scala.inline
    def setIndexLabelFontSize(value: Double): Self = this.set("indexLabelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelFontSize: Self = this.set("indexLabelFontSize", js.undefined)
    
    @scala.inline
    def setIndexLabelFontStyle(value: String): Self = this.set("indexLabelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelFontStyle: Self = this.set("indexLabelFontStyle", js.undefined)
    
    @scala.inline
    def setIndexLabelFontWeight(value: String): Self = this.set("indexLabelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelFontWeight: Self = this.set("indexLabelFontWeight", js.undefined)
    
    @scala.inline
    def setIndexLabelFormatter(value: /* e */ DataSeries => String): Self = this.set("indexLabelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexLabelFormatter: Self = this.set("indexLabelFormatter", js.undefined)
    
    @scala.inline
    def setIndexLabelLineColor(value: String): Self = this.set("indexLabelLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelLineColor: Self = this.set("indexLabelLineColor", js.undefined)
    
    @scala.inline
    def setIndexLabelLineDashType(value: DashType): Self = this.set("indexLabelLineDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelLineDashType: Self = this.set("indexLabelLineDashType", js.undefined)
    
    @scala.inline
    def setIndexLabelLineThickness(value: Double): Self = this.set("indexLabelLineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelLineThickness: Self = this.set("indexLabelLineThickness", js.undefined)
    
    @scala.inline
    def setIndexLabelOrientation(value: String): Self = this.set("indexLabelOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelOrientation: Self = this.set("indexLabelOrientation", js.undefined)
    
    @scala.inline
    def setIndexLabelPlacement(value: String): Self = this.set("indexLabelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabelPlacement: Self = this.set("indexLabelPlacement", js.undefined)
    
    @scala.inline
    def setLegendMarkerBorderColor(value: String): Self = this.set("legendMarkerBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendMarkerBorderColor: Self = this.set("legendMarkerBorderColor", js.undefined)
    
    @scala.inline
    def setLegendMarkerBorderThickness(value: Double): Self = this.set("legendMarkerBorderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendMarkerBorderThickness: Self = this.set("legendMarkerBorderThickness", js.undefined)
    
    @scala.inline
    def setLegendMarkerColor(value: String): Self = this.set("legendMarkerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendMarkerColor: Self = this.set("legendMarkerColor", js.undefined)
    
    @scala.inline
    def setLegendMarkerType(value: String): Self = this.set("legendMarkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendMarkerType: Self = this.set("legendMarkerType", js.undefined)
    
    @scala.inline
    def setLegendText(value: String): Self = this.set("legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendText: Self = this.set("legendText", js.undefined)
    
    @scala.inline
    def setMarkerBorderColor(value: String): Self = this.set("markerBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerBorderColor: Self = this.set("markerBorderColor", js.undefined)
    
    @scala.inline
    def setMarkerBorderThickness(value: Double): Self = this.set("markerBorderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerBorderThickness: Self = this.set("markerBorderThickness", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    
    @scala.inline
    def setMarkerType(value: String): Self = this.set("markerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerType: Self = this.set("markerType", js.undefined)
    
    @scala.inline
    def setMousemove(value: /* event */ ChartEvent => Unit): Self = this.set("mousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: /* event */ ChartEvent => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: /* event */ ChartEvent => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setToolTipContent(value: String): Self = this.set("toolTipContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTipContent: Self = this.set("toolTipContent", js.undefined)
  }
}
