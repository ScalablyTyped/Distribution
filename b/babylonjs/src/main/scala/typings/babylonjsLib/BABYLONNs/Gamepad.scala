package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gamepad
  */
@JSGlobal("BABYLON.Gamepad")
@js.native
class Gamepad protected () extends js.Object {
  /**
    * Initializes the gamepad
    * @param id The id of the gamepad
    * @param index The index of the gamepad
    * @param browserGamepad The browser gamepad
    * @param leftStickX The x component of the left joystick
    * @param leftStickY The y component of the left joystick
    * @param rightStickX The x component of the right joystick
    * @param rightStickY The y component of the right joystick
    */
  def this(/**
    * The id of the gamepad
    */
  id: java.lang.String, /**
    * The index of the gamepad
    */
  index: scala.Double, /**
    * The browser gamepad
    */
  browserGamepad: js.Any) = this()
  def this(/**
    * The id of the gamepad
    */
  id: java.lang.String, /**
    * The index of the gamepad
    */
  index: scala.Double, /**
    * The browser gamepad
    */
  browserGamepad: js.Any, leftStickX: scala.Double) = this()
  def this(/**
    * The id of the gamepad
    */
  id: java.lang.String, /**
    * The index of the gamepad
    */
  index: scala.Double, /**
    * The browser gamepad
    */
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double) = this()
  def this(/**
    * The id of the gamepad
    */
  id: java.lang.String, /**
    * The index of the gamepad
    */
  index: scala.Double, /**
    * The browser gamepad
    */
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double, rightStickX: scala.Double) = this()
  def this(/**
    * The id of the gamepad
    */
  id: java.lang.String, /**
    * The index of the gamepad
    */
  index: scala.Double, /**
    * The browser gamepad
    */
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double, rightStickX: scala.Double, rightStickY: scala.Double) = this()
  /**
    * Specifies whether the left control stick should be Y-inverted
    */
  var _invertLeftStickY: scala.Boolean = js.native
  /** @hidden */
  var _isConnected: scala.Boolean = js.native
  var _leftStick: js.Any = js.native
  var _leftStickAxisX: js.Any = js.native
  var _leftStickAxisY: js.Any = js.native
  /**
    * Triggered when the left control stick has been changed
    */
  var _onleftstickchanged: js.Any = js.native
  /**
    * Triggered when the right control stick has been changed
    */
  var _onrightstickchanged: js.Any = js.native
  var _rightStick: js.Any = js.native
  var _rightStickAxisX: js.Any = js.native
  var _rightStickAxisY: js.Any = js.native
  /**
    * The browser gamepad
    */
  var browserGamepad: js.Any = js.native
  /**
    * The id of the gamepad
    */
  var id: java.lang.String = js.native
  /**
    * The index of the gamepad
    */
  var index: scala.Double = js.native
  /**
    * Specifies if the gamepad has been connected
    */
  val isConnected: scala.Boolean = js.native
  /**
    * Gets the left joystick
    */
  /**
    * Sets the left joystick values
    */
  var leftStick: StickValues = js.native
  /**
    * Gets the right joystick
    */
  /**
    * Sets the right joystick value
    */
  var rightStick: StickValues = js.native
  /**
    * Specifies what type of gamepad this represents
    */
  var `type`: scala.Double = js.native
  /**
    * Disposes the gamepad
    */
  def dispose(): scala.Unit = js.native
  /**
    * Callback triggered when the left joystick has changed
    * @param callback
    */
  def onleftstickchanged(callback: js.Function1[/* values */ StickValues, scala.Unit]): scala.Unit = js.native
  /**
    * Callback triggered when the right joystick has changed
    * @param callback
    */
  def onrightstickchanged(callback: js.Function1[/* values */ StickValues, scala.Unit]): scala.Unit = js.native
  /**
    * Updates the gamepad joystick positions
    */
  def update(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.Gamepad")
@js.native
object Gamepad extends js.Object {
  /**
    * Represents a gamepad controller
    */
  var GAMEPAD: scala.Double = js.native
  /**
    * Represents a generic controller
    */
  var GENERIC: scala.Double = js.native
  /**
    * Represents a pose-enabled controller
    */
  var POSE_ENABLED: scala.Double = js.native
  /**
    * Represents an XBox controller
    */
  var XBOX: scala.Double = js.native
}

