package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TrigonometryBlock")
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
  def input(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

