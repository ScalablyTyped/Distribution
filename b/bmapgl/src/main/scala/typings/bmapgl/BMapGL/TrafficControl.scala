package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficControl extends StObject {
  
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
  implicit class TrafficControlMutableBuilder[Self <: TrafficControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPanelOffset(value: Size => Unit): Self = StObject.set(x, "setPanelOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
