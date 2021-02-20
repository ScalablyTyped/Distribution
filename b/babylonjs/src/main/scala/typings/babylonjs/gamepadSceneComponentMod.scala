package typings.babylonjs

import typings.babylonjs.gamepadManagerMod.GamepadManager
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadSceneComponentMod {
  
  @JSImport("babylonjs/Gamepads/gamepadSceneComponent", "GamepadSystemSceneComponent")
  @js.native
  class GamepadSystemSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _beforeCameraUpdate: js.Any = js.native
  }
  
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
      def addGamepad(): ArcRotateCameraInputsManager = js.native
    }
    object ArcRotateCameraInputsManager {
      
      @scala.inline
      def apply(addGamepad: () => ArcRotateCameraInputsManager): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      @scala.inline
      implicit class ArcRotateCameraInputsManagerMutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddGamepad(value: () => ArcRotateCameraInputsManager): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      }
    }
  }
  
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
      def addGamepad(): FreeCameraInputsManager = js.native
    }
    object FreeCameraInputsManager {
      
      @scala.inline
      def apply(addGamepad: () => FreeCameraInputsManager): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      @scala.inline
      implicit class FreeCameraInputsManagerMutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddGamepad(value: () => FreeCameraInputsManager): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      var _gamepadManager: Nullable[GamepadManager] = js.native
      
      /**
        * Gets the gamepad manager associated with the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_gamepads
        */
      var gamepadManager: GamepadManager = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(gamepadManager: GamepadManager): typings.babylonjs.gamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.gamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.gamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGamepadManager(value: GamepadManager): Self = StObject.set(x, "gamepadManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_gamepadManager(value: Nullable[GamepadManager]): Self = StObject.set(x, "_gamepadManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_gamepadManagerNull: Self = StObject.set(x, "_gamepadManager", null)
      }
    }
  }
}
