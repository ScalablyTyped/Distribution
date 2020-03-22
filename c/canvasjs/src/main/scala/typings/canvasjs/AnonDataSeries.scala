package typings.canvasjs

import typings.canvasjs.mod.Chart
import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSeries extends js.Object {
  var chart: Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var index: js.UndefOr[Double] = js.undefined
  var pencent: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object AnonDataSeries {
  @scala.inline
  def apply(
    chart: Chart,
    dataPoint: ChartDataPoint,
    dataSeries: ChartDataSeriesOptions,
    index: Int | Double = null,
    pencent: Int | Double = null,
    total: Int | Double = null
  ): AnonDataSeries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pencent != null) __obj.updateDynamic("pencent")(pencent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataSeries]
  }
}

