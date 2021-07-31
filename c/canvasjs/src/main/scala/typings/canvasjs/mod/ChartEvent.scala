package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartEvent extends StObject {
  
  /**
    * The chart object
    */
  var chart: Chart
  
  /**
    * The datapoint options
    */
  var dataPoint: ChartDataPoint
  
  /**
    * The index of the data point
    */
  var dataPointIndex: Double
  
  /**
    * The data series options
    */
  var dataSeries: ChartDataSeriesOptions
  
  /**
    * The index of the data series
    */
  var dataSeriesIndex: Double
  
  /**
    * The x value of the item
    */
  var x: js.Any
  
  /**
    * The y value of the item
    */
  var y: Double
}
object ChartEvent {
  
  @scala.inline
  def apply(
    chart: Chart,
    dataPoint: ChartDataPoint,
    dataPointIndex: Double,
    dataSeries: ChartDataSeriesOptions,
    dataSeriesIndex: Double,
    x: js.Any,
    y: Double
  ): ChartEvent = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataPointIndex = dataPointIndex.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], dataSeriesIndex = dataSeriesIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartEvent]
  }
  
  @scala.inline
  implicit class ChartEventMutableBuilder[Self <: ChartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPointIndex(value: Double): Self = StObject.set(x, "dataPointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSeriesIndex(value: Double): Self = StObject.set(x, "dataSeriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
