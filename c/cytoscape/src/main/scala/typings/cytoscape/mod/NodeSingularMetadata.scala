package typings.cytoscape.mod

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
  def degree(includeLoops: Boolean): Double
  /**
    * Get the indegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def indegree(includeLoops: Boolean): Double
  /**
    * Get the outdegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def outdegree(includeLoops: Boolean): Double
}

object NodeSingularMetadata {
  @scala.inline
  def apply(degree: Boolean => Double, indegree: Boolean => Double, outdegree: Boolean => Double): NodeSingularMetadata = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree), indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[NodeSingularMetadata]
  }
}

