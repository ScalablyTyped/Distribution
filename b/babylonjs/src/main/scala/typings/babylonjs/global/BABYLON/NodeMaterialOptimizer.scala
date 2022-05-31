package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialOptimizer")
@js.native
class NodeMaterialOptimizer ()
  extends StObject
     with typings.babylonjs.BABYLON.NodeMaterialOptimizer {
  
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  /* CompleteClass */
  override def optimize(
    vertexOutputNodes: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock],
    fragmentOutputNodes: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock]
  ): Unit = js.native
}
