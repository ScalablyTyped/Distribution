package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeMaterialOptimizer extends js.Object {
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit
}

object NodeMaterialOptimizer {
  @scala.inline
  def apply(optimize: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Unit): NodeMaterialOptimizer = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction2(optimize))
    __obj.asInstanceOf[NodeMaterialOptimizer]
  }
}

