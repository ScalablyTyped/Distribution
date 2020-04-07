package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StepBlock")
@js.native
class StepBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new StepBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the edge operand input component
    */
  def edge(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the value operand input component
    */
  def value(): NodeMaterialConnectionPoint = js.native
}

