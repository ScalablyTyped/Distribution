package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`node-position`
import typings.cytoscape.cytoscapeStrings.auto
import typings.cytoscape.cytoscapeStrings.downward
import typings.cytoscape.cytoscapeStrings.horizontal
import typings.cytoscape.cytoscapeStrings.intersection
import typings.cytoscape.cytoscapeStrings.leftward
import typings.cytoscape.cytoscapeStrings.rightward
import typings.cytoscape.cytoscapeStrings.upward
import typings.cytoscape.cytoscapeStrings.vertical
import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Taxi edges
  * For hierarchical, bundled edges (curve-style: taxi)
  *
  * https://js.cytoscape.org/#style/taxi-edges
  */
trait TaxiEdges extends StObject {
  
  /**
    * With value `intersection` (default), the `distances` (`taxi-turn` and `taxi-turn-min-distance`)
    * are considered from the outside of the source’s bounds to the outside of the target’s bounds.
    * With value `node-position`, the distances are considered from the source position to the target position.
    * The `node-position` option makes calculating edge points easier — but it should be used carefully because
    * you can create invalid points that `intersection` would have automatically corrected.
    */
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`]
  
  /**
    * The main direction of the edge, the direction starting out from the source node; may be one of:
    *  * `auto`: Automatically use `vertical` or `horizontal`, based on whether the vertical or horizontal distance is largest.
    *  * `vertical`: Automatically use `downward` or `upward`, based on the vertical direction from source to target.
    *  * `downward`: Bundle outgoers downwards.
    *  * `upward`: Bundle outgoers upwards.
    *  * `horizontal`: Automatically use `righward` or `leftward`, based on the horizontal direction from source to target.
    *  * `rightward`: Bundle outgoers righwards.
    *  * `leftward`: Bundle outgoers leftwards.
    */
  var `taxi-direction`: PropertyValueEdge[auto | vertical | downward | upward | horizontal | rightward | leftward]
  
  /**
    * The distance along the primary axis where the first turn is applied.
    *  * This value may be an absolute distance (e.g. `'20px'`) or it may be a relative distance
    * between the source and target (e.g. `'50%'`).
    *  * A negative value may be specified to indicate a distance in the oppostite, target to
    * source direction (e.g. `'-20px'`).
    *  * Note that bundling may not work with an explicit direction (upward, downward, leftward, or rightward)
    * in tandem with a turn distance specified in percent units.
    */
  var `taxi-turn`: PropertyValueEdge[Double | js.Array[Double] | String]
  
  /**
    * The minimum distance along the primary axis that is maintained between the nodes and the turns.
    *  * This value only takes on absolute values (e.g. `'5px'`).
    *  * This property makes the taxi edge be re-routed when the turns would be otherwise too close to
    * the source or target. As such, it also helps to avoid turns overlapping edge endpoint arrows.
    */
  var `taxi-turn-min-distance`: PropertyValueEdge[Double | String]
}
object TaxiEdges {
  
  inline def apply(
    `edge-distances`: PropertyValueEdge[intersection | `node-position`],
    `taxi-direction`: PropertyValueEdge[auto | vertical | downward | upward | horizontal | rightward | leftward],
    `taxi-turn`: PropertyValueEdge[Double | js.Array[Double] | String],
    `taxi-turn-min-distance`: PropertyValueEdge[Double | String]
  ): TaxiEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.updateDynamic("taxi-direction")(`taxi-direction`.asInstanceOf[js.Any])
    __obj.updateDynamic("taxi-turn")(`taxi-turn`.asInstanceOf[js.Any])
    __obj.updateDynamic("taxi-turn-min-distance")(`taxi-turn-min-distance`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiEdges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaxiEdges] (val x: Self) extends AnyVal {
    
    inline def `setEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = StObject.set(x, "edge-distances", value.asInstanceOf[js.Any])
    
    inline def `setEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = StObject.set(x, "edge-distances", js.Any.fromFunction1(value))
    
    inline def `setTaxi-direction`(value: PropertyValueEdge[auto | vertical | downward | upward | horizontal | rightward | leftward]): Self = StObject.set(x, "taxi-direction", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-directionFunction1`(value: EdgeSingular => auto | vertical | downward | upward | horizontal | rightward | leftward): Self = StObject.set(x, "taxi-direction", js.Any.fromFunction1(value))
    
    inline def `setTaxi-turn`(value: PropertyValueEdge[Double | js.Array[Double] | String]): Self = StObject.set(x, "taxi-turn", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-turn-min-distance`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "taxi-turn-min-distance", value.asInstanceOf[js.Any])
    
    inline def `setTaxi-turn-min-distanceFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "taxi-turn-min-distance", js.Any.fromFunction1(value))
    
    inline def `setTaxi-turnFunction1`(value: EdgeSingular => Double | js.Array[Double] | String): Self = StObject.set(x, "taxi-turn", js.Any.fromFunction1(value))
    
    inline def `setTaxi-turnVarargs`(value: Double*): Self = StObject.set(x, "taxi-turn", js.Array(value*))
  }
}
