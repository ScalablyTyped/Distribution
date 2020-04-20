package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DesaturateBlock")
@js.native
class DesaturateBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new DesaturateBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the color operand input component
    */
  def color: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the level operand input component
    */
  def level: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

