package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficControl extends js.Object {
  
  def hide(): Unit = js.native
  
  def setPanelOffset(offset: Size): Unit = js.native
  
  def show(): Unit = js.native
}
object TrafficControl {
  
  @scala.inline
  def apply(hide: () => Unit, setPanelOffset: Size => Unit, show: () => Unit): TrafficControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setPanelOffset = js.Any.fromFunction1(setPanelOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TrafficControl]
  }
  
  @scala.inline
  implicit class TrafficControlOps[Self <: TrafficControl] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPanelOffset(value: Size => Unit): Self = this.set("setPanelOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
