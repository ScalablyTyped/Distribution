package typings.chartjsPluginCrosshair.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  def panZoom(increment: Double): Unit = js.native
}
object Chart {
  
  @scala.inline
  def apply(panZoom: Double => Unit): Chart = {
    val __obj = js.Dynamic.literal(panZoom = js.Any.fromFunction1(panZoom))
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    
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
    def setPanZoom(value: Double => Unit): Self = this.set("panZoom", js.Any.fromFunction1(value))
  }
}
