package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FrontFacingBlock")
@js.native
class FrontFacingBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new FrontFacingBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

