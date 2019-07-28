package typings.canvasjs

import typings.canvasjs.canvasjsMod.ChartDataPoint
import typings.canvasjs.canvasjsMod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataPoint extends js.Object {
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
}

object Anon_DataPoint {
  @scala.inline
  def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): Anon_DataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint, dataSeries = dataSeries)
  
    __obj.asInstanceOf[Anon_DataPoint]
  }
}

