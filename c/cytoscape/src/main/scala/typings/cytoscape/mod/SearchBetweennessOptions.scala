package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessOptions extends StObject {
  
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}
object SearchBetweennessOptions {
  
  @scala.inline
  def apply(): SearchBetweennessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBetweennessOptions]
  }
  
  @scala.inline
  implicit class SearchBetweennessOptionsMutableBuilder[Self <: SearchBetweennessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
