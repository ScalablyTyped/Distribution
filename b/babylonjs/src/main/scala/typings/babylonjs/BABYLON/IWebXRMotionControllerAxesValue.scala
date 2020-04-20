package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRMotionControllerAxesValue extends js.Object {
  /**
    * The value of the x axis
    */
  var x: Double
  /**
    * The value of the y-axis
    */
  var y: Double
}

object IWebXRMotionControllerAxesValue {
  @scala.inline
  def apply(x: Double, y: Double): IWebXRMotionControllerAxesValue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerAxesValue]
  }
}

