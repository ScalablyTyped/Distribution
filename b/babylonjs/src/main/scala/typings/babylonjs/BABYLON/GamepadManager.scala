package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadManager extends StObject {
  
  /* private */ var _addNewGamepad: Any = js.native
  
  /* private */ var _babylonGamepads: Any = js.native
  
  /** @internal */
  def _checkGamepadsStatus(): Unit = js.native
  
  /* private */ var _gamepadEventSupported: Any = js.native
  
  /* private */ var _gamepadSupport: Any = js.native
  
  /** @internal */
  var _isMonitoring: Boolean = js.native
  
  /* private */ var _loggedErrors: Any = js.native
  
  /* private */ var _onGamepadConnectedEvent: Any = js.native
  
  /* private */ var _onGamepadDisconnectedEvent: Any = js.native
  
  /* private */ var _oneGamepadConnected: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _startMonitoringGamepads: Any = js.native
  
  /* private */ var _stopMonitoringGamepads: Any = js.native
  
  /* private */ var _updateGamepadObjects: Any = js.native
  
  /**
    * Disposes the gamepad manager
    */
  def dispose(): Unit = js.native
  
  /**
    * The gamepads in the game pad manager
    */
  def gamepads: js.Array[Gamepad] = js.native
  
  /**
    * Get the gamepad controllers based on type
    * @param type The type of gamepad controller
    * @returns Nullable gamepad
    */
  def getGamepadByType(): Nullable[Gamepad] = js.native
  def getGamepadByType(`type`: Double): Nullable[Gamepad] = js.native
  
  /**
    * observable to be triggered when the gamepad controller has been connected
    */
  var onGamepadConnectedObservable: Observable[Gamepad] = js.native
  
  /**
    * observable to be triggered when the gamepad controller has been disconnected
    */
  var onGamepadDisconnectedObservable: Observable[Gamepad] = js.native
}
