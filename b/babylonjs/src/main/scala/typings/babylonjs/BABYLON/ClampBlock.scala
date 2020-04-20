package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ClampBlock")
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

