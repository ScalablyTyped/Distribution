package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnShowEvent extends StObject {
  
  /** Call this to prevent showing the context menu. */
  def preventDefault(): Unit
}
object OnShowEvent {
  
  @scala.inline
  def apply(preventDefault: () => Unit): OnShowEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[OnShowEvent]
  }
  
  @scala.inline
  implicit class OnShowEventMutableBuilder[Self <: OnShowEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
