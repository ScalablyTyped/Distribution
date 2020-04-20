package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CrossBlock")
@js.native
class CrossBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new CrossBlock
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

