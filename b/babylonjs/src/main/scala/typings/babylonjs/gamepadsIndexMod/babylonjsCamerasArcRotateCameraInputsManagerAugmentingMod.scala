package typings.babylonjs.gamepadsIndexMod

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
  }
  object ArcRotateCameraInputsManager {
    
    inline def apply(
      addGamepad: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
      __obj.asInstanceOf[ArcRotateCameraInputsManager]
    }
    
    extension [Self <: ArcRotateCameraInputsManager](x: Self) {
      
      inline def setAddGamepad(
        value: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
    }
  }
}
