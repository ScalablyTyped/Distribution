package typings.canvasjs

import typings.canvasjs.mod.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries extends js.Object {
  var chart: Chart
  var entries: js.Array[AnonDataPoint]
  var toolTip: this.type
}

object AnonEntries {
  @scala.inline
  def apply(chart: Chart, entries: js.Array[AnonDataPoint], toolTip: AnonEntries): AnonEntries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntries]
  }
}

