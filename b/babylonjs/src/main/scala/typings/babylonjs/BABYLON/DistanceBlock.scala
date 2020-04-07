package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DistanceBlock")
@js.native
class DistanceBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new DistanceBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the left operand input component
    */
  def left(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the right operand input component
    */
  def right(): NodeMaterialConnectionPoint = js.native
}

