package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: canvasjsLib.canvasjsMod.CanvasJSNs.ChartAxisYOptions
  var chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart
  var stripline: this.type
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: canvasjsLib.canvasjsMod.CanvasJSNs.ChartAxisYOptions,
    chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart,
    stripline: Anon_Axis
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, stripline = stripline)
  
    __obj.asInstanceOf[Anon_Axis]
  }
}

