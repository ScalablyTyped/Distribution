package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`node-position`
import typings.cytoscape.cytoscapeStrings.intersection
import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For automatic, bundled bezier edges (curve - style: bezier):
  *
  * http://js.cytoscape.org/#style/bezier-edges
  */
trait BezierEdges extends StObject {
  
  /**
    * A single value that overrides "control-point-step-size" with a manual value.
    * Because it overrides the step size, bezier edges with the same value will overlap.
    * Thus, it’s best to use this as a one- off value for particular edges if need be.
    */
  var `control-point-distance`: PropertyValueEdge[Double]
  
  /**
    * From the line perpendicular from source to target,
    * this value specifies the distance between successive bezier edges.
    */
  var `control-point-step-size`: PropertyValueEdge[Double]
  
  /**
    * A single value that weights control points along the line from source to target.
    * The value usually ranges on [0, 1], with
    * 0 towards the source node and
    * 1 towards the target node —
    * but larger or smaller values can also be used.
    */
  var `control-point-weight`: PropertyValueEdge[Double]
  
  /**
    * With value intersection (default),
    * the line from source to target for "control-point-weight" is
    * from the outside of the source node’s shape to the outside of
    * the target node’s shape.With value node- position,
    * the line is from the source position to the target position.
    * The "node-position" option makes calculating edge points easier
    * — but it should be used carefully because you can create invalid
    * points that intersection would have automatically corrected.
    */
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`]
}
object BezierEdges {
  
  @scala.inline
  def apply(
    `control-point-distance`: PropertyValueEdge[Double],
    `control-point-step-size`: PropertyValueEdge[Double],
    `control-point-weight`: PropertyValueEdge[Double],
    `edge-distances`: PropertyValueEdge[intersection | `node-position`]
  ): BezierEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control-point-distance")(`control-point-distance`.asInstanceOf[js.Any])
    __obj.updateDynamic("control-point-step-size")(`control-point-step-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("control-point-weight")(`control-point-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierEdges]
  }
  
  @scala.inline
  implicit class BezierEdgesMutableBuilder[Self <: BezierEdges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setControl-point-distance`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-distanceFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-distance", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-step-size`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-step-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-step-sizeFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-step-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-weight`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "control-point-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-weightFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "control-point-weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = StObject.set(x, "edge-distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = StObject.set(x, "edge-distances", js.Any.fromFunction1(value))
  }
}
