package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientBlockColorStep extends js.Object {
  /**
    * Gets or sets the color associated with this step
    */
  var color: Color3
  /**
    * Gets or sets a value indicating which step this color is associated with (between 0 and 1)
    */
  var step: Double
}

object GradientBlockColorStep {
  @scala.inline
  def apply(color: Color3, step: Double): GradientBlockColorStep = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientBlockColorStep]
  }
}

