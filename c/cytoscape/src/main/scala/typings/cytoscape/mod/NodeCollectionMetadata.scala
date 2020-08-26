package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
@js.native
trait NodeCollectionMetadata extends js.Object {
  /**
    * Get the maximum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxDegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the maximum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxIndegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the maximum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxOutdegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the minimum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minDegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the minimum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minIndegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the minimum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minOutdegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the total degree of a collection of nodes.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def totalDegree(includeLoops: Boolean): Double = js.native
}

object NodeCollectionMetadata {
  @scala.inline
  def apply(
    maxDegree: Boolean => Double,
    maxIndegree: Boolean => Double,
    maxOutdegree: Boolean => Double,
    minDegree: Boolean => Double,
    minIndegree: Boolean => Double,
    minOutdegree: Boolean => Double,
    totalDegree: Boolean => Double
  ): NodeCollectionMetadata = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction1(maxDegree), maxIndegree = js.Any.fromFunction1(maxIndegree), maxOutdegree = js.Any.fromFunction1(maxOutdegree), minDegree = js.Any.fromFunction1(minDegree), minIndegree = js.Any.fromFunction1(minIndegree), minOutdegree = js.Any.fromFunction1(minOutdegree), totalDegree = js.Any.fromFunction1(totalDegree))
    __obj.asInstanceOf[NodeCollectionMetadata]
  }
  @scala.inline
  implicit class NodeCollectionMetadataOps[Self <: NodeCollectionMetadata] (val x: Self) extends AnyVal {
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
    def setMaxDegree(value: Boolean => Double): Self = this.set("maxDegree", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxIndegree(value: Boolean => Double): Self = this.set("maxIndegree", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxOutdegree(value: Boolean => Double): Self = this.set("maxOutdegree", js.Any.fromFunction1(value))
    @scala.inline
    def setMinDegree(value: Boolean => Double): Self = this.set("minDegree", js.Any.fromFunction1(value))
    @scala.inline
    def setMinIndegree(value: Boolean => Double): Self = this.set("minIndegree", js.Any.fromFunction1(value))
    @scala.inline
    def setMinOutdegree(value: Boolean => Double): Self = this.set("minOutdegree", js.Any.fromFunction1(value))
    @scala.inline
    def setTotalDegree(value: Boolean => Double): Self = this.set("totalDegree", js.Any.fromFunction1(value))
  }
  
}

