package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/selection
  */
trait SingularSelection extends js.Object {
  /**
    * Get whether the element's selection state is mutable.
    * http://js.cytoscape.org/#ele.selectable
    */
  def selectable(): scala.Boolean
  /**
    * Get whether the element is selected.
    * http://js.cytoscape.org/#ele.selected
    */
  def selected(): scala.Boolean
}

object SingularSelection {
  @scala.inline
  def apply(selectable: () => scala.Boolean, selected: () => scala.Boolean): SingularSelection = {
    val __obj = js.Dynamic.literal(selectable = js.Any.fromFunction0(selectable), selected = js.Any.fromFunction0(selected))
  
    __obj.asInstanceOf[SingularSelection]
  }
}

