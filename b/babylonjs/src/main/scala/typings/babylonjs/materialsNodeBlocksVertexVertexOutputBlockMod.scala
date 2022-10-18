package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksVertexVertexOutputBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Vertex/vertexOutputBlock", "VertexOutputBlock")
  @js.native
  open class VertexOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new VertexOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /* private */ var _isLogarithmicDepthEnabled: Any = js.native
    
    /**
      * Gets the vector input component
      */
    def vector: NodeMaterialConnectionPoint = js.native
  }
}
