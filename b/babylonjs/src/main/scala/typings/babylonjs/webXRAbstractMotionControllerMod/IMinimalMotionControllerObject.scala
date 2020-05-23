package typings.babylonjs.webXRAbstractMotionControllerMod

import typings.babylonjs.anon.Pressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMinimalMotionControllerObject extends js.Object {
  /**
    * Available axes of this controller
    */
  var axes: js.Array[Double]
  /**
    * An array of available buttons
    */
  var buttons: js.Array[Pressed]
}

object IMinimalMotionControllerObject {
  @scala.inline
  def apply(axes: js.Array[Double], buttons: js.Array[Pressed]): IMinimalMotionControllerObject = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinimalMotionControllerObject]
  }
}

