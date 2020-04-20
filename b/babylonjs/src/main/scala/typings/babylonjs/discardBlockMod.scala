package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/discardBlock", JSImport.Namespace)
@js.native
object discardBlockMod extends js.Object {
  @js.native
  class DiscardBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new DiscardBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the cutoff input component
      */
    def cutoff: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the color input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
  
}

