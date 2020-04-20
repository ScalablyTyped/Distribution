package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/subtractBlock", JSImport.Namespace)
@js.native
object subtractBlockMod extends js.Object {
  @js.native
  class SubtractBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new SubtractBlock
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

