package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksTransformBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/transformBlock", "TransformBlock")
  @js.native
  open class TransformBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new TransformBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Defines the value to use to complement W value to transform it to a Vector4
      */
    var complementW: Double = js.native
    
    /**
      * Defines the value to use to complement z value to transform it to a Vector4
      */
    var complementZ: Double = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the matrix transform input
      */
    def transform: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the vector input
      */
    def vector: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the xyz output component
      */
    def xyz: NodeMaterialConnectionPoint = js.native
  }
}
