package typings.babylonjs.gamepadsIndexMod

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
      * Adds gamepad input support to the FreeCameraInputsManager.
      * @returns the FreeCameraInputsManager
      */
    def addGamepad(): typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  }
  object FreeCameraInputsManager {
    
    inline def apply(
      addGamepad: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
      __obj.asInstanceOf[FreeCameraInputsManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
      
      inline def setAddGamepad(
        value: () => typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
    }
  }
}
