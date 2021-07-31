package typings.cytoscape.mod.Css

import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Haystack edges
  * Loop edges and compound parent nodes are not supported by haystack edges.
  * Haystack edges are a more performant replacement for plain, straight line edges.
  *
  * For fast, straight line edges (curve - style: haystack):
  * http://js.cytoscape.org/#style/haystack-edges
  */
trait HaystackEdges extends StObject {
  
  /**
    * A value between 0 and 1 inclusive that indicates the relative radius used to position haystack edges on their connected nodes.
    * The outside of the node is at 1, and the centre of the node is at 0.
    */
  var `haystack-radius`: PropertyValueEdge[Double]
}
object HaystackEdges {
  
  @scala.inline
  def apply(`haystack-radius`: PropertyValueEdge[Double]): HaystackEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("haystack-radius")(`haystack-radius`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HaystackEdges]
  }
  
  @scala.inline
  implicit class HaystackEdgesMutableBuilder[Self <: HaystackEdges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setHaystack-radius`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "haystack-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHaystack-radiusFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "haystack-radius", js.Any.fromFunction1(value))
  }
}
