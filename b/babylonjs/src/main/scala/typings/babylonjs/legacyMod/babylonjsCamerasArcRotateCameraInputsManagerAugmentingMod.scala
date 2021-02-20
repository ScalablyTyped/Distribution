package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing an arc rotate camera inputs manager
    */
  @js.native
  trait ArcRotateCameraInputsManager extends StObject {
    
    /**
      * Adds gamepad input support to the ArcRotateCamera InputManager.
      * @returns the camera inputs manager
      */
    def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
  }
  object ArcRotateCameraInputsManager {
    
    @scala.inline
    def apply(
      addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager,
      addVRDeviceOrientation: () => typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): typings.babylonjs.legacyMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad), addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
      __obj.asInstanceOf[typings.babylonjs.legacyMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager]
    }
    
    @scala.inline
    implicit class ArcRotateCameraInputsManagerMutableBuilder[Self <: typings.babylonjs.legacyMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddGamepad(
        value: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddVRDeviceOrientation(
        value: () => typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
    }
  }
}
