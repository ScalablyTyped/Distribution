package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Segments edges
  * For edges made of several straight lines (curve - style: segments):
  * http://js.cytoscape.org/#style/segments-edges
  */
trait SegmentsEdges extends js.Object {
  /**
    * With value
    *  * "intersection" (default), the line from source to target
    *  * for "segment-weights" is from the outside of the source node’s shape to the outside of the target node’s shape.
    *  * With value "node-position", the line is from the source position to the target position.
    * The "node-position" option makes calculating edge points easier
    * — but it should be used carefully because you can create
    * invalid points that intersection would have automatically corrected.
    */
  var `edge-distances`: cytoscapeLib.cytoscapeLibStrings.intersection | cytoscapeLib.cytoscapeLibStrings.`segment-weights` | cytoscapeLib.cytoscapeLibStrings.`node-position`
  /**
    * A series of values that specify for each segment point the distance perpendicular to a line formed from source to target, e.g. -20 20 - 20.
    */
  var `segment-distances`: java.lang.String
  /**
    * A series of values that weights segment points along a line from source to target,
    * e.g. 0.25 0.5 0.75.A value usually ranges on [0, 1],
    * with 0 towards the source node and 1 towards the target node — but larger or smaller values can also be used.
    */
  var `segment-weights`: java.lang.String
}

object SegmentsEdges {
  @scala.inline
  def apply(
    `edge-distances`: cytoscapeLib.cytoscapeLibStrings.intersection | cytoscapeLib.cytoscapeLibStrings.`segment-weights` | cytoscapeLib.cytoscapeLibStrings.`node-position`,
    `segment-distances`: java.lang.String,
    `segment-weights`: java.lang.String
  ): SegmentsEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edge-distances")(`edge-distances`.asInstanceOf[js.Any])
    __obj.updateDynamic("segment-distances")(`segment-distances`)
    __obj.updateDynamic("segment-weights")(`segment-weights`)
    __obj.asInstanceOf[SegmentsEdges]
  }
}

