package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialOptimizerMod {
  
  @JSImport("babylonjs/Materials/Node/Optimizers/nodeMaterialOptimizer", "NodeMaterialOptimizer")
  @js.native
  class NodeMaterialOptimizer () extends StObject {
    
    /**
      * Function used to optimize a NodeMaterial graph
      * @param vertexOutputNodes defines the list of output nodes for the vertex shader
      * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
      */
    def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit = js.native
  }
}
