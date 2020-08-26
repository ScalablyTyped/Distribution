package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataSeriesOptions extends ChartDataCommon {
  /**
    * Setting axisXIndex lets you choose to which X axis the dataSeries should be attached.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first X axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisXIndex: js.UndefOr[Double] = js.native
  /**
    * Setting axisXType lets you choose between primary and secondary X Axis for a dataSeries to plot against. By choosing “secondary” Axis you can plot the series against axisX2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary X axis.
    */
  var axisXType: js.UndefOr[String] = js.native
  /**
    * Setting axisYIndex lets you choose to which Y axis the dataSeries should be attached to.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first Y axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisYIndex: js.UndefOr[Double] = js.native
  /**
    * Setting axisYType lets you choose between primary and secondary Y Axis for a dataSeries to plot against. By choosing "secondary" Axis you can plot the series against axisY2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary Y axis.
    * Default: "primary"
    * Options: "primary", "secondary"
    */
  var axisYType: js.UndefOr[String] = js.native
  /**
    * Sets the bevel property, which creates a chiselled effect at the corners of a Column Charts and Bar Charts.
    * Default: "true"
    * Example: "true", "false"
    */
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  /**
    * By default, a line breaks wherever a null dataPoint (y = null) is present.
    * You can change this behaviour to draw a line between adjacent non-null dataPoints by setting connectNullData to true.
    * Default: false
    * Example: true, false
    */
  var connectNullData: js.UndefOr[Boolean] = js.native
  /**
    * It represents collection dataPoint inside dataSeries.
    */
  var dataPoints: js.Array[ChartDataPoint] = js.native
  /**
    * Enables or disables exploding of Pie/Doughnut segment on click.
    * Default: true
    * Options: false, true
    */
  var explodeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Sets opacity of the filled color.
    * Default: .7 for Area Charts and 1 for all other chart types.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * innerRadius property allows you to set a Doughnut chart’s inner radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the outer radius of doughnut chart.
    * Default: “70%”
    * Example: 200, 150, “90%”, “75%”
    */
  var innerRadius: js.UndefOr[Double | String] = js.native
  /**
    * Sets the Line Dash Type for all Line and Area Charts.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets the thickness of line in line charts and area charts.
    * Default: 2
    * Example: 3,4..
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the Line Dash Type of line wherever null data is present.
    * Note:
    * 1.Will effect only if connectNullData is set to true.
    * 2.Supported with all Line and Area Charts.
    * 3.Not Supported on IE8.
    * Default: "dash"
    */
  var nullDataLineDashType: js.UndefOr[DashType] = js.native
  /**
    * Defines how percent values are formatted before they appear on the indexLabel or toolTip. You can format percent values using this property.
    */
  var percentFormatString: js.UndefOr[String] = js.native
  /**
    * radius property allows you to set the Pie/Doughnut chart’s (outer) radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the plot area’s size.
    * By default, a pie/doughnut chart’s size(radius) changes in order to best fit the indexLabels. This can lead to charts of different sizes in the same page.
    * In order to override this behavior and set equal sizes to all pie/doughnut charts in a page, you can use radius property.
    * Default: Automatically calculate in order to best fit the indexLabels.
    * Example: 200, 150, “90%”, “75%”
    */
  var radius: js.UndefOr[Double | String] = js.native
  /**
    * In candle Stick chart, when Closing Price is greater than Opening price, the body is filled with white by default and it can be overridden by risingColor property.
    * Default: "white"
    * Options: "red", "#DD7E86", etc.
    */
  var risingColor: js.UndefOr[String] = js.native
  /**
    * Setting this property to true makes the dataSeries to appear in legend. In case of pie/ doughnut chart, dataPoints of the single series chart appear in legend.
    * Default: false
    * Options: false, true
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * Sets the starting Angle of the Pie or Doughnut Chart in degrees.
    * Default: 0
    * Example: 30, 240, -100..
    */
  var startAngle: js.UndefOr[Double] = js.native
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
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of dataSeries. Data Series is visible by default and you can hide the same by setting visible property to false.
    * Default: true
    * Example: true, false
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Defines how x axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var xValueFormatString: js.UndefOr[String] = js.native
  /**
    * This defines the data type of x values. Data Type is normally figured out by default based on the object type that is assigned to x.
    * But if you are providing time stamp (which is integer) values instead of Date objects, you’ll have to explicitly set the xValueType to "dateTime".
    * Default: Automatically Calculated
    * Options: "number", "dateTime"
    */
  var xValueType: js.UndefOr[String] = js.native
  /**
    * Defines how y axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var yValueFormatString: js.UndefOr[String] = js.native
  /**
    * Defines how z values is formatted before they appear on the indexLabel or toolTip. You can format numbers using this property.
    */
  var zValueFormatString: js.UndefOr[String] = js.native
}

object ChartDataSeriesOptions {
  @scala.inline
  def apply(dataPoints: js.Array[ChartDataPoint]): ChartDataSeriesOptions = {
    val __obj = js.Dynamic.literal(dataPoints = dataPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSeriesOptions]
  }
  @scala.inline
  implicit class ChartDataSeriesOptionsOps[Self <: ChartDataSeriesOptions] (val x: Self) extends AnyVal {
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
    def setDataPointsVarargs(value: ChartDataPoint*): Self = this.set("dataPoints", js.Array(value :_*))
    @scala.inline
    def setDataPoints(value: js.Array[ChartDataPoint]): Self = this.set("dataPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisXIndex(value: Double): Self = this.set("axisXIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisXIndex: Self = this.set("axisXIndex", js.undefined)
    @scala.inline
    def setAxisXType(value: String): Self = this.set("axisXType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisXType: Self = this.set("axisXType", js.undefined)
    @scala.inline
    def setAxisYIndex(value: Double): Self = this.set("axisYIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisYIndex: Self = this.set("axisYIndex", js.undefined)
    @scala.inline
    def setAxisYType(value: String): Self = this.set("axisYType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisYType: Self = this.set("axisYType", js.undefined)
    @scala.inline
    def setBevelEnabled(value: Boolean): Self = this.set("bevelEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelEnabled: Self = this.set("bevelEnabled", js.undefined)
    @scala.inline
    def setConnectNullData(value: Boolean): Self = this.set("connectNullData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectNullData: Self = this.set("connectNullData", js.undefined)
    @scala.inline
    def setExplodeOnClick(value: Boolean): Self = this.set("explodeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplodeOnClick: Self = this.set("explodeOnClick", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setLineDashType(value: DashType): Self = this.set("lineDashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashType: Self = this.set("lineDashType", js.undefined)
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    @scala.inline
    def setNullDataLineDashType(value: DashType): Self = this.set("nullDataLineDashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullDataLineDashType: Self = this.set("nullDataLineDashType", js.undefined)
    @scala.inline
    def setPercentFormatString(value: String): Self = this.set("percentFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentFormatString: Self = this.set("percentFormatString", js.undefined)
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRisingColor(value: String): Self = this.set("risingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRisingColor: Self = this.set("risingColor", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setXValueFormatString(value: String): Self = this.set("xValueFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXValueFormatString: Self = this.set("xValueFormatString", js.undefined)
    @scala.inline
    def setXValueType(value: String): Self = this.set("xValueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXValueType: Self = this.set("xValueType", js.undefined)
    @scala.inline
    def setYValueFormatString(value: String): Self = this.set("yValueFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYValueFormatString: Self = this.set("yValueFormatString", js.undefined)
    @scala.inline
    def setZValueFormatString(value: String): Self = this.set("zValueFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZValueFormatString: Self = this.set("zValueFormatString", js.undefined)
  }
  
}

