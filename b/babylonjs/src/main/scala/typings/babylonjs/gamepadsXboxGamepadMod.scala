package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsXboxGamepadMod {
  
  @js.native
  sealed trait Xbox360Button extends StObject
  @JSImport("babylonjs/Gamepads/xboxGamepad", "Xbox360Button")
  @js.native
  object Xbox360Button extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Xbox360Button & Double] = js.native
    
    /** A */
    @js.native
    sealed trait A
      extends StObject
         with Xbox360Button
    /* 0 */ val A: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.A & Double = js.native
    
    /** B */
    @js.native
    sealed trait B
      extends StObject
         with Xbox360Button
    /* 1 */ val B: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.B & Double = js.native
    
    /** Back */
    @js.native
    sealed trait Back
      extends StObject
         with Xbox360Button
    /* 8 */ val Back: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.Back & Double = js.native
    
    /** Left button */
    @js.native
    sealed trait LB
      extends StObject
         with Xbox360Button
    /* 4 */ val LB: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.LB & Double = js.native
    
    /** Left stick */
    @js.native
    sealed trait LeftStick
      extends StObject
         with Xbox360Button
    /* 10 */ val LeftStick: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.LeftStick & Double = js.native
    
    /** Right button */
    @js.native
    sealed trait RB
      extends StObject
         with Xbox360Button
    /* 5 */ val RB: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.RB & Double = js.native
    
    /** Right stick */
    @js.native
    sealed trait RightStick
      extends StObject
         with Xbox360Button
    /* 11 */ val RightStick: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.RightStick & Double = js.native
    
    /** Start */
    @js.native
    sealed trait Start
      extends StObject
         with Xbox360Button
    /* 9 */ val Start: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.Start & Double = js.native
    
    /** X */
    @js.native
    sealed trait X
      extends StObject
         with Xbox360Button
    /* 2 */ val X: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.X & Double = js.native
    
    /** Y */
    @js.native
    sealed trait Y
      extends StObject
         with Xbox360Button
    /* 3 */ val Y: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Button.Y & Double = js.native
  }
  
  @js.native
  sealed trait Xbox360Dpad extends StObject
  @JSImport("babylonjs/Gamepads/xboxGamepad", "Xbox360Dpad")
  @js.native
  object Xbox360Dpad extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Xbox360Dpad & Double] = js.native
    
    /** Down */
    @js.native
    sealed trait Down
      extends StObject
         with Xbox360Dpad
    /* 13 */ val Down: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Dpad.Down & Double = js.native
    
    /** Left */
    @js.native
    sealed trait Left
      extends StObject
         with Xbox360Dpad
    /* 14 */ val Left: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Dpad.Left & Double = js.native
    
    /** Right */
    @js.native
    sealed trait Right
      extends StObject
         with Xbox360Dpad
    /* 15 */ val Right: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Dpad.Right & Double = js.native
    
    /** Up */
    @js.native
    sealed trait Up
      extends StObject
         with Xbox360Dpad
    /* 12 */ val Up: typings.babylonjs.gamepadsXboxGamepadMod.Xbox360Dpad.Up & Double = js.native
  }
  
  @JSImport("babylonjs/Gamepads/xboxGamepad", "Xbox360Pad")
  @js.native
  open class Xbox360Pad protected ()
    extends typings.babylonjs.gamepadsGamepadMod.Gamepad {
    /**
      * Creates a new XBox360 gamepad object
      * @param id defines the id of this gamepad
      * @param index defines its index
      * @param gamepad defines the internal HTML gamepad object
      * @param xboxOne defines if it is a XBox One gamepad
      */
    def this(id: String, index: Double, gamepad: Any) = this()
    def this(id: String, index: Double, gamepad: Any, xboxOne: Boolean) = this()
    
    /* private */ var _buttonA: Any = js.native
    
    /* private */ var _buttonB: Any = js.native
    
    /* private */ var _buttonBack: Any = js.native
    
    /* private */ var _buttonLB: Any = js.native
    
    /* private */ var _buttonLeftStick: Any = js.native
    
    /* private */ var _buttonRB: Any = js.native
    
    /* private */ var _buttonRightStick: Any = js.native
    
    /* private */ var _buttonStart: Any = js.native
    
    /* private */ var _buttonX: Any = js.native
    
    /* private */ var _buttonY: Any = js.native
    
    /* private */ var _dPadDown: Any = js.native
    
    /* private */ var _dPadLeft: Any = js.native
    
    /* private */ var _dPadRight: Any = js.native
    
    /* private */ var _dPadUp: Any = js.native
    
    /* private */ var _isXboxOnePad: Any = js.native
    
    /* private */ var _leftTrigger: Any = js.native
    
    /* private */ var _onbuttondown: Any = js.native
    
    /* private */ var _onbuttonup: Any = js.native
    
    /* private */ var _ondpaddown: Any = js.native
    
    /* private */ var _ondpadup: Any = js.native
    
    /* private */ var _onlefttriggerchanged: Any = js.native
    
    /* private */ var _onrighttriggerchanged: Any = js.native
    
    /* private */ var _rightTrigger: Any = js.native
    
    /* private */ var _setButtonValue: Any = js.native
    
    /* private */ var _setDPadValue: Any = js.native
    
    /**
      * Gets the value of the `A` button
      */
    def buttonA: Double = js.native
    /**
      * Sets the value of the `A` button
      */
    def buttonA_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `B` button
      */
    def buttonB: Double = js.native
    /**
      * Sets the value of the `B` button
      */
    def buttonB_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Back` button
      */
    def buttonBack: Double = js.native
    /**
      * Sets the value of the `Back` button
      */
    def buttonBack_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Left` button
      */
    def buttonLB: Double = js.native
    /**
      * Sets the value of the `Left` button
      */
    def buttonLB_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the Left joystick
      */
    def buttonLeftStick: Double = js.native
    /**
      * Sets the value of the Left joystick
      */
    def buttonLeftStick_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Right` button
      */
    def buttonRB: Double = js.native
    /**
      * Sets the value of the `Right` button
      */
    def buttonRB_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the Right joystick
      */
    def buttonRightStick: Double = js.native
    /**
      * Sets the value of the Right joystick
      */
    def buttonRightStick_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Start` button
      */
    def buttonStart: Double = js.native
    /**
      * Sets the value of the `Start` button
      */
    def buttonStart_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `X` button
      */
    def buttonX: Double = js.native
    /**
      * Sets the value of the `X` button
      */
    def buttonX_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Y` button
      */
    def buttonY: Double = js.native
    /**
      * Sets the value of the `Y` button
      */
    def buttonY_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of D-pad down
      */
    def dPadDown: Double = js.native
    /**
      * Sets the value of D-pad down
      */
    def dPadDown_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of D-pad left
      */
    def dPadLeft: Double = js.native
    /**
      * Sets the value of D-pad left
      */
    def dPadLeft_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of D-pad right
      */
    def dPadRight: Double = js.native
    /**
      * Sets the value of D-pad right
      */
    def dPadRight_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of D-pad up
      */
    def dPadUp: Double = js.native
    /**
      * Sets the value of D-pad up
      */
    def dPadUp_=(value: Double): Unit = js.native
    
    /**
      * Gets the left trigger value
      */
    def leftTrigger: Double = js.native
    /**
      * Sets the left trigger value
      */
    def leftTrigger_=(newValue: Double): Unit = js.native
    
    /** Observable raised when a button is pressed */
    var onButtonDownObservable: Observable[Xbox360Button] = js.native
    
    /** Observable raised when a button is released */
    var onButtonUpObservable: Observable[Xbox360Button] = js.native
    
    /** Observable raised when a pad is pressed */
    var onPadDownObservable: Observable[Xbox360Dpad] = js.native
    
    /** Observable raised when a pad is released */
    var onPadUpObservable: Observable[Xbox360Dpad] = js.native
    
    /**
      * Defines the callback to call when a button is pressed
      * @param callback defines the callback to use
      */
    def onbuttondown(callback: js.Function1[/* buttonPressed */ Xbox360Button, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a button is released
      * @param callback defines the callback to use
      */
    def onbuttonup(callback: js.Function1[/* buttonReleased */ Xbox360Button, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a pad is pressed
      * @param callback defines the callback to use
      */
    def ondpaddown(callback: js.Function1[/* dPadPressed */ Xbox360Dpad, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a pad is released
      * @param callback defines the callback to use
      */
    def ondpadup(callback: js.Function1[/* dPadReleased */ Xbox360Dpad, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when left trigger is pressed
      * @param callback defines the callback to use
      */
    def onlefttriggerchanged(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when right trigger is pressed
      * @param callback defines the callback to use
      */
    def onrighttriggerchanged(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
    
    /**
      * Gets the right trigger value
      */
    def rightTrigger: Double = js.native
    /**
      * Sets the right trigger value
      */
    def rightTrigger_=(newValue: Double): Unit = js.native
  }
}
