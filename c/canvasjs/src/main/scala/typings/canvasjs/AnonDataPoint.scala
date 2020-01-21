package typings.canvasjs

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataPoint extends js.Object {
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
}

object AnonDataPoint {
  @scala.inline
  def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): AnonDataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataPoint]
  }
}

