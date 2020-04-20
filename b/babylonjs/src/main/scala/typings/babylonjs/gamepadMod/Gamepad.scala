package typings.babylonjs.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/gamepad", "Gamepad")
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
  def this(
    /**
    * The id of the gamepad
    */
  id: String,
    /**
    * The index of the gamepad
    */
  index: Double,
    /**
    * The browser gamepad
    */
  browserGamepad: js.Any
  ) = this()
  def this(
    /**
    * The id of the gamepad
    */
  id: String,
    /**
    * The index of the gamepad
    */
  index: Double,
    /**
    * The browser gamepad
    */
  browserGamepad: js.Any,
    leftStickX: Double
  ) = this()
  def this(
    /**
    * The id of the gamepad
    */
  id: String,
    /**
    * The index of the gamepad
    */
  index: Double,
    /**
    * The browser gamepad
    */
  browserGamepad: js.Any,
    leftStickX: Double,
    leftStickY: Double
  ) = this()
  def this(
    /**
    * The id of the gamepad
    */
  id: String,
    /**
    * The index of the gamepad
    */
  index: Double,
    /**
    * The browser gamepad
    */
  browserGamepad: js.Any,
    leftStickX: Double,
    leftStickY: Double,
    rightStickX: Double
  ) = this()
  def this(
    /**
    * The id of the gamepad
    */
  id: String,
    /**
    * The index of the gamepad
    */
  index: Double,
    /**
    * The browser gamepad
    */
  browserGamepad: js.Any,
    leftStickX: Double,
    leftStickY: Double,
    rightStickX: Double,
    rightStickY: Double
  ) = this()
  /**
    * Specifies whether the left control stick should be Y-inverted
    */
  var _invertLeftStickY: Boolean = js.native
  /** @hidden */
  var _isConnected: Boolean = js.native
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
  var id: String = js.native
  /**
    * The index of the gamepad
    */
  var index: Double = js.native
  /**
    * Specifies what type of gamepad this represents
    */
  var `type`: Double = js.native
  /**
    * Disposes the gamepad
    */
  def dispose(): Unit = js.native
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
  def leftStick(newValues: StickValues): js.Any = js.native
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
  def rightStick(newValues: StickValues): js.Any = js.native
  /**
    * Updates the gamepad joystick positions
    */
  def update(): Unit = js.native
}

/* static members */
@JSImport("babylonjs/Gamepads/gamepad", "Gamepad")
@js.native
object Gamepad extends js.Object {
  /**
    * Represents an Dual Shock controller
    */
  var DUALSHOCK: Double = js.native
  /**
    * Represents a gamepad controller
    */
  var GAMEPAD: Double = js.native
  /**
    * Represents a generic controller
    */
  var GENERIC: Double = js.native
  /**
    * Represents a pose-enabled controller
    */
  var POSE_ENABLED: Double = js.native
  /**
    * Represents an XBox controller
    */
  var XBOX: Double = js.native
}

