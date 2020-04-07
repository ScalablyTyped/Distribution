package typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an arc rotate camera inputs manager
  */
trait ArcRotateCameraInputsManager extends js.Object {
  /**
    * Adds gamepad input support to the ArcRotateCamera InputManager.
    * @returns the camera inputs manager
    */
  def addGamepad(): ArcRotateCameraInputsManager
}

object ArcRotateCameraInputsManager {
  @scala.inline
  def apply(addGamepad: () => ArcRotateCameraInputsManager): ArcRotateCameraInputsManager = {
    val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
  
    __obj.asInstanceOf[ArcRotateCameraInputsManager]
  }
}

