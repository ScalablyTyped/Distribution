package typings.cordovaPluginInappbrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowserEventListenerObject extends StObject {
  
  def handleEvent(evt: InAppBrowserEvent): Unit
}
object InAppBrowserEventListenerObject {
  
  @scala.inline
  def apply(handleEvent: InAppBrowserEvent => Unit): InAppBrowserEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InAppBrowserEventListenerObject]
  }
  
  @scala.inline
  implicit class InAppBrowserEventListenerObjectMutableBuilder[Self <: InAppBrowserEventListenerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleEvent(value: InAppBrowserEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
