package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/reciprocalBlock", JSImport.Namespace)
@js.native
object reciprocalBlockMod extends js.Object {
  @js.native
  class ReciprocalBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ReciprocalBlock
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

