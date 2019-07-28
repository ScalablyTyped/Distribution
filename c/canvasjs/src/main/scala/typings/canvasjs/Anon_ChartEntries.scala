package typings.canvasjs

import typings.canvasjs.canvasjsMod.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartEntries extends js.Object {
  var chart: Chart
  var entries: js.Array[Anon_DataPoint]
  var toolTip: this.type
}

object Anon_ChartEntries {
  @scala.inline
  def apply(chart: Chart, entries: js.Array[Anon_DataPoint], toolTip: Anon_ChartEntries): Anon_ChartEntries = {
    val __obj = js.Dynamic.literal(chart = chart, entries = entries, toolTip = toolTip)
  
    __obj.asInstanceOf[Anon_ChartEntries]
  }
}

