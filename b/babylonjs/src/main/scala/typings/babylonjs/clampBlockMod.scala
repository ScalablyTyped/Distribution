package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/clampBlock", JSImport.Namespace)
@js.native
object clampBlockMod extends js.Object {
  @js.native
  class ClampBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ClampBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /** Gets or sets the maximum range */
    var maximum: Double = js.native
    /** Gets or sets the minimum range */
    var minimum: Double = js.native
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

