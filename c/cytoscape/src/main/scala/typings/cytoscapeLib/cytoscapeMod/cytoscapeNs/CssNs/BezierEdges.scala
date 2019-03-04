package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For automatic, bundled bezier edges (curve - style: bezier):
  *
  * http://js.cytoscape.org/#style/bezier-edges
  */
trait BezierEdges extends js.Object {
  /**
    * A single value that overrides "control-point-step-size" with a manual value.
    * Because it overrides the step size, bezier edges with the same value will overlap.
    * Thus, it’s best to use this as a one- off value for particular edges if need be.
    */
  var `control-point-distance`: scala.Double
  /**
    * From the line perpendicular from source to target,
    * this value specifies the distance between successive bezier edges.
    */
  var `control-point-step-size`: scala.Double
  /**
    * A single value that weights control points along the line from source to target.
    * The value usually ranges on [0, 1], with
    * 0 towards the source node and
    * 1 towards the target node —
    * but larger or smaller values can also be used.
    */
  var `control-point-weight`: scala.Double
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
  var `edge-distances`: scala.Double
}

object BezierEdges {
  @scala.inline
  def apply(
    `control-point-distance`: scala.Double,
    `control-point-step-size`: scala.Double,
    `control-point-weight`: scala.Double,
    `edge-distances`: scala.Double
  ): BezierEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control-point-distance")(`control-point-distance`)
    __obj.updateDynamic("control-point-step-size")(`control-point-step-size`)
    __obj.updateDynamic("control-point-weight")(`control-point-weight`)
    __obj.updateDynamic("edge-distances")(`edge-distances`)
    __obj.asInstanceOf[BezierEdges]
  }
}

