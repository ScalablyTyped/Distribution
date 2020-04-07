package typings.babylonjs.webXRControllerComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRMotionControllerComponentChangesValues[T] extends js.Object {
  /**
    * current (this frame) value
    */
  var current: T
  /**
    * previous (last change) value
    */
  var previous: T
}

object IWebXRMotionControllerComponentChangesValues {
  @scala.inline
  def apply[T](current: T, previous: T): IWebXRMotionControllerComponentChangesValues[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebXRMotionControllerComponentChangesValues[T]]
  }
}

