package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vertexOutputBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Vertex/vertexOutputBlock", "VertexOutputBlock")
  @js.native
  class VertexOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new VertexOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the vector input component
      */
    def vector: NodeMaterialConnectionPoint = js.native
  }
}
