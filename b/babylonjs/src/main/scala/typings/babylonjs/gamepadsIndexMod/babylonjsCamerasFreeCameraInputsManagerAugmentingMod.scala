package typings.babylonjs.gamepadsIndexMod

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
      * Adds gamepad input support to the FreeCameraInputsManager.
      * @returns the FreeCameraInputsManager
      */
    def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
  }
  object FreeCameraInputsManager {
    
    @scala.inline
    def apply(
      addGamepad: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
      __obj.asInstanceOf[FreeCameraInputsManager]
    }
    
    @scala.inline
    implicit class FreeCameraInputsManagerMutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddGamepad(
        value: () => typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
    }
  }
}
