package typings.babylonjs.gamepadSceneComponentMod.babylonjsSceneAugmentingMod

import typings.babylonjs.gamepadManagerMod.GamepadManager
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /** @hidden */
  var _gamepadManager: Nullable[GamepadManager]
  /**
    * Gets the gamepad manager associated with the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_gamepads
    */
  var gamepadManager: GamepadManager
}

object Scene {
  @scala.inline
  def apply(gamepadManager: GamepadManager, _gamepadManager: Nullable[GamepadManager] = null): Scene = {
    val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any])
    if (_gamepadManager != null) __obj.updateDynamic("_gamepadManager")(_gamepadManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

