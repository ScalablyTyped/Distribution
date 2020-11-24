package typings.carbonComponents.copyButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait CopyButton extends js.Object {
  
  def handleAnimationEnd(event: js.Any): Unit = js.native
  
  def handleClick(): Unit = js.native
}
object CopyButton {
  
  @scala.inline
  def apply(handleAnimationEnd: js.Any => Unit, handleClick: () => Unit): CopyButton = {
    val __obj = js.Dynamic.literal(handleAnimationEnd = js.Any.fromFunction1(handleAnimationEnd), handleClick = js.Any.fromFunction0(handleClick))
    __obj.asInstanceOf[CopyButton]
  }
  
  @scala.inline
  implicit class CopyButtonOps[Self <: CopyButton] (val x: Self) extends AnyVal {
    
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
    def setHandleAnimationEnd(value: js.Any => Unit): Self = this.set("handleAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClick(value: () => Unit): Self = this.set("handleClick", js.Any.fromFunction0(value))
  }
}
