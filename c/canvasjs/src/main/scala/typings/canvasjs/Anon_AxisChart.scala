package typings.canvasjs

import typings.canvasjs.canvasjsMod.Chart
import typings.canvasjs.canvasjsMod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisChart extends js.Object {
  var axis: ChartAxisYOptions
  var chart: Chart
  var label: String
  var value: Double
}

object Anon_AxisChart {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: Chart, label: String, value: Double): Anon_AxisChart = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, label = label, value = value)
  
    __obj.asInstanceOf[Anon_AxisChart]
  }
}

