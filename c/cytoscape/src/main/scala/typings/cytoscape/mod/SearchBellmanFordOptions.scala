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
  var root: Any
  
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}
object SearchBellmanFordOptions {
  
  inline def apply(directed: Boolean, root: Any): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
  
  extension [Self <: SearchBellmanFordOptions](x: Self) {
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
