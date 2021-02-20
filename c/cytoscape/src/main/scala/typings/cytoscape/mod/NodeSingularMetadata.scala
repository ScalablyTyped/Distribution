package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/metadata
  */
@js.native
trait NodeSingularMetadata extends StObject {
  
  /**
    * Get the degree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def degree(includeLoops: Boolean): Double = js.native
  
  /**
    * Get the indegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def indegree(includeLoops: Boolean): Double = js.native
  
  /**
    * Get the outdegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def outdegree(includeLoops: Boolean): Double = js.native
}
object NodeSingularMetadata {
  
  @scala.inline
  def apply(degree: Boolean => Double, indegree: Boolean => Double, outdegree: Boolean => Double): NodeSingularMetadata = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree), indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[NodeSingularMetadata]
  }
  
  @scala.inline
  implicit class NodeSingularMetadataMutableBuilder[Self <: NodeSingularMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegree(value: Boolean => Double): Self = StObject.set(x, "degree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndegree(value: Boolean => Double): Self = StObject.set(x, "indegree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutdegree(value: Boolean => Double): Self = StObject.set(x, "outdegree", js.Any.fromFunction1(value))
  }
}
