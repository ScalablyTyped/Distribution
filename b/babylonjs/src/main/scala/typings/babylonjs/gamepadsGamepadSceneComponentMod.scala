package typings.babylonjs

import typings.babylonjs.gamepadsGamepadManagerMod.GamepadManager
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsGamepadSceneComponentMod {
  
  @JSImport("babylonjs/Gamepads/gamepadSceneComponent", "GamepadSystemSceneComponent")
  @js.native
  open class GamepadSystemSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _beforeCameraUpdate: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
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
      def addGamepad(): ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(addGamepad: () => ArcRotateCameraInputsManager): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
        
        inline def setAddGamepad(value: () => ArcRotateCameraInputsManager): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      }
    }
  }
  
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
      def addGamepad(): FreeCameraInputsManager
    }
    object FreeCameraInputsManager {
      
      inline def apply(addGamepad: () => FreeCameraInputsManager): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
        
        inline def setAddGamepad(value: () => FreeCameraInputsManager): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal */
      var _gamepadManager: Nullable[GamepadManager]
      
      /**
        * Gets the gamepad manager associated with the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/input/gamepads
        */
      var gamepadManager: GamepadManager
    }
    object Scene {
      
      inline def apply(gamepadManager: GamepadManager): typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any], _gamepadManager = null)
        __obj.asInstanceOf[typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setGamepadManager(value: GamepadManager): Self = StObject.set(x, "gamepadManager", value.asInstanceOf[js.Any])
        
        inline def set_gamepadManager(value: Nullable[GamepadManager]): Self = StObject.set(x, "_gamepadManager", value.asInstanceOf[js.Any])
        
        inline def set_gamepadManagerNull: Self = StObject.set(x, "_gamepadManager", null)
      }
    }
  }
}
