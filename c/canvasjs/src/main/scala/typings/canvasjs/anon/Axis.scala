package typings.canvasjs.anon

import typings.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  var axis: ChartAxisYOptions
  var chart: typings.canvasjs.mod.Chart
  var stripline: this.type
}

object Axis {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, stripline: Axis): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

