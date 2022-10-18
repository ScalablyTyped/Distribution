package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksNormalizeBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/normalizeBlock", "NormalizeBlock")
  @js.native
  open class NormalizeBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NormalizeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
