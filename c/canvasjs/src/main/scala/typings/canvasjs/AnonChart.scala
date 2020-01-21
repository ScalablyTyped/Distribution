package typings.canvasjs

import typings.canvasjs.mod.Chart
import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChart extends js.Object {
  var chart: Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var legend: this.type
}

object AnonChart {
  @scala.inline
  def apply(chart: Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions, legend: AnonChart): AnonChart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChart]
  }
}

