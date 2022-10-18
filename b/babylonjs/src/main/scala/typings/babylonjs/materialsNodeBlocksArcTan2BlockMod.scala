package typings.babylonjs

import typings.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksArcTan2BlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/arcTan2Block", "ArcTan2Block")
  @js.native
  open class ArcTan2Block protected () extends NodeMaterialBlock {
    /**
      * Creates a new ArcTan2Block
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the x operand input component
      */
    def x: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the y operand input component
      */
    def y: NodeMaterialConnectionPoint = js.native
  }
}
