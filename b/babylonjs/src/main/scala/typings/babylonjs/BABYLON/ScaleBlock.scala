package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ScaleBlock")
@js.native
class ScaleBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new ScaleBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the factor input component
    */
  def factor(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the input component
    */
  def input(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

