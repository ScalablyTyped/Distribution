package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.aStar
  */
@js.native
trait SearchAStarOptions extends StObject {
  
  var directed: js.UndefOr[Boolean] = js.native
  
  var goal: Selector | CollectionArgument = js.native
  
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, Double]] = js.native
  
  var root: Selector | CollectionArgument = js.native
  
  var weight: js.UndefOr[WeightFn] = js.native
}
object SearchAStarOptions {
  
  @scala.inline
  def apply(goal: Selector | CollectionArgument, root: Selector | CollectionArgument): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarOptions]
  }
  
  @scala.inline
  implicit class SearchAStarOptionsMutableBuilder[Self <: SearchAStarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    @scala.inline
    def setGoal(value: Selector | CollectionArgument): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeuristic(value: /* node */ NodeCollection => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
    
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
