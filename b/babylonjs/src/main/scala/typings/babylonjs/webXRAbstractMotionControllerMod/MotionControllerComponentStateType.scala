package typings.babylonjs.webXRAbstractMotionControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.default
  - typings.babylonjs.babylonjsStrings.touched
  - typings.babylonjs.babylonjsStrings.pressed
*/
trait MotionControllerComponentStateType extends js.Object

object MotionControllerComponentStateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.babylonjs.babylonjsStrings.default = this.cast("default")
  @scala.inline
  def pressed: typings.babylonjs.babylonjsStrings.pressed = this.cast("pressed")
  @scala.inline
  def touched: typings.babylonjs.babylonjsStrings.touched = this.cast("touched")
}

