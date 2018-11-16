package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/graph-manipulation
     */

trait SingularGraphManipulation extends js.Object {
  /**
           * Get the core instance that owns the element.
           */
  def cy(): Core
  /**
           * Get whether the element is inside the graph (i.e. not removed).
           * http://js.cytoscape.org/#ele.inside
           */
  def inside(): scala.Boolean
  /**
           * Get whether the element has been removed from the graph.
           * http://js.cytoscape.org/#ele.removed
           */
  def removed(): scala.Boolean
}

