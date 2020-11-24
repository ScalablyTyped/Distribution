package typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing an arc rotate camera inputs manager
  */
@js.native
trait ArcRotateCameraInputsManager extends js.Object {
  
  /**
    * Adds gamepad input support to the ArcRotateCamera InputManager.
    * @returns the camera inputs manager
    */
  def addGamepad(): ArcRotateCameraInputsManager = js.native
}
object ArcRotateCameraInputsManager {
  
  @scala.inline
  def apply(addGamepad: () => ArcRotateCameraInputsManager): ArcRotateCameraInputsManager = {
    val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
    __obj.asInstanceOf[ArcRotateCameraInputsManager]
  }
  
  @scala.inline
  implicit class ArcRotateCameraInputsManagerOps[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddGamepad(value: () => ArcRotateCameraInputsManager): Self = this.set("addGamepad", js.Any.fromFunction0(value))
  }
}
