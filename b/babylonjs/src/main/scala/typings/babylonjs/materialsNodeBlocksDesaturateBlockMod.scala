package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDesaturateBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/desaturateBlock", "DesaturateBlock")
  @js.native
  open class DesaturateBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new DesaturateBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the color operand input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the level operand input component
      */
    def level: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
