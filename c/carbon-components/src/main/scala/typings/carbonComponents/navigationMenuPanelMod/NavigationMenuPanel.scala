package typings.carbonComponents.navigationMenuPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait NavigationMenuPanel extends js.Object {
  
  def _changeState(state: js.Any, callback: js.Any): Unit = js.native
  
  def createdByLauncher(event: js.Any): Unit = js.native
  
  def shouldStateBeChanged(state: js.Any): Boolean = js.native
}
object NavigationMenuPanel {
  
  @scala.inline
  def apply(
    _changeState: (js.Any, js.Any) => Unit,
    createdByLauncher: js.Any => Unit,
    shouldStateBeChanged: js.Any => Boolean
  ): NavigationMenuPanel = {
    val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), createdByLauncher = js.Any.fromFunction1(createdByLauncher), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
    __obj.asInstanceOf[NavigationMenuPanel]
  }
  
  @scala.inline
  implicit class NavigationMenuPanelOps[Self <: NavigationMenuPanel] (val x: Self) extends AnyVal {
    
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
    def setCreatedByLauncher(value: js.Any => Unit): Self = this.set("createdByLauncher", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldStateBeChanged(value: js.Any => Boolean): Self = this.set("shouldStateBeChanged", js.Any.fromFunction1(value))
  }
}
