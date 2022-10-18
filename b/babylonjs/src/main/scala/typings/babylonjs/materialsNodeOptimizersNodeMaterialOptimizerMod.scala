package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeOptimizersNodeMaterialOptimizerMod {
  
  @JSImport("babylonjs/Materials/Node/Optimizers/nodeMaterialOptimizer", "NodeMaterialOptimizer")
  @js.native
  open class NodeMaterialOptimizer () extends StObject {
    
    /**
      * Function used to optimize a NodeMaterial graph
      * @param _vertexOutputNodes defines the list of output nodes for the vertex shader
      * @param _fragmentOutputNodes defines the list of output nodes for the fragment shader
      */
    def optimize(_vertexOutputNodes: js.Array[NodeMaterialBlock], _fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit = js.native
  }
}
