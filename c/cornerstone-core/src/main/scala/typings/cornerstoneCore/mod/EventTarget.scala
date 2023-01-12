package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventTarget - Provides the [EventTarget](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget) interface
  */
trait EventTarget extends StObject {
  
  def addEventListener(`type`: Any, callback: Any): Unit
  
  def addEventNamespaceListener(`type`: Any, callback: Any): Unit
  
  def dispatchEvent(event: Any): Boolean
  
  def removeEventListener(`type`: Any, callback: Any): Unit
  
  def removeEventNamespaceListener(`type`: Any): Unit
}
object EventTarget {
  
  inline def apply(
    addEventListener: (Any, Any) => Unit,
    addEventNamespaceListener: (Any, Any) => Unit,
    dispatchEvent: Any => Boolean,
    removeEventListener: (Any, Any) => Unit,
    removeEventNamespaceListener: Any => Unit
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addEventNamespaceListener = js.Any.fromFunction2(addEventNamespaceListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction2(removeEventListener), removeEventNamespaceListener = js.Any.fromFunction1(removeEventNamespaceListener))
    __obj.asInstanceOf[EventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (Any, Any) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setAddEventNamespaceListener(value: (Any, Any) => Unit): Self = StObject.set(x, "addEventNamespaceListener", js.Any.fromFunction2(value))
    
    inline def setDispatchEvent(value: Any => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (Any, Any) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setRemoveEventNamespaceListener(value: Any => Unit): Self = StObject.set(x, "removeEventNamespaceListener", js.Any.fromFunction1(value))
  }
}
