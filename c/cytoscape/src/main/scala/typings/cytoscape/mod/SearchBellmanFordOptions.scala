package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
trait SearchBellmanFordOptions extends StObject {
  
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: Boolean
  
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any
  
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}
object SearchBellmanFordOptions {
  
  @scala.inline
  def apply(directed: Boolean, root: js.Any): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
  
  @scala.inline
  implicit class SearchBellmanFordOptionsMutableBuilder[Self <: SearchBellmanFordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
