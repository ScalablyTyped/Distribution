package typings.canvasjs

import typings.canvasjs.mod.Chart
import typings.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxis extends js.Object {
  var axis: ChartAxisYOptions
  var chart: Chart
  var stripline: this.type
}

object AnonAxis {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: Chart, stripline: AnonAxis): AnonAxis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAxis]
  }
}

