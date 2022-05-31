package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Gamepad")
@js.native
class Gamepad protected ()
  extends typings.babylonjs.legacyMod.Gamepad {
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
    leftStickX: Unit,
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
    leftStickY: Unit,
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
    leftStickX: Unit,
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
    leftStickX: Unit,
    leftStickY: Unit,
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
    rightStickX: Unit,
    rightStickY: Double
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
    leftStickY: Unit,
    rightStickX: Double,
    rightStickY: Double
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
    leftStickY: Unit,
    rightStickX: Unit,
    rightStickY: Double
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
    leftStickX: Unit,
    leftStickY: Double,
    rightStickX: Double,
    rightStickY: Double
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
    leftStickX: Unit,
    leftStickY: Double,
    rightStickX: Unit,
    rightStickY: Double
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
    leftStickX: Unit,
    leftStickY: Unit,
    rightStickX: Double,
    rightStickY: Double
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
    leftStickX: Unit,
    leftStickY: Unit,
    rightStickX: Unit,
    rightStickY: Double
  ) = this()
}
/* static members */
object Gamepad {
  
  @JSImport("babylonjs", "Gamepad")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents an Dual Shock controller
    */
  @JSImport("babylonjs", "Gamepad.DUALSHOCK")
  @js.native
  def DUALSHOCK: Double = js.native
  inline def DUALSHOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUALSHOCK")(x.asInstanceOf[js.Any])
  
  /**
    * Represents a gamepad controller
    */
  @JSImport("babylonjs", "Gamepad.GAMEPAD")
  @js.native
  def GAMEPAD: Double = js.native
  inline def GAMEPAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GAMEPAD")(x.asInstanceOf[js.Any])
  
  /**
    * Represents a generic controller
    */
  @JSImport("babylonjs", "Gamepad.GENERIC")
  @js.native
  def GENERIC: Double = js.native
  inline def GENERIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERIC")(x.asInstanceOf[js.Any])
  
  /**
    * Represents a pose-enabled controller
    */
  @JSImport("babylonjs", "Gamepad.POSE_ENABLED")
  @js.native
  def POSE_ENABLED: Double = js.native
  inline def POSE_ENABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSE_ENABLED")(x.asInstanceOf[js.Any])
  
  /**
    * Represents an XBox controller
    */
  @JSImport("babylonjs", "Gamepad.XBOX")
  @js.native
  def XBOX: Double = js.native
  inline def XBOX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
}
