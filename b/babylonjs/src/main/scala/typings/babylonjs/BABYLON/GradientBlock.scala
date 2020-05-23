package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientBlock extends NodeMaterialBlock {
  var _writeColorConstant: js.Any = js.native
  /**
    * Gets or sets the list of color steps
    */
  var colorSteps: js.Array[GradientBlockColorStep] = js.native
  /**
    * Gets the gradient input component
    */
  def gradient: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

