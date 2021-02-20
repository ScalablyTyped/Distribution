package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing a free camera inputs manager
    */
  @js.native
  trait FreeCameraInputsManager extends StObject {
    
    /**
      * @hidden
      */
    var _deviceOrientationInput: Nullable[
        typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
      ] = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addDeviceOrientation(): typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Adds gamepad input support to the FreeCameraInputsManager.
      * @returns the FreeCameraInputsManager
      */
    def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Add virtual joystick input support to the input manager.
      * @returns the current input manager
      */
    def addVirtualJoystick(): typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
  }
  object FreeCameraInputsManager {
    
    @scala.inline
    def apply(
      addDeviceOrientation: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
      addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
      addVirtualJoystick: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): typings.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addGamepad = js.Any.fromFunction0(addGamepad), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
      __obj.asInstanceOf[typings.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager]
    }
    
    @scala.inline
    implicit class FreeCameraInputsManagerMutableBuilder[Self <: typings.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDeviceOrientation(
        value: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddGamepad(
        value: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddVirtualJoystick(
        value: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addVirtualJoystick", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_deviceOrientationInput(
        value: Nullable[
              typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
            ]
      ): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
    }
  }
}
