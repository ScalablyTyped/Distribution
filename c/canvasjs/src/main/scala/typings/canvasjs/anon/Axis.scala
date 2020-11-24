package typings.canvasjs.anon

import typings.canvasjs.mod.ChartAxisYOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends js.Object {
  
  var axis: ChartAxisYOptions = js.native
  
  var chart: typings.canvasjs.mod.Chart = js.native
  
  var stripline: this.type = js.native
}
object Axis {
  
  @scala.inline
  def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, stripline: Axis): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: ChartAxisYOptions): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: typings.canvasjs.mod.Chart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripline(value: Axis): Self = this.set("stripline", value.asInstanceOf[js.Any])
  }
}
