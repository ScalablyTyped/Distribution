package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
trait SearchDegreeCentralityOptions extends StObject {
  
  /**
    * The alpha value for the centrality calculation, ranging on [0, 1].
    * With value 0 (default), disregards edge weights and solely uses
    * number of edges in the centrality calculation. With value 1,
    * disregards number of edges and solely uses the edge weights
    * in the centrality calculation.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The root node (selector or collection) for which the
    * centrality calculation is made.
    */
  var root: NodeSingular | Selector
  
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}
object SearchDegreeCentralityOptions {
  
  inline def apply(root: NodeSingular | Selector): SearchDegreeCentralityOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityOptions]
  }
  
  extension [Self <: SearchDegreeCentralityOptions](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setRoot(value: NodeSingular | Selector): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
