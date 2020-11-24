package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/selection
  */
@js.native
trait SingularSelection extends js.Object {
  
  /**
    * Get whether the element's selection state is mutable.
    * http://js.cytoscape.org/#ele.selectable
    */
  def selectable(): Boolean = js.native
  
  /**
    * Get whether the element is selected.
    * http://js.cytoscape.org/#ele.selected
    */
  def selected(): Boolean = js.native
}
object SingularSelection {
  
  @scala.inline
  def apply(selectable: () => Boolean, selected: () => Boolean): SingularSelection = {
    val __obj = js.Dynamic.literal(selectable = js.Any.fromFunction0(selectable), selected = js.Any.fromFunction0(selected))
    __obj.asInstanceOf[SingularSelection]
  }
  
  @scala.inline
  implicit class SingularSelectionOps[Self <: SingularSelection] (val x: Self) extends AnyVal {
    
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
    def setSelectable(value: () => Boolean): Self = this.set("selectable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: () => Boolean): Self = this.set("selected", js.Any.fromFunction0(value))
  }
}
