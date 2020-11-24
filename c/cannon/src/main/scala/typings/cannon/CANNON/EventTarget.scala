package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends js.Object {
  
  def addEventListener(`type`: String, listener: js.Function): EventTarget = js.native
  
  def dispatchEvent(event: IEvent): IEvent = js.native
  
  def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  
  def removeEventListener(`type`: String, listener: js.Function): EventTarget = js.native
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
  implicit class EventTargetOps[Self <: EventTarget] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, js.Function) => EventTarget): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispatchEvent(value: IEvent => IEvent): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasEventListener(value: (String, js.Function) => Boolean): Self = this.set("hasEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Function) => EventTarget): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
}
