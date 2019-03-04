package typings
package canvasjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisChart extends js.Object {
  var axis: canvasjsLib.canvasjsMod.CanvasJSNs.ChartAxisYOptions
  var chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart
  var label: java.lang.String
  var value: scala.Double
}

object Anon_AxisChart {
  @scala.inline
  def apply(
    axis: canvasjsLib.canvasjsMod.CanvasJSNs.ChartAxisYOptions,
    chart: canvasjsLib.canvasjsMod.CanvasJSNs.Chart,
    label: java.lang.String,
    value: scala.Double
  ): Anon_AxisChart = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, label = label, value = value)
  
    __obj.asInstanceOf[Anon_AxisChart]
  }
}

