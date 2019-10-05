package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeSingularTraversing extends js.Object {
  /**
    * Get source node of this edge.
    * @param selector An optional selector that is used to filter the resultant collection.
    * http://js.cytoscape.org/#edge.source
    */
  def source(): NodeSingular = js.native
  def source(selector: Selector): NodeSingular = js.native
  /**
    * Get target node of this edge.
    * @param selector An optional selector that is used to filter the resultant collection.
    * http://js.cytoscape.org/#edge.target
    */
  def target(): NodeSingular = js.native
  def target(selector: Selector): NodeSingular = js.native
}

