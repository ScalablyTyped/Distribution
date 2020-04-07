package typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeCameraInputsManager extends js.Object {
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): FreeCameraInputsManager
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(addVirtualJoystick: () => FreeCameraInputsManager): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
  
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
}

