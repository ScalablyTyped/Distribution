package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gamepad extends StObject {
  
  /**
    * Specifies whether the left control stick should be Y-inverted
    */
  /* protected */ var _invertLeftStickY: Boolean = js.native
  
  /** @hidden */
  var _isConnected: Boolean = js.native
  
  /* private */ var _leftStick: js.Any = js.native
  
  /* private */ var _leftStickAxisX: js.Any = js.native
  
  /* private */ var _leftStickAxisY: js.Any = js.native
  
  /**
    * Triggered when the left control stick has been changed
    */
  /* private */ var _onleftstickchanged: js.Any = js.native
  
  /**
    * Triggered when the right control stick has been changed
    */
  /* private */ var _onrightstickchanged: js.Any = js.native
  
  /* private */ var _rightStick: js.Any = js.native
  
  /* private */ var _rightStickAxisX: js.Any = js.native
  
  /* private */ var _rightStickAxisY: js.Any = js.native
  
  /**
    * The browser gamepad
    */
  var browserGamepad: js.Any = js.native
  
  /**
    * Disposes the gamepad
    */
  def dispose(): Unit = js.native
  
  /**
    * The id of the gamepad
    */
  var id: String = js.native
  
  /**
    * The index of the gamepad
    */
  var index: Double = js.native
  
  /**
    * Specifies if the gamepad has been connected
    */
  def isConnected: Boolean = js.native
  
  /**
    * Gets the left joystick
    */
  def leftStick: StickValues = js.native
  /**
    * Sets the left joystick values
    */
  def leftStick_=(newValues: StickValues): Unit = js.native
  
  /**
    * Callback triggered when the left joystick has changed
    * @param callback
    */
  def onleftstickchanged(callback: js.Function1[/* values */ StickValues, Unit]): Unit = js.native
  
  /**
    * Callback triggered when the right joystick has changed
    * @param callback
    */
  def onrightstickchanged(callback: js.Function1[/* values */ StickValues, Unit]): Unit = js.native
  
  /**
    * Gets the right joystick
    */
  def rightStick: StickValues = js.native
  /**
    * Sets the right joystick value
    */
  def rightStick_=(newValues: StickValues): Unit = js.native
  
  /**
    * Specifies what type of gamepad this represents
    */
  var `type`: Double = js.native
  
  /**
    * Updates the gamepad joystick positions
    */
  def update(): Unit = js.native
}
