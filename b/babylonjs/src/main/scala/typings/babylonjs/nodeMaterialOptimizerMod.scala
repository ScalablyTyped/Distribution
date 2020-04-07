package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Optimizers/nodeMaterialOptimizer", JSImport.Namespace)
@js.native
object nodeMaterialOptimizerMod extends js.Object {
  @js.native
  class NodeMaterialOptimizer () extends js.Object {
    /**
      * Function used to optimize a NodeMaterial graph
      * @param vertexOutputNodes defines the list of output nodes for the vertex shader
      * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
      */
    def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit = js.native
  }
  
}

