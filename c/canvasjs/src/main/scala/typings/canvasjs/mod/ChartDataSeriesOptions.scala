package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDataSeriesOptions
  extends StObject
     with ChartDataCommon {
  
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
  
  inline def apply(dataPoints: js.Array[ChartDataPoint]): ChartDataSeriesOptions = {
    val __obj = js.Dynamic.literal(dataPoints = dataPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSeriesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartDataSeriesOptions] (val x: Self) extends AnyVal {
    
    inline def setAxisXIndex(value: Double): Self = StObject.set(x, "axisXIndex", value.asInstanceOf[js.Any])
    
    inline def setAxisXIndexUndefined: Self = StObject.set(x, "axisXIndex", js.undefined)
    
    inline def setAxisXType(value: String): Self = StObject.set(x, "axisXType", value.asInstanceOf[js.Any])
    
    inline def setAxisXTypeUndefined: Self = StObject.set(x, "axisXType", js.undefined)
    
    inline def setAxisYIndex(value: Double): Self = StObject.set(x, "axisYIndex", value.asInstanceOf[js.Any])
    
    inline def setAxisYIndexUndefined: Self = StObject.set(x, "axisYIndex", js.undefined)
    
    inline def setAxisYType(value: String): Self = StObject.set(x, "axisYType", value.asInstanceOf[js.Any])
    
    inline def setAxisYTypeUndefined: Self = StObject.set(x, "axisYType", js.undefined)
    
    inline def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
    
    inline def setBevelEnabledUndefined: Self = StObject.set(x, "bevelEnabled", js.undefined)
    
    inline def setConnectNullData(value: Boolean): Self = StObject.set(x, "connectNullData", value.asInstanceOf[js.Any])
    
    inline def setConnectNullDataUndefined: Self = StObject.set(x, "connectNullData", js.undefined)
    
    inline def setDataPoints(value: js.Array[ChartDataPoint]): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
    
    inline def setDataPointsVarargs(value: ChartDataPoint*): Self = StObject.set(x, "dataPoints", js.Array(value*))
    
    inline def setExplodeOnClick(value: Boolean): Self = StObject.set(x, "explodeOnClick", value.asInstanceOf[js.Any])
    
    inline def setExplodeOnClickUndefined: Self = StObject.set(x, "explodeOnClick", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setLineDashType(value: DashType): Self = StObject.set(x, "lineDashType", value.asInstanceOf[js.Any])
    
    inline def setLineDashTypeUndefined: Self = StObject.set(x, "lineDashType", js.undefined)
    
    inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    inline def setNullDataLineDashType(value: DashType): Self = StObject.set(x, "nullDataLineDashType", value.asInstanceOf[js.Any])
    
    inline def setNullDataLineDashTypeUndefined: Self = StObject.set(x, "nullDataLineDashType", js.undefined)
    
    inline def setPercentFormatString(value: String): Self = StObject.set(x, "percentFormatString", value.asInstanceOf[js.Any])
    
    inline def setPercentFormatStringUndefined: Self = StObject.set(x, "percentFormatString", js.undefined)
    
    inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRisingColor(value: String): Self = StObject.set(x, "risingColor", value.asInstanceOf[js.Any])
    
    inline def setRisingColorUndefined: Self = StObject.set(x, "risingColor", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setXValueFormatString(value: String): Self = StObject.set(x, "xValueFormatString", value.asInstanceOf[js.Any])
    
    inline def setXValueFormatStringUndefined: Self = StObject.set(x, "xValueFormatString", js.undefined)
    
    inline def setXValueType(value: String): Self = StObject.set(x, "xValueType", value.asInstanceOf[js.Any])
    
    inline def setXValueTypeUndefined: Self = StObject.set(x, "xValueType", js.undefined)
    
    inline def setYValueFormatString(value: String): Self = StObject.set(x, "yValueFormatString", value.asInstanceOf[js.Any])
    
    inline def setYValueFormatStringUndefined: Self = StObject.set(x, "yValueFormatString", js.undefined)
    
    inline def setZValueFormatString(value: String): Self = StObject.set(x, "zValueFormatString", value.asInstanceOf[js.Any])
    
    inline def setZValueFormatStringUndefined: Self = StObject.set(x, "zValueFormatString", js.undefined)
  }
}
