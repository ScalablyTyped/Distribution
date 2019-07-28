package typings.canvasjs

import typings.canvasjs.canvasjsMod.Chart
import typings.canvasjs.canvasjsMod.ChartDataPoint
import typings.canvasjs.canvasjsMod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataPoint extends js.Object {
  var chart: Chart
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
  var index: js.UndefOr[Double] = js.undefined
  var pencent: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object Anon_ChartDataPoint {
  @scala.inline
  def apply(
    chart: Chart,
    dataPoint: ChartDataPoint,
    dataSeries: ChartDataSeriesOptions,
    index: Int | Double = null,
    pencent: Int | Double = null,
    total: Int | Double = null
  ): Anon_ChartDataPoint = {
    val __obj = js.Dynamic.literal(chart = chart, dataPoint = dataPoint, dataSeries = dataSeries)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pencent != null) __obj.updateDynamic("pencent")(pencent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDataPoint]
  }
}

