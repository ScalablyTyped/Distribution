package typings.babylonjs.trigonometryBlockMod

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/trigonometryBlock", "TrigonometryBlock")
@js.native
class TrigonometryBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new TrigonometryBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets or sets the operation applied by the block
    */
  var operation: TrigonometryBlockOperations = js.native
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

