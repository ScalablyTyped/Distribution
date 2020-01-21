package typings.canvasjs

import typings.canvasjs.mod.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChartEntries extends js.Object {
  var chart: Chart
  var entries: js.Array[AnonDataPoint]
  var toolTip: this.type
}

object AnonChartEntries {
  @scala.inline
  def apply(chart: Chart, entries: js.Array[AnonDataPoint], toolTip: AnonChartEntries): AnonChartEntries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChartEntries]
  }
}

