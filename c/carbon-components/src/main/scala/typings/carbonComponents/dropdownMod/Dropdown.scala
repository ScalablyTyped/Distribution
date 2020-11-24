package typings.carbonComponents.dropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Dropdown extends js.Object {
  
  def _focusCleanup(): Unit = js.native
  
  def _handleKeyDown(event: js.Any): Unit = js.native
  
  def _toggle(event: js.Any): Unit = js.native
  
  def _updateFocus(itemToFocus: js.Any): Unit = js.native
  
  def getCurrentNavigation(): js.Any = js.native
  
  def handleBlur(): Unit = js.native
  
  def navigate(direction: js.Any): Unit = js.native
  
  def select(itemToSelect: js.Any): Unit = js.native
}
object Dropdown {
  
  @scala.inline
  def apply(
    _focusCleanup: () => Unit,
    _handleKeyDown: js.Any => Unit,
    _toggle: js.Any => Unit,
    _updateFocus: js.Any => Unit,
    getCurrentNavigation: () => js.Any,
    handleBlur: () => Unit,
    navigate: js.Any => Unit,
    select: js.Any => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(_focusCleanup = js.Any.fromFunction0(_focusCleanup), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _toggle = js.Any.fromFunction1(_toggle), _updateFocus = js.Any.fromFunction1(_updateFocus), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), handleBlur = js.Any.fromFunction0(handleBlur), navigate = js.Any.fromFunction1(navigate), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[Dropdown]
  }
  
  @scala.inline
  implicit class DropdownOps[Self <: Dropdown] (val x: Self) extends AnyVal {
    
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
    def set_focusCleanup(value: () => Unit): Self = this.set("_focusCleanup", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handleKeyDown(value: js.Any => Unit): Self = this.set("_handleKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_toggle(value: js.Any => Unit): Self = this.set("_toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_updateFocus(value: js.Any => Unit): Self = this.set("_updateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentNavigation(value: () => js.Any): Self = this.set("getCurrentNavigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleBlur(value: () => Unit): Self = this.set("handleBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigate(value: js.Any => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: js.Any => Unit): Self = this.set("select", js.Any.fromFunction1(value))
  }
}
