package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
@js.native
trait SearchDijkstraOptions extends StObject {
  
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.native
  
  /**
    * The root node (selector or collection) where the algorithm starts.
    */
  var root: Selector | CollectionArgument = js.native
  
  /**
    * A function that returns the positive numeric weight for this edge.
    *
    * If no weight function is defined, a constant weight of 1 is used for each edge.
    */
  var weight: js.UndefOr[WeightFn] = js.native
}
object SearchDijkstraOptions {
  
  @scala.inline
  def apply(root: Selector | CollectionArgument): SearchDijkstraOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDijkstraOptions]
  }
  
  @scala.inline
  implicit class SearchDijkstraOptionsMutableBuilder[Self <: SearchDijkstraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
