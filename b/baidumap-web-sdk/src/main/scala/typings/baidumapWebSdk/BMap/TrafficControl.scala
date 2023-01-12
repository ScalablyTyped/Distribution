package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficControl extends StObject {
  
  def hide(): Unit
  
  def setPanelOffset(offset: Size): Unit
  
  def show(): Unit
}
object TrafficControl {
  
  inline def apply(hide: () => Unit, setPanelOffset: Size => Unit, show: () => Unit): TrafficControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setPanelOffset = js.Any.fromFunction1(setPanelOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TrafficControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficControl] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setSetPanelOffset(value: Size => Unit): Self = StObject.set(x, "setPanelOffset", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
