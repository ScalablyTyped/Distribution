package typings
package canvasjsLib.canvasjsMod

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
  var dataPointIndex: scala.Double
  /**
    * The data series options
    */
  var dataSeries: ChartDataSeriesOptions
  /**
    * The index of the data series
    */
  var dataSeriesIndex: scala.Double
  /**
    * The x value of the item
    */
  var x: js.Any
  /**
    * The y value of the item
    */
  var y: scala.Double
}

object ChartEvent {
  @scala.inline
  def apply(
    chart: Chart,
    dataPoint: ChartDataPoint,
    dataPointIndex: scala.Double,
    dataSeries: ChartDataSeriesOptions,
    dataSeriesIndex: scala.Double,
    x: js.Any,
    y: scala.Double
  ): ChartEvent = {
    val __obj = js.Dynamic.literal(chart = chart, dataPoint = dataPoint, dataPointIndex = dataPointIndex, dataSeries = dataSeries, dataSeriesIndex = dataSeriesIndex, x = x, y = y)
  
    __obj.asInstanceOf[ChartEvent]
  }
}

