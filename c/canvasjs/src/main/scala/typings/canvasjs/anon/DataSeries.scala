package typings.canvasjs.anon

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSeries extends js.Object {
  var chart: typings.canvasjs.mod.Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var index: js.UndefOr[Double] = js.undefined
  var pencent: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object DataSeries {
  @scala.inline
  def apply(
    chart: typings.canvasjs.mod.Chart,
    dataPoint: ChartDataPoint,
    dataSeries: ChartDataSeriesOptions,
    index: js.UndefOr[Double] = js.undefined,
    pencent: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): DataSeries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pencent)) __obj.updateDynamic("pencent")(pencent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
}

