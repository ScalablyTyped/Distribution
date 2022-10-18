package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsGamepadMod {
  
  @JSImport("babylonjs/Gamepads/gamepad", "Gamepad")
  @js.native
  open class Gamepad protected () extends StObject {
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
    browserGamepad: Any
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
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
    browserGamepad: Any,
      leftStickX: Unit,
      leftStickY: Unit,
      rightStickX: Unit,
      rightStickY: Double
    ) = this()
    
    /**
      * Specifies whether the left control stick should be Y-inverted
      */
    /* protected */ var _invertLeftStickY: Boolean = js.native
    
    /** @internal */
    var _isConnected: Boolean = js.native
    
    /* private */ var _leftStick: Any = js.native
    
    /* private */ var _leftStickAxisX: Any = js.native
    
    /* private */ var _leftStickAxisY: Any = js.native
    
    /**
      * Triggered when the left control stick has been changed
      */
    /* private */ var _onleftstickchanged: Any = js.native
    
    /**
      * Triggered when the right control stick has been changed
      */
    /* private */ var _onrightstickchanged: Any = js.native
    
    /* private */ var _rightStick: Any = js.native
    
    /* private */ var _rightStickAxisX: Any = js.native
    
    /* private */ var _rightStickAxisY: Any = js.native
    
    /**
      * The browser gamepad
      */
    var browserGamepad: Any = js.native
    
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
  /* static members */
  object Gamepad {
    
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Represents an Dual Shock controller
      */
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad.DUALSHOCK")
    @js.native
    def DUALSHOCK: Double = js.native
    inline def DUALSHOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUALSHOCK")(x.asInstanceOf[js.Any])
    
    /**
      * Represents a gamepad controller
      */
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad.GAMEPAD")
    @js.native
    def GAMEPAD: Double = js.native
    inline def GAMEPAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GAMEPAD")(x.asInstanceOf[js.Any])
    
    /**
      * Represents a generic controller
      */
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad.GENERIC")
    @js.native
    def GENERIC: Double = js.native
    inline def GENERIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERIC")(x.asInstanceOf[js.Any])
    
    /**
      * Represents a pose-enabled controller
      */
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad.POSE_ENABLED")
    @js.native
    def POSE_ENABLED: Double = js.native
    inline def POSE_ENABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSE_ENABLED")(x.asInstanceOf[js.Any])
    
    /**
      * Represents an XBox controller
      */
    @JSImport("babylonjs/Gamepads/gamepad", "Gamepad.XBOX")
    @js.native
    def XBOX: Double = js.native
    inline def XBOX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/gamepad", "GenericPad")
  @js.native
  open class GenericPad protected ()
    extends typings.babylonjs.gamepadsGamepadMod.Gamepad {
    /**
      * Initializes the generic gamepad
      * @param id The id of the generic gamepad
      * @param index The index of the generic gamepad
      * @param browserGamepad The browser gamepad
      */
    def this(id: String, index: Double, browserGamepad: Any) = this()
    
    /* private */ var _buttons: Any = js.native
    
    /* private */ var _onbuttondown: Any = js.native
    
    /* private */ var _onbuttonup: Any = js.native
    
    /* private */ var _setButtonValue: Any = js.native
    
    /**
      * Observable triggered when a button has been pressed
      */
    var onButtonDownObservable: Observable[Double] = js.native
    
    /**
      * Observable triggered when a button has been released
      */
    var onButtonUpObservable: Observable[Double] = js.native
    
    /**
      * Callback triggered when a button has been pressed
      * @param callback Called when a button has been pressed
      */
    def onbuttondown(callback: js.Function1[/* buttonPressed */ Double, Unit]): Unit = js.native
    
    /**
      * Callback triggered when a button has been released
      * @param callback Called when a button has been released
      */
    def onbuttonup(callback: js.Function1[/* buttonReleased */ Double, Unit]): Unit = js.native
  }
  
  @JSImport("babylonjs/Gamepads/gamepad", "StickValues")
  @js.native
  open class StickValues protected () extends StObject {
    /**
      * Initializes the gamepad x and y control stick values
      * @param x The x component of the gamepad control stick value
      * @param y The y component of the gamepad control stick value
      */
    def this(
      /**
      * The x component of the control stick
      */
    x: Double,
      /**
      * The y component of the control stick
      */
    y: Double
    ) = this()
    
    /**
      * The x component of the control stick
      */
    var x: Double = js.native
    
    /**
      * The y component of the control stick
      */
    var y: Double = js.native
  }
  
  trait GamepadButtonChanges extends StObject {
    
    /**
      * Called when a gamepad has been changed
      */
    var changed: Boolean
    
    /**
      * Called when a gamepad press event has been triggered
      */
    var pressChanged: Boolean
    
    /**
      * Called when a touch event has been triggered
      */
    var touchChanged: Boolean
    
    /**
      * Called when a value has changed
      */
    var valueChanged: Boolean
  }
  object GamepadButtonChanges {
    
    inline def apply(changed: Boolean, pressChanged: Boolean, touchChanged: Boolean, valueChanged: Boolean): GamepadButtonChanges = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], pressChanged = pressChanged.asInstanceOf[js.Any], touchChanged = touchChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadButtonChanges]
    }
    
    extension [Self <: GamepadButtonChanges](x: Self) {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setPressChanged(value: Boolean): Self = StObject.set(x, "pressChanged", value.asInstanceOf[js.Any])
      
      inline def setTouchChanged(value: Boolean): Self = StObject.set(x, "touchChanged", value.asInstanceOf[js.Any])
      
      inline def setValueChanged(value: Boolean): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    }
  }
}
