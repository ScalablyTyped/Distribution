package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksNormalBlendBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/normalBlendBlock", "NormalBlendBlock")
  @js.native
  open class NormalBlendBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NormalBlendBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the first input component
      */
    def normalMap0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second input component
      */
    def normalMap1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
