package typings.carbonComponents.searchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Search extends js.Object {
  
  def showClear(value: js.Any, icon: js.Any): Unit = js.native
  
  def toggleLayout(element: js.Any): Unit = js.native
}
object Search {
  
  @scala.inline
  def apply(showClear: (js.Any, js.Any) => Unit, toggleLayout: js.Any => Unit): Search = {
    val __obj = js.Dynamic.literal(showClear = js.Any.fromFunction2(showClear), toggleLayout = js.Any.fromFunction1(toggleLayout))
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
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
    def setShowClear(value: (js.Any, js.Any) => Unit): Self = this.set("showClear", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToggleLayout(value: js.Any => Unit): Self = this.set("toggleLayout", js.Any.fromFunction1(value))
  }
}
