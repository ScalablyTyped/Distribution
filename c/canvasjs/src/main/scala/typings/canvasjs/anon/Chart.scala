package typings.canvasjs.anon

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  var chart: typings.canvasjs.mod.Chart = js.native
  var dataPoint: ChartDataPoint = js.native
  var dataSeries: ChartDataSeriesOptions = js.native
  var legend: this.type = js.native
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
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
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
    def setChart(value: typings.canvasjs.mod.Chart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataPoint(value: ChartDataPoint): Self = this.set("dataPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSeries(value: ChartDataSeriesOptions): Self = this.set("dataSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegend(value: Chart): Self = this.set("legend", value.asInstanceOf[js.Any])
  }
  
}

