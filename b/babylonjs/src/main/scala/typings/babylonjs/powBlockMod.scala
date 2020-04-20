package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/powBlock", JSImport.Namespace)
@js.native
object powBlockMod extends js.Object {
  @js.native
  class PowBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new PowBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the power operand input component
      */
    def power: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the value operand input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
  
}

