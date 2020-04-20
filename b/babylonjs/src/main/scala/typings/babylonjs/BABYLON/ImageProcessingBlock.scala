package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ImageProcessingBlock")
@js.native
class ImageProcessingBlock protected () extends NodeMaterialBlock {
  /**
    * Create a new ImageProcessingBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the color input component
    */
  def color: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

