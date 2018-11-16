package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manager for handling gamepads
     */
@JSGlobal("BABYLON.GamepadManager")
@js.native
class GamepadManager () extends js.Object {
  /**
           * Initializes the gamepad manager
           * @param _scene BabylonJS scene
           */
  def this(_scene: Scene) = this()
  var _addNewGamepad: js.Any = js.native
  var _babylonGamepads: js.Any = js.native
  var _gamepadEventSupported: js.Any = js.native
  var _gamepadSupport: js.Any = js.native
  /** @hidden */
  var _isMonitoring: scala.Boolean = js.native
  var _onGamepadConnectedEvent: js.Any = js.native
  var _onGamepadDisconnectedEvent: js.Any = js.native
  var _oneGamepadConnected: js.Any = js.native
  var _scene: js.UndefOr[js.Any] = js.native
  var _startMonitoringGamepads: js.Any = js.native
  var _stopMonitoringGamepads: js.Any = js.native
  var _updateGamepadObjects: js.Any = js.native
  /**
           * The gamepads in the game pad manager
           */
  val gamepads: js.Array[Gamepad] = js.native
  /**
           * observable to be triggered when the gamepad controller has been connected
           */
  var onGamepadConnectedObservable: Observable[Gamepad] = js.native
  /**
           * observable to be triggered when the gamepad controller has been disconnected
           */
  var onGamepadDisconnectedObservable: Observable[Gamepad] = js.native
  /** @hidden */
  def _checkGamepadsStatus(): scala.Unit = js.native
  /**
           * Disposes the gamepad manager
           */
  def dispose(): scala.Unit = js.native
  /**
           * Get the gamepad controllers based on type
           * @param type The type of gamepad controller
           * @returns Nullable gamepad
           */
  def getGamepadByType(): Nullable[Gamepad] = js.native
  /**
           * Get the gamepad controllers based on type
           * @param type The type of gamepad controller
           * @returns Nullable gamepad
           */
  def getGamepadByType(`type`: scala.Double): Nullable[Gamepad] = js.native
}

