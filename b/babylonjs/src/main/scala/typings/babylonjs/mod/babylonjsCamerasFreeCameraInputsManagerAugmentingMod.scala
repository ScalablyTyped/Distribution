package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing a free camera inputs manager
    */
  trait FreeCameraInputsManager extends StObject {
    
    /**
      * @hidden
      */
    var _deviceOrientationInput: Nullable[
        typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
      ]
    
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
    
    inline def apply(
      addDeviceOrientation: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
      addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
      addVirtualJoystick: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): typings.babylonjs.mod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addGamepad = js.Any.fromFunction0(addGamepad), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick), _deviceOrientationInput = null)
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager]
    }
    
    extension [Self <: typings.babylonjs.mod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager](x: Self) {
      
      inline def setAddDeviceOrientation(
        value: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
      
      inline def setAddGamepad(
        value: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      
      inline def setAddVirtualJoystick(
        value: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addVirtualJoystick", js.Any.fromFunction0(value))
      
      inline def set_deviceOrientationInput(
        value: Nullable[
              typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
            ]
      ): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
      
      inline def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
    }
  }
}
