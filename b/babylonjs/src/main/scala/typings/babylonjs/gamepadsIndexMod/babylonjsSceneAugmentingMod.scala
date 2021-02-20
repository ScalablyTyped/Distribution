package typings.babylonjs.gamepadsIndexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @hidden */
    var _gamepadManager: Nullable[typings.babylonjs.gamepadManagerMod.GamepadManager] = js.native
    
    /**
      * Gets the gamepad manager associated with the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_gamepads
      */
    var gamepadManager: typings.babylonjs.gamepadManagerMod.GamepadManager = js.native
  }
  object Scene {
    
    @scala.inline
    def apply(gamepadManager: typings.babylonjs.gamepadManagerMod.GamepadManager): Scene = {
      val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGamepadManager(value: typings.babylonjs.gamepadManagerMod.GamepadManager): Self = StObject.set(x, "gamepadManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_gamepadManager(value: Nullable[typings.babylonjs.gamepadManagerMod.GamepadManager]): Self = StObject.set(x, "_gamepadManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_gamepadManagerNull: Self = StObject.set(x, "_gamepadManager", null)
    }
  }
}
