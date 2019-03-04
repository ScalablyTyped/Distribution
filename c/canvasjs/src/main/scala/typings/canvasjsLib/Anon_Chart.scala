package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chart extends js.Object {
  var chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart
  var dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint
  var dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions
  var legend: this.type
}

object Anon_Chart {
  @scala.inline
  def apply(
    chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart,
    dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint,
    dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions,
    legend: Anon_Chart
  ): Anon_Chart = {
    val __obj = js.Dynamic.literal(chart = chart, dataPoint = dataPoint, dataSeries = dataSeries, legend = legend)
  
    __obj.asInstanceOf[Anon_Chart]
  }
}

