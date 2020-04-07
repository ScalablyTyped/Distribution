package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RandomNumberBlock")
@js.native
class RandomNumberBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new RandomNumberBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the seed input component
    */
  def seed(): NodeMaterialConnectionPoint = js.native
}

