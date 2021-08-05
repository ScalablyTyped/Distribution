package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.aStar
  */
trait SearchAStarOptions extends StObject {
  
  var directed: js.UndefOr[Boolean] = js.undefined
  
  var goal: Selector | CollectionArgument
  
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, Double]] = js.undefined
  
  var root: Selector | CollectionArgument
  
  var weight: js.UndefOr[WeightFn] = js.undefined
}
object SearchAStarOptions {
  
  inline def apply(goal: Selector | CollectionArgument, root: Selector | CollectionArgument): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarOptions]
  }
  
  extension [Self <: SearchAStarOptions](x: Self) {
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setGoal(value: Selector | CollectionArgument): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setHeuristic(value: /* node */ NodeCollection => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction1(value))
    
    inline def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
    
    inline def setRoot(value: Selector | CollectionArgument): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
