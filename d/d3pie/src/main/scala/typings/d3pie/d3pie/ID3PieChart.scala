package typings.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ID3PieChart extends js.Object {
  
  def closeSegment(index: Unit): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getOpenSegment(): js.Any = js.native
  
  def openSegment(index: Double): Unit = js.native
  
  def redraw(): Unit = js.native
  
  def updateProp(propKey: String, value: js.Any): Unit = js.native
}
object ID3PieChart {
  
  @scala.inline
  def apply(
    closeSegment: Unit => Unit,
    destroy: () => Unit,
    getOpenSegment: () => js.Any,
    openSegment: Double => Unit,
    redraw: () => Unit,
    updateProp: (String, js.Any) => Unit
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1(closeSegment), destroy = js.Any.fromFunction0(destroy), getOpenSegment = js.Any.fromFunction0(getOpenSegment), openSegment = js.Any.fromFunction1(openSegment), redraw = js.Any.fromFunction0(redraw), updateProp = js.Any.fromFunction2(updateProp))
    __obj.asInstanceOf[ID3PieChart]
  }
  
  @scala.inline
  implicit class ID3PieChartOps[Self <: ID3PieChart] (val x: Self) extends AnyVal {
    
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
    def setCloseSegment(value: Unit => Unit): Self = this.set("closeSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenSegment(value: () => js.Any): Self = this.set("getOpenSegment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenSegment(value: Double => Unit): Self = this.set("openSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedraw(value: () => Unit): Self = this.set("redraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateProp(value: (String, js.Any) => Unit): Self = this.set("updateProp", js.Any.fromFunction2(value))
  }
}
