package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataPoint extends js.Object {
  var chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart
  var dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint
  var dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions
  var index: js.UndefOr[scala.Double] = js.undefined
  var pencent: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChartDataPoint {
  @scala.inline
  def apply(
    chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart,
    dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint,
    dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions,
    index: scala.Int | scala.Double = null,
    pencent: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): Anon_ChartDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("dataPoint")(dataPoint)
    __obj.updateDynamic("dataSeries")(dataSeries)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pencent != null) __obj.updateDynamic("pencent")(pencent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDataPoint]
  }
}

