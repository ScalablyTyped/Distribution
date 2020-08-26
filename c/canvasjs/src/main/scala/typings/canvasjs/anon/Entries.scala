package typings.canvasjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries extends js.Object {
  var chart: typings.canvasjs.mod.Chart = js.native
  var entries: js.Array[DataPoint] = js.native
  var toolTip: this.type = js.native
}

object Entries {
  @scala.inline
  def apply(chart: typings.canvasjs.mod.Chart, entries: js.Array[DataPoint], toolTip: Entries): Entries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChart(value: typings.canvasjs.mod.Chart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: DataPoint*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[DataPoint]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTip(value: Entries): Self = this.set("toolTip", value.asInstanceOf[js.Any])
  }
  
}

