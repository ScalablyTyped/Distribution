package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataPoint extends js.Object {
  var dataPoint: canvasjsLib.canvasjsMod.ChartDataPoint
  var dataSeries: canvasjsLib.canvasjsMod.ChartDataSeriesOptions
}

object Anon_DataPoint {
  @scala.inline
  def apply(
    dataPoint: canvasjsLib.canvasjsMod.ChartDataPoint,
    dataSeries: canvasjsLib.canvasjsMod.ChartDataSeriesOptions
  ): Anon_DataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint, dataSeries = dataSeries)
  
    __obj.asInstanceOf[Anon_DataPoint]
  }
}

