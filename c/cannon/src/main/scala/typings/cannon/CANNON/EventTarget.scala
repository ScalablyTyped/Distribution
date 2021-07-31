package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function): EventTarget
  
  def dispatchEvent(event: IEvent): IEvent
  
  def hasEventListener(`type`: String, listener: js.Function): Boolean
  
  def removeEventListener(`type`: String, listener: js.Function): EventTarget
}
object EventTarget {
  
  @scala.inline
  def apply(
    addEventListener: (String, js.Function) => EventTarget,
    dispatchEvent: IEvent => IEvent,
    hasEventListener: (String, js.Function) => Boolean,
    removeEventListener: (String, js.Function) => EventTarget
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction2(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[EventTarget]
  }
  
  @scala.inline
  implicit class EventTargetMutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (String, js.Function) => EventTarget): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispatchEvent(value: IEvent => IEvent): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasEventListener(value: (String, js.Function) => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function) => EventTarget): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
