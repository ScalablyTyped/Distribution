package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueGradient extends js.Object {
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  var gradient: Double
}

object IValueGradient {
  @scala.inline
  def apply(gradient: Double): IValueGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValueGradient]
  }
}

