package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksMinBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/minBlock", "MinBlock")
  @js.native
  open class MinBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new MinBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the left operand input component
      */
    def left: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the right operand input component
      */
    def right: NodeMaterialConnectionPoint = js.native
  }
}
