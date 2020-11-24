package typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraInputsManager extends js.Object {
  
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): FreeCameraInputsManager = js.native
}
object FreeCameraInputsManager {
  
  @scala.inline
  def apply(addVirtualJoystick: () => FreeCameraInputsManager): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
  
  @scala.inline
  implicit class FreeCameraInputsManagerOps[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
    
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
    def setAddVirtualJoystick(value: () => FreeCameraInputsManager): Self = this.set("addVirtualJoystick", js.Any.fromFunction0(value))
  }
}
