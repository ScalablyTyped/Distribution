package typings.babylonjs.gamepadsIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.gamepadManagerMod.GamepadManager
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
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
  def apply(gamepadManager: GamepadManager): Scene = {
    val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGamepadManager(value: GamepadManager): Self = this.set("gamepadManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_gamepadManager(value: Nullable[GamepadManager]): Self = this.set("_gamepadManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_gamepadManagerNull: Self = this.set("_gamepadManager", null)
  }
}
