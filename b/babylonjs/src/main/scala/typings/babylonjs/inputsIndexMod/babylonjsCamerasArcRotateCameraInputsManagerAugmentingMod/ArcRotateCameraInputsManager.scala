package typings.babylonjs.inputsIndexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcRotateCameraInputsManager extends js.Object {
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addVRDeviceOrientation(): typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
}

object ArcRotateCameraInputsManager {
  @scala.inline
  def apply(
    addVRDeviceOrientation: () => typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
  ): ArcRotateCameraInputsManager = {
    val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
    __obj.asInstanceOf[ArcRotateCameraInputsManager]
  }
}

