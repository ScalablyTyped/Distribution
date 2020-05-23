package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrigonometryBlock extends NodeMaterialBlock {
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

