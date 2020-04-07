package typings.babylonjs.gamepadsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/index", "Gamepad")
@js.native
class Gamepad protected ()
  extends typings.babylonjs.gamepadMod.Gamepad {
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
}

/* static members */
@JSImport("babylonjs/Gamepads/index", "Gamepad")
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

