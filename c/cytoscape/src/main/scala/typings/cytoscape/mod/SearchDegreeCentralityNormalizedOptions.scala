package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedOptions extends StObject {
  
  /**
    * The alpha value for the centrality calculation, ranging on [0, 1].
    * With value 0 (default), disregards edge weights and solely uses
    * number of edges in the centrality calculation. With value 1,
    * disregards number of edges and solely uses the edge weights
    * in the centrality calculation.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  
  /**  A function that returns the weight for the edge. */
  def weight(edge: EdgeSingular): Double
}
object SearchDegreeCentralityNormalizedOptions {
  
  inline def apply(weight: EdgeSingular => Double): SearchDegreeCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal(weight = js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedOptions]
  }
  
  extension [Self <: SearchDegreeCentralityNormalizedOptions](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setWeight(value: EdgeSingular => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
  }
}
