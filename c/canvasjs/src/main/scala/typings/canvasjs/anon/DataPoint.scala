package typings.canvasjs.anon

import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
}

object DataPoint {
  @scala.inline
  def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

