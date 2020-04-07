package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.GradientBlock")
@js.native
class GradientBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new GradientBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  var _writeColorConstant: js.Any = js.native
  /**
    * Gets or sets the list of color steps
    */
  var colorSteps: js.Array[GradientBlockColorStep] = js.native
  /**
    * Gets the gradient input component
    */
  def gradient(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

