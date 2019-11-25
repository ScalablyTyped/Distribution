package typings.canvasjs

import typings.canvasjs.canvasjsMod.Chart
import typings.canvasjs.canvasjsMod.ChartDataPoint
import typings.canvasjs.canvasjsMod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chart extends js.Object {
  var chart: Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var legend: this.type
}

object Anon_Chart {
  @scala.inline
  def apply(chart: Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions, legend: Anon_Chart): Anon_Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Chart]
  }
}

