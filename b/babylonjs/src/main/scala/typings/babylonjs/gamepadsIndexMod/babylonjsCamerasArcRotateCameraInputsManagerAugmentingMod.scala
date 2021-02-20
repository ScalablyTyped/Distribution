package typings.babylonjs.gamepadsIndexMod

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
  }
  object ArcRotateCameraInputsManager {
    
    @scala.inline
    def apply(
      addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
      __obj.asInstanceOf[ArcRotateCameraInputsManager]
    }
    
    @scala.inline
    implicit class ArcRotateCameraInputsManagerMutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddGamepad(
        value: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
    }
  }
}
