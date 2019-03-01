package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
trait NodeSingularMetadata extends js.Object {
  /**
    * Get the degree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def degree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the indegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def indegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the outdegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def outdegree(includeLoops: scala.Boolean): scala.Double
}

object NodeSingularMetadata {
  @scala.inline
  def apply(
    degree: js.Function1[scala.Boolean, scala.Double],
    indegree: js.Function1[scala.Boolean, scala.Double],
    outdegree: js.Function1[scala.Boolean, scala.Double]
  ): NodeSingularMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(degree)
    __obj.updateDynamic("indegree")(indegree)
    __obj.updateDynamic("outdegree")(outdegree)
    __obj.asInstanceOf[NodeSingularMetadata]
  }
}

