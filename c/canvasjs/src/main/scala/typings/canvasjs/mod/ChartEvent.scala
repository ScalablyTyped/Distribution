package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartEvent extends js.Object {
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
}

