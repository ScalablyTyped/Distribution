package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/negateBlock", JSImport.Namespace)
@js.native
object negateBlockMod extends js.Object {
  @js.native
  class NegateBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NegateBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
  
}

