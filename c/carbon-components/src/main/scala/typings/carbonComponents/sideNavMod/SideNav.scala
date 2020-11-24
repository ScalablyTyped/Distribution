package typings.carbonComponents.sideNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait SideNav extends js.Object {
  
  def _handleClick(evt: js.Any): Unit = js.native
  
  def changeState(state: js.Any): Unit = js.native
  
  def isNavExpanded(): js.Any = js.native
}
object SideNav {
  
  @scala.inline
  def apply(_handleClick: js.Any => Unit, changeState: js.Any => Unit, isNavExpanded: () => js.Any): SideNav = {
    val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick), changeState = js.Any.fromFunction1(changeState), isNavExpanded = js.Any.fromFunction0(isNavExpanded))
    __obj.asInstanceOf[SideNav]
  }
  
  @scala.inline
  implicit class SideNavOps[Self <: SideNav] (val x: Self) extends AnyVal {
    
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
    def setChangeState(value: js.Any => Unit): Self = this.set("changeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNavExpanded(value: () => js.Any): Self = this.set("isNavExpanded", js.Any.fromFunction0(value))
  }
}
