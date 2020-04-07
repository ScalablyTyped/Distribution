package typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeCameraInputsManager extends js.Object {
  /**
    * @hidden
    */
  var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput]
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addDeviceOrientation(): FreeCameraInputsManager
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(
    addDeviceOrientation: () => FreeCameraInputsManager,
    _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = null
  ): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation))
    if (_deviceOrientationInput != null) __obj.updateDynamic("_deviceOrientationInput")(_deviceOrientationInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
}

