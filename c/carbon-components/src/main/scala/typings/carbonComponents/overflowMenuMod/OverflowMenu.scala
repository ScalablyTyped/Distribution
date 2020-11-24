package typings.carbonComponents.overflowMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait OverflowMenu extends js.Object {
  
  def _handleDocumentClick(event: js.Any): Unit = js.native
  
  def _handleKeyPress(event: js.Any): Unit = js.native
  
  def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
  
  def getCurrentNavigation(): js.Any = js.native
  
  def navigate(direction: js.Any): Unit = js.native
}
object OverflowMenu {
  
  @scala.inline
  def apply(
    _handleDocumentClick: js.Any => Unit,
    _handleKeyPress: js.Any => Unit,
    changeState: (js.Any, js.Any, js.Any) => Unit,
    getCurrentNavigation: () => js.Any,
    navigate: js.Any => Unit
  ): OverflowMenu = {
    val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyPress = js.Any.fromFunction1(_handleKeyPress), changeState = js.Any.fromFunction3(changeState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
    __obj.asInstanceOf[OverflowMenu]
  }
  
  @scala.inline
  implicit class OverflowMenuOps[Self <: OverflowMenu] (val x: Self) extends AnyVal {
    
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
    def set_handleDocumentClick(value: js.Any => Unit): Self = this.set("_handleDocumentClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_handleKeyPress(value: js.Any => Unit): Self = this.set("_handleKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("changeState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCurrentNavigation(value: () => js.Any): Self = this.set("getCurrentNavigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigate(value: js.Any => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
  }
}
