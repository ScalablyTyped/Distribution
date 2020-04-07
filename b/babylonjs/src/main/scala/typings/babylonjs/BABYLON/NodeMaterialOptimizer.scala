package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NodeMaterialOptimizer")
@js.native
class NodeMaterialOptimizer () extends js.Object {
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit = js.native
}

