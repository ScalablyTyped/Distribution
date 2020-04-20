package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DiscardBlock")
@js.native
class DiscardBlock protected () extends NodeMaterialBlock {
  /**
    * Create a new DiscardBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the cutoff input component
    */
  def cutoff: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the color input component
    */
  def value: NodeMaterialConnectionPoint = js.native
}

