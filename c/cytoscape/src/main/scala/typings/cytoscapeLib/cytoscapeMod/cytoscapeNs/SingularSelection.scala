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

