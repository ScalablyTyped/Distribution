package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/metadata
  */
trait NodeCollectionMetadata extends StObject {
  
  /**
    * Get the maximum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxDegree(includeLoops: Boolean): Double
  
  /**
    * Get the maximum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxIndegree(includeLoops: Boolean): Double
  
  /**
    * Get the maximum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxOutdegree(includeLoops: Boolean): Double
  
  /**
    * Get the minimum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minDegree(includeLoops: Boolean): Double
  
  /**
    * Get the minimum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minIndegree(includeLoops: Boolean): Double
  
  /**
    * Get the minimum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minOutdegree(includeLoops: Boolean): Double
  
  /**
    * Get the total degree of a collection of nodes.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def totalDegree(includeLoops: Boolean): Double
}
object NodeCollectionMetadata {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: NodeCollectionMetadata] (val x: Self) extends AnyVal {
    
    inline def setMaxDegree(value: Boolean => Double): Self = StObject.set(x, "maxDegree", js.Any.fromFunction1(value))
    
    inline def setMaxIndegree(value: Boolean => Double): Self = StObject.set(x, "maxIndegree", js.Any.fromFunction1(value))
    
    inline def setMaxOutdegree(value: Boolean => Double): Self = StObject.set(x, "maxOutdegree", js.Any.fromFunction1(value))
    
    inline def setMinDegree(value: Boolean => Double): Self = StObject.set(x, "minDegree", js.Any.fromFunction1(value))
    
    inline def setMinIndegree(value: Boolean => Double): Self = StObject.set(x, "minIndegree", js.Any.fromFunction1(value))
    
    inline def setMinOutdegree(value: Boolean => Double): Self = StObject.set(x, "minOutdegree", js.Any.fromFunction1(value))
    
    inline def setTotalDegree(value: Boolean => Double): Self = StObject.set(x, "totalDegree", js.Any.fromFunction1(value))
  }
}
