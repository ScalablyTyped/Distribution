package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color3Gradient extends IValueGradient {
  /**
    * Gets or sets the associated color
    */
  var color: Color3
}

object Color3Gradient {
  @scala.inline
  def apply(color: Color3, gradient: Double): Color3Gradient = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color3Gradient]
  }
}

