package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.`node-position`
import typings.cytoscape.cytoscapeStrings.intersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unbundled bezier edges
  * For bezier edges with manual control points (curve - style: unbundled - bezier):
  *
  * http://js.cytoscape.org/#style/unbundled-bezier-edges
  */
trait UnbundledBezierEdges extends js.Object {
  /**
    * A series of values that specify for each control point the
    * distance perpendicular to a line formed
    * from source to target, e.g. -20 20 - 20.
    */
  var `control-point-distances`: PropertyValueEdge[String]
  /**
    * A series of values that weights control points along
    * a line from source to target, e.g. 0.25 0.5 0.75.
    * A value usually ranges on [0, 1], with
    * 0 towards the source node and
    * 1 towards the target node
    * — but larger or smaller values can also be used.
    */
  var `control-point-weights`: PropertyValueEdge[String]
  /**
    * With value intersection (default),
    * the line from source to target for "control-point-weights"
    * is from the outside of the source node’s shape to the
    * outside of the target node’s shape.
    * With value
    * "node-position", the line is from the source position to the target position.
    * The "node-position" option makes calculating edge points easier
    * — but it should be used carefully because you can create
    * invalid points that intersection would have automatically corrected.
    */
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`]
}

object UnbundledBezierEdges {
  @scala.inline
  def apply(
    `control-point-distances`: PropertyValueEdge[String],
    `control-point-weights`: PropertyValueEdge[String],
    `edge-distances`: PropertyValueEdge[intersection | `node-position`]
  ): UnbundledBezierEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control-point-distances")(`control-point-distances`.asInstanceOf[js.Any])
    __obj.updateDynamic("control-point-weights")(`control-point-weights`.asInstanceOf[js.Any])
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnbundledBezierEdges]
  }
}

