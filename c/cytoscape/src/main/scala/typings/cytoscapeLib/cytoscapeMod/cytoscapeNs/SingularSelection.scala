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
  def apply(selectable: js.Function0[scala.Boolean], selected: js.Function0[scala.Boolean]): SingularSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectable")(selectable)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[SingularSelection]
  }
}

