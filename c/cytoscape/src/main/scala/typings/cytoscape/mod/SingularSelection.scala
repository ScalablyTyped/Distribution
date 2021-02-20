package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/selection
  */
@js.native
trait SingularSelection extends StObject {
  
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
  implicit class SingularSelectionMutableBuilder[Self <: SingularSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectable(value: () => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: () => Boolean): Self = StObject.set(x, "selected", js.Any.fromFunction0(value))
  }
}
