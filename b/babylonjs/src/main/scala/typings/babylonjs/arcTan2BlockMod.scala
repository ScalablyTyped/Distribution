package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/arcTan2Block", JSImport.Namespace)
@js.native
object arcTan2BlockMod extends js.Object {
  
  @js.native
  class ArcTan2Block protected () extends NodeMaterialBlock {
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
