package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

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

