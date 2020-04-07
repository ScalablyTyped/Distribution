package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WorleyNoise3DBlock")
@js.native
class WorleyNoise3DBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new WorleyNoise3DBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /** Gets or sets a boolean indicating that normal should be inverted on X axis */
  var manhattanDistance: Boolean = js.native
  /**
    * Gets the jitter input component
    */
  def jitter(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the seed input component
    */
  def seed(): NodeMaterialConnectionPoint = js.native
}

