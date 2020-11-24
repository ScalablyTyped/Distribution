package typings.carbonComponents.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Tooltip extends js.Object {
  
  def _handleClick(hasRelatedTargetTypeHadContextMenuDetails: js.Any): Unit = js.native
  
  var _hasContextMenu: Boolean = js.native
  
  def _hookOn(element: js.Any): Unit = js.native
  
  def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
  
  def createdByEvent(event: js.Any): Unit = js.native
}
object Tooltip {
  
  @scala.inline
  def apply(
    _handleClick: js.Any => Unit,
    _hasContextMenu: Boolean,
    _hookOn: js.Any => Unit,
    changeState: (js.Any, js.Any, js.Any) => Unit,
    createdByEvent: js.Any => Unit
  ): Tooltip = {
    val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick), _hasContextMenu = _hasContextMenu.asInstanceOf[js.Any], _hookOn = js.Any.fromFunction1(_hookOn), changeState = js.Any.fromFunction3(changeState), createdByEvent = js.Any.fromFunction1(createdByEvent))
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    
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
    def set_handleClick(value: js.Any => Unit): Self = this.set("_handleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hasContextMenu(value: Boolean): Self = this.set("_hasContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hookOn(value: js.Any => Unit): Self = this.set("_hookOn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("changeState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreatedByEvent(value: js.Any => Unit): Self = this.set("createdByEvent", js.Any.fromFunction1(value))
  }
}
