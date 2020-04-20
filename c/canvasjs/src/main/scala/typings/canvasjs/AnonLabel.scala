package typings.canvasjs

import typings.canvasjs.mod.Chart
import typings.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var axis: ChartAxisYOptions
  var chart: Chart
  var label: String
  var value: Double
}

object AnonLabel {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: Chart, label: String, value: Double): AnonLabel = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

