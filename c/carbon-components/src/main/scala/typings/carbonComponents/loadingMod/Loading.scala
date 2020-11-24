package typings.carbonComponents.loadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Loading extends js.Object {
  
  def _deleteElement(): Unit = js.native
  
  def end(): Unit = js.native
  
  def isActive(): js.Any = js.native
  
  def set(active: js.Any): this.type = js.native
  
  def toggle(): this.type = js.native
}
object Loading {
  
  @scala.inline
  def apply(
    _deleteElement: () => Unit,
    end: () => Unit,
    isActive: () => js.Any,
    set: js.Any => Loading,
    toggle: () => Loading
  ): Loading = {
    val __obj = js.Dynamic.literal(_deleteElement = js.Any.fromFunction0(_deleteElement), end = js.Any.fromFunction0(end), isActive = js.Any.fromFunction0(isActive), set = js.Any.fromFunction1(set), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Loading]
  }
  
  @scala.inline
  implicit class LoadingOps[Self <: Loading] (val x: Self) extends AnyVal {
    
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
    def set_deleteElement(value: () => Unit): Self = this.set("_deleteElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => js.Any): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Any => Loading): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: () => Loading): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
