package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/oneMinusBlock", JSImport.Namespace)
@js.native
object oneMinusBlockMod extends js.Object {
  @js.native
  class OneMinusBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new OneMinusBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the input component
      */
    def input(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output(): NodeMaterialConnectionPoint = js.native
  }
  
}

