package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a gamepad
     */
@JSImport("babylonjs", "Gamepad")
@js.native
class Gamepad protected ()
  extends babylonjsLib.BABYLONNs.Gamepad {
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
  browserGamepad: js.Any, leftStickX: scala.Double) = this()
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
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double) = this()
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
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double, rightStickX: scala.Double) = this()
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
  browserGamepad: js.Any, leftStickX: scala.Double, leftStickY: scala.Double, rightStickX: scala.Double, rightStickY: scala.Double) = this()
}

/**
     * Represents a gamepad
     */
@JSImport("babylonjs", "Gamepad")
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

