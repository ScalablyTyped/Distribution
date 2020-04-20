package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DivideBlock")
@js.native
class DivideBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new DivideBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the left operand input component
    */
  def left: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the right operand input component
    */
  def right: NodeMaterialConnectionPoint = js.native
}

