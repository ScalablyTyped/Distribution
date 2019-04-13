package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataPoint extends js.Object {
  var chart: canvasjsLib.canvasjsMod.Chart
  var dataPoint: canvasjsLib.canvasjsMod.ChartDataPoint
  var dataSeries: canvasjsLib.canvasjsMod.ChartDataSeriesOptions
  var index: js.UndefOr[scala.Double] = js.undefined
  var pencent: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChartDataPoint {
  @scala.inline
  def apply(
    chart: canvasjsLib.canvasjsMod.Chart,
    dataPoint: canvasjsLib.canvasjsMod.ChartDataPoint,
    dataSeries: canvasjsLib.canvasjsMod.ChartDataSeriesOptions,
    index: scala.Int | scala.Double = null,
    pencent: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): Anon_ChartDataPoint = {
    val __obj = js.Dynamic.literal(chart = chart, dataPoint = dataPoint, dataSeries = dataSeries)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pencent != null) __obj.updateDynamic("pencent")(pencent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDataPoint]
  }
}

