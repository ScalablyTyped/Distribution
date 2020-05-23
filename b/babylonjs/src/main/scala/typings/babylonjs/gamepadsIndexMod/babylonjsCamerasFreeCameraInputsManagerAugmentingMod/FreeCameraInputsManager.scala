package typings.babylonjs.gamepadsIndexMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a free camera inputs manager
  */
trait FreeCameraInputsManager extends js.Object {
  /**
    * Adds gamepad input support to the FreeCameraInputsManager.
    * @returns the FreeCameraInputsManager
    */
  def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(
    addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  ): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
}

