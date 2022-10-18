package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing an arc rotate camera inputs manager
    */
  trait ArcRotateCameraInputsManager extends StObject {
    
    /**
      * Adds gamepad input support to the ArcRotateCamera InputManager.
      * @returns the camera inputs manager
      */
    def addGamepad(): typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
  }
  object ArcRotateCameraInputsManager {
    
    inline def apply(
      addGamepad: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager,
      addVRDeviceOrientation: () => typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): typings.babylonjs.indexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad), addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
      __obj.asInstanceOf[typings.babylonjs.indexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager]
    }
    
    extension [Self <: typings.babylonjs.indexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager](x: Self) {
      
      inline def setAddGamepad(
        value: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      
      inline def setAddVRDeviceOrientation(
        value: () => typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
    }
  }
}
