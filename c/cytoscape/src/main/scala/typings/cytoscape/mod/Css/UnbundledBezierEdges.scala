package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`node-position`
import typings.cytoscape.cytoscapeStrings.intersection
import typings.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unbundled bezier edges
  * For bezier edges with manual control points (curve - style: unbundled - bezier):
  *
  * http://js.cytoscape.org/#style/unbundled-bezier-edges
  */
@js.native
trait UnbundledBezierEdges extends js.Object {
  
  /**
    * A series of values that specify for each control point the
    * distance perpendicular to a line formed
    * from source to target, e.g. -20 20 - 20.
    */
  var `control-point-distances`: PropertyValueEdge[String] = js.native
  
  /**
    * A series of values that weights control points along
    * a line from source to target, e.g. 0.25 0.5 0.75.
    * A value usually ranges on [0, 1], with
    * 0 towards the source node and
    * 1 towards the target node
    * — but larger or smaller values can also be used.
    */
  var `control-point-weights`: PropertyValueEdge[String] = js.native
  
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
  var `edge-distances`: PropertyValueEdge[intersection | `node-position`] = js.native
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
  
  @scala.inline
  implicit class UnbundledBezierEdgesOps[Self <: UnbundledBezierEdges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setControl-point-distancesFunction1`(value: EdgeSingular => String): Self = this.set("control-point-distances", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-distances`(value: PropertyValueEdge[String]): Self = this.set("control-point-distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setControl-point-weightsFunction1`(value: EdgeSingular => String): Self = this.set("control-point-weights", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setControl-point-weights`(value: PropertyValueEdge[String]): Self = this.set("control-point-weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEdge-distancesFunction1`(value: EdgeSingular => intersection | `node-position`): Self = this.set("edge-distances", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setEdge-distances`(value: PropertyValueEdge[intersection | `node-position`]): Self = this.set("edge-distances", value.asInstanceOf[js.Any])
  }
}
