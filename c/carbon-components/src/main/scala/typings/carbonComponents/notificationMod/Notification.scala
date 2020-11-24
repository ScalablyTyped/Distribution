package typings.carbonComponents.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Notification extends js.Object {
  
  def _changeState(state: js.Any, callback: js.Any): Unit = js.native
  
  def remove(): Unit = js.native
}
object Notification {
  
  @scala.inline
  def apply(_changeState: (js.Any, js.Any) => Unit, remove: () => Unit): Notification = {
    val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
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
    def set_changeState(value: (js.Any, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}
