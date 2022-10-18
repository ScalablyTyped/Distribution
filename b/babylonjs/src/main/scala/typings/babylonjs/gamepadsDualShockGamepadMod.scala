package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsDualShockGamepadMod {
  
  @js.native
  sealed trait DualShockButton extends StObject
  @JSImport("babylonjs/Gamepads/dualShockGamepad", "DualShockButton")
  @js.native
  object DualShockButton extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DualShockButton & Double] = js.native
    
    /** Circle */
    @js.native
    sealed trait Circle
      extends StObject
         with DualShockButton
    /* 1 */ val Circle: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Circle & Double = js.native
    
    /** Cross */
    @js.native
    sealed trait Cross
      extends StObject
         with DualShockButton
    /* 0 */ val Cross: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Cross & Double = js.native
    
    /** L1 */
    @js.native
    sealed trait L1
      extends StObject
         with DualShockButton
    /* 4 */ val L1: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.L1 & Double = js.native
    
    /** Left stick */
    @js.native
    sealed trait LeftStick
      extends StObject
         with DualShockButton
    /* 10 */ val LeftStick: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.LeftStick & Double = js.native
    
    /** Options */
    @js.native
    sealed trait Options
      extends StObject
         with DualShockButton
    /* 9 */ val Options: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Options & Double = js.native
    
    /** R1 */
    @js.native
    sealed trait R1
      extends StObject
         with DualShockButton
    /* 5 */ val R1: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.R1 & Double = js.native
    
    /** Right stick */
    @js.native
    sealed trait RightStick
      extends StObject
         with DualShockButton
    /* 11 */ val RightStick: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.RightStick & Double = js.native
    
    /** Share */
    @js.native
    sealed trait Share
      extends StObject
         with DualShockButton
    /* 8 */ val Share: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Share & Double = js.native
    
    /** Square */
    @js.native
    sealed trait Square
      extends StObject
         with DualShockButton
    /* 2 */ val Square: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Square & Double = js.native
    
    /** Triangle */
    @js.native
    sealed trait Triangle
      extends StObject
         with DualShockButton
    /* 3 */ val Triangle: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockButton.Triangle & Double = js.native
  }
  
  @js.native
  sealed trait DualShockDpad extends StObject
  @JSImport("babylonjs/Gamepads/dualShockGamepad", "DualShockDpad")
  @js.native
  object DualShockDpad extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DualShockDpad & Double] = js.native
    
    /** Down */
    @js.native
    sealed trait Down
      extends StObject
         with DualShockDpad
    /* 13 */ val Down: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockDpad.Down & Double = js.native
    
    /** Left */
    @js.native
    sealed trait Left
      extends StObject
         with DualShockDpad
    /* 14 */ val Left: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockDpad.Left & Double = js.native
    
    /** Right */
    @js.native
    sealed trait Right
      extends StObject
         with DualShockDpad
    /* 15 */ val Right: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockDpad.Right & Double = js.native
    
    /** Up */
    @js.native
    sealed trait Up
      extends StObject
         with DualShockDpad
    /* 12 */ val Up: typings.babylonjs.gamepadsDualShockGamepadMod.DualShockDpad.Up & Double = js.native
  }
  
  @JSImport("babylonjs/Gamepads/dualShockGamepad", "DualShockPad")
  @js.native
  open class DualShockPad protected ()
    extends typings.babylonjs.gamepadsGamepadMod.Gamepad {
    /**
      * Creates a new DualShock gamepad object
      * @param id defines the id of this gamepad
      * @param index defines its index
      * @param gamepad defines the internal HTML gamepad object
      */
    def this(id: String, index: Double, gamepad: Any) = this()
    
    /* private */ var _buttonCircle: Any = js.native
    
    /* private */ var _buttonCross: Any = js.native
    
    /* private */ var _buttonL1: Any = js.native
    
    /* private */ var _buttonLeftStick: Any = js.native
    
    /* private */ var _buttonOptions: Any = js.native
    
    /* private */ var _buttonR1: Any = js.native
    
    /* private */ var _buttonRightStick: Any = js.native
    
    /* private */ var _buttonShare: Any = js.native
    
    /* private */ var _buttonSquare: Any = js.native
    
    /* private */ var _buttonTriangle: Any = js.native
    
    /* private */ var _dPadDown: Any = js.native
    
    /* private */ var _dPadLeft: Any = js.native
    
    /* private */ var _dPadRight: Any = js.native
    
    /* private */ var _dPadUp: Any = js.native
    
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
      * Gets the value of the `Circle` button
      */
    def buttonCircle: Double = js.native
    /**
      * Sets the value of the `Circle` button
      */
    def buttonCircle_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Cross` button
      */
    def buttonCross: Double = js.native
    /**
      * Sets the value of the `Cross` button
      */
    def buttonCross_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `L1` button
      */
    def buttonL1: Double = js.native
    /**
      * Sets the value of the `L1` button
      */
    def buttonL1_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the Left joystick
      */
    def buttonLeftStick: Double = js.native
    /**
      * Sets the value of the Left joystick
      */
    def buttonLeftStick_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Options` button
      */
    def buttonOptions: Double = js.native
    /**
      * Sets the value of the `Options` button
      */
    def buttonOptions_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `R1` button
      */
    def buttonR1: Double = js.native
    /**
      * Sets the value of the `R1` button
      */
    def buttonR1_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the Right joystick
      */
    def buttonRightStick: Double = js.native
    /**
      * Sets the value of the Right joystick
      */
    def buttonRightStick_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Share` button
      */
    def buttonShare: Double = js.native
    /**
      * Sets the value of the `Share` button
      */
    def buttonShare_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Square` button
      */
    def buttonSquare: Double = js.native
    /**
      * Sets the value of the `Square` button
      */
    def buttonSquare_=(value: Double): Unit = js.native
    
    /**
      * Gets the value of the `Triangle` button
      */
    def buttonTriangle: Double = js.native
    /**
      * Sets the value of the `Triangle` button
      */
    def buttonTriangle_=(value: Double): Unit = js.native
    
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
    var onButtonDownObservable: Observable[DualShockButton] = js.native
    
    /** Observable raised when a button is released */
    var onButtonUpObservable: Observable[DualShockButton] = js.native
    
    /** Observable raised when a pad is pressed */
    var onPadDownObservable: Observable[DualShockDpad] = js.native
    
    /** Observable raised when a pad is released */
    var onPadUpObservable: Observable[DualShockDpad] = js.native
    
    /**
      * Defines the callback to call when a button is pressed
      * @param callback defines the callback to use
      */
    def onbuttondown(callback: js.Function1[/* buttonPressed */ DualShockButton, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a button is released
      * @param callback defines the callback to use
      */
    def onbuttonup(callback: js.Function1[/* buttonReleased */ DualShockButton, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a pad is pressed
      * @param callback defines the callback to use
      */
    def ondpaddown(callback: js.Function1[/* dPadPressed */ DualShockDpad, Unit]): Unit = js.native
    
    /**
      * Defines the callback to call when a pad is released
      * @param callback defines the callback to use
      */
    def ondpadup(callback: js.Function1[/* dPadReleased */ DualShockDpad, Unit]): Unit = js.native
    
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
