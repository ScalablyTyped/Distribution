package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataPoint extends js.Object {
  var dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint
  var dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions
}

object Anon_DataPoint {
  @scala.inline
  def apply(
    dataPoint: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataPoint,
    dataSeries: canvasjsLib.canvasjsMod.CanvasJSNs.ChartDataSeriesOptions
  ): Anon_DataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataPoint")(dataPoint)
    __obj.updateDynamic("dataSeries")(dataSeries)
    __obj.asInstanceOf[Anon_DataPoint]
  }
}

