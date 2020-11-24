package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/dualShockGamepad", JSImport.Namespace)
@js.native
object dualShockGamepadMod extends js.Object {
  
  @js.native
  sealed trait DualShockButton extends js.Object
  @js.native
  object DualShockButton extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DualShockButton with Double] = js.native
    
    /** Circle */
    @js.native
    sealed trait Circle extends DualShockButton
    /* 1 */ @js.native
    object Circle extends TopLevel[Circle with Double]
    
    /** Cross */
    @js.native
    sealed trait Cross extends DualShockButton
    /* 0 */ @js.native
    object Cross extends TopLevel[Cross with Double]
    
    /** L1 */
    @js.native
    sealed trait L1 extends DualShockButton
    /* 4 */ @js.native
    object L1 extends TopLevel[L1 with Double]
    
    /** Left stick */
    @js.native
    sealed trait LeftStick extends DualShockButton
    /* 10 */ @js.native
    object LeftStick extends TopLevel[LeftStick with Double]
    
    /** Options */
    @js.native
    sealed trait Options extends DualShockButton
    /* 9 */ @js.native
    object Options extends TopLevel[Options with Double]
    
    /** R1 */
    @js.native
    sealed trait R1 extends DualShockButton
    /* 5 */ @js.native
    object R1 extends TopLevel[R1 with Double]
    
    /** Right stick */
    @js.native
    sealed trait RightStick extends DualShockButton
    /* 11 */ @js.native
    object RightStick extends TopLevel[RightStick with Double]
    
    /** Share */
    @js.native
    sealed trait Share extends DualShockButton
    /* 8 */ @js.native
    object Share extends TopLevel[Share with Double]
    
    /** Square */
    @js.native
    sealed trait Square extends DualShockButton
    /* 2 */ @js.native
    object Square extends TopLevel[Square with Double]
    
    /** Triangle */
    @js.native
    sealed trait Triangle extends DualShockButton
    /* 3 */ @js.native
    object Triangle extends TopLevel[Triangle with Double]
  }
  
  @js.native
  sealed trait DualShockDpad extends js.Object
  @js.native
  object DualShockDpad extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DualShockDpad with Double] = js.native
    
    /** Down */
    @js.native
    sealed trait Down extends DualShockDpad
    /* 13 */ @js.native
    object Down extends TopLevel[Down with Double]
    
    /** Left */
    @js.native
    sealed trait Left extends DualShockDpad
    /* 14 */ @js.native
    object Left extends TopLevel[Left with Double]
    
    /** Right */
    @js.native
    sealed trait Right extends DualShockDpad
    /* 15 */ @js.native
    object Right extends TopLevel[Right with Double]
    
    /** Up */
    @js.native
    sealed trait Up extends DualShockDpad
    /* 12 */ @js.native
    object Up extends TopLevel[Up with Double]
  }
  
  @js.native
  class DualShockPad protected ()
    extends typings.babylonjs.gamepadMod.Gamepad {
    /**
      * Creates a new DualShock gamepad object
      * @param id defines the id of this gamepad
      * @param index defines its index
      * @param gamepad defines the internal HTML gamepad object
      */
    def this(id: String, index: Double, gamepad: js.Any) = this()
    
    var _buttonCircle: js.Any = js.native
    
    var _buttonCross: js.Any = js.native
    
    var _buttonL1: js.Any = js.native
    
    var _buttonLeftStick: js.Any = js.native
    
    var _buttonOptions: js.Any = js.native
    
    var _buttonR1: js.Any = js.native
    
    var _buttonRightStick: js.Any = js.native
    
    var _buttonShare: js.Any = js.native
    
    var _buttonSquare: js.Any = js.native
    
    var _buttonTriangle: js.Any = js.native
    
    var _dPadDown: js.Any = js.native
    
    var _dPadLeft: js.Any = js.native
    
    var _dPadRight: js.Any = js.native
    
    var _dPadUp: js.Any = js.native
    
    var _leftTrigger: js.Any = js.native
    
    var _onbuttondown: js.Any = js.native
    
    var _onbuttonup: js.Any = js.native
    
    var _ondpaddown: js.Any = js.native
    
    var _ondpadup: js.Any = js.native
    
    var _onlefttriggerchanged: js.Any = js.native
    
    var _onrighttriggerchanged: js.Any = js.native
    
    var _rightTrigger: js.Any = js.native
    
    var _setButtonValue: js.Any = js.native
    
    var _setDPadValue: js.Any = js.native
    
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
