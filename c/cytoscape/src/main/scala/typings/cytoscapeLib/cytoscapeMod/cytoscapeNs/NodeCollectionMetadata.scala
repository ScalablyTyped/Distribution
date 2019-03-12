package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
trait NodeCollectionMetadata extends js.Object {
  /**
    * Get the maximum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxDegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the maximum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxIndegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the maximum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxOutdegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the minimum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minDegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the minimum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minIndegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the minimum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minOutdegree(includeLoops: scala.Boolean): scala.Double
  /**
    * Get the total degree of a collection of nodes.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def totalDegree(includeLoops: scala.Boolean): scala.Double
}

object NodeCollectionMetadata {
  @scala.inline
  def apply(
    maxDegree: scala.Boolean => scala.Double,
    maxIndegree: scala.Boolean => scala.Double,
    maxOutdegree: scala.Boolean => scala.Double,
    minDegree: scala.Boolean => scala.Double,
    minIndegree: scala.Boolean => scala.Double,
    minOutdegree: scala.Boolean => scala.Double,
    totalDegree: scala.Boolean => scala.Double
  ): NodeCollectionMetadata = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction1(maxDegree), maxIndegree = js.Any.fromFunction1(maxIndegree), maxOutdegree = js.Any.fromFunction1(maxOutdegree), minDegree = js.Any.fromFunction1(minDegree), minIndegree = js.Any.fromFunction1(minIndegree), minOutdegree = js.Any.fromFunction1(minOutdegree), totalDegree = js.Any.fromFunction1(totalDegree))
  
    __obj.asInstanceOf[NodeCollectionMetadata]
  }
}

