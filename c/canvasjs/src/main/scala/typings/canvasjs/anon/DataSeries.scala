package typings.canvasjs.anon

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSeries extends js.Object {
  var chart: typings.canvasjs.mod.Chart = js.native
  var dataPoint: ChartDataPoint = js.native
  var dataSeries: ChartDataSeriesOptions = js.native
  var index: js.UndefOr[Double] = js.native
  var pencent: js.UndefOr[Double] = js.native
  var total: js.UndefOr[Double] = js.native
}

object DataSeries {
  @scala.inline
  def apply(chart: typings.canvasjs.mod.Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataSeries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
  @scala.inline
  implicit class DataSeriesOps[Self <: DataSeries] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPencent(value: Double): Self = this.set("pencent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePencent: Self = this.set("pencent", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

