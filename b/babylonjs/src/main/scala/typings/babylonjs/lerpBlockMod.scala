package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/lerpBlock", JSImport.Namespace)
@js.native
object lerpBlockMod extends js.Object {
  @js.native
  class LerpBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new LerpBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the gradient operand input component
      */
    def gradient: NodeMaterialConnectionPoint = js.native
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

