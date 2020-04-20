package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/derivativeBlock", JSImport.Namespace)
@js.native
object derivativeBlockMod extends js.Object {
  @js.native
  class DerivativeBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new DerivativeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the derivative output on x
      */
    def dx: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the derivative output on y
      */
    def dy: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
  }
  
}

