package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.GradientBlockColorStep")
@js.native
class GradientBlockColorStep protected ()
  extends typings.babylonjs.BABYLON.GradientBlockColorStep {
  /**
    * Creates a new GradientBlockColorStep
    * @param step defines a value indicating which step this color is associated with (between 0 and 1)
    * @param color defines the color associated with this step
    */
  def this(
    /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  step: Double,
    /**
    * Gets or sets the color associated with this step
    */
  color: typings.babylonjs.BABYLON.Color3
  ) = this()
  /**
    * Gets or sets the color associated with this step
    */
  /* CompleteClass */
  override var color: typings.babylonjs.BABYLON.Color3 = js.native
  /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  /* CompleteClass */
  override var step: Double = js.native
}

