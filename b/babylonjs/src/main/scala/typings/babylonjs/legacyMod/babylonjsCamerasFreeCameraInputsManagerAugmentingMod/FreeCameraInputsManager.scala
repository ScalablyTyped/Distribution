package typings.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a free camera inputs manager
  */
trait FreeCameraInputsManager extends js.Object {
  /**
    * @hidden
    */
  var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput]
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addDeviceOrientation(): typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  /**
    * Adds gamepad input support to the FreeCameraInputsManager.
    * @returns the FreeCameraInputsManager
    */
  def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(
    addDeviceOrientation: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    addVirtualJoystick: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = null
  ): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addGamepad = js.Any.fromFunction0(addGamepad), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick), _deviceOrientationInput = _deviceOrientationInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
}

