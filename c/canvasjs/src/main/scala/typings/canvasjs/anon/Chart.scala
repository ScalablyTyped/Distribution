package typings.canvasjs.anon

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  var chart: typings.canvasjs.mod.Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var legend: this.type
}

object Chart {
  @scala.inline
  def apply(
    chart: typings.canvasjs.mod.Chart,
    dataPoint: ChartDataPoint,
    dataSeries: ChartDataSeriesOptions,
    legend: Chart
  ): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
}

