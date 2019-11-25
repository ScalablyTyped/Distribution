package typings.canvasjs

import typings.canvasjs.canvasjsMod.Chart
import typings.canvasjs.canvasjsMod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: ChartAxisYOptions
  var chart: Chart
  var stripline: this.type
}

object Anon_Axis {
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: Chart, stripline: Anon_Axis): Anon_Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Axis]
  }
}

