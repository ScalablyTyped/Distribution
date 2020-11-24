package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/xboxGamepad", JSImport.Namespace)
@js.native
object xboxGamepadMod extends js.Object {
  
  @js.native
  sealed trait Xbox360Button extends js.Object
  @js.native
  object Xbox360Button extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Xbox360Button with Double] = js.native
    
    /** A */
    @js.native
    sealed trait A extends Xbox360Button
    /* 0 */ @js.native
    object A extends TopLevel[A with Double]
    
    /** B */
    @js.native
    sealed trait B extends Xbox360Button
    /* 1 */ @js.native
    object B extends TopLevel[B with Double]
    
    /** Back */
    @js.native
    sealed trait Back extends Xbox360Button
    /* 8 */ @js.native
    object Back extends TopLevel[Back with Double]
    
    /** Left button */
    @js.native
    sealed trait LB extends Xbox360Button
    /* 4 */ @js.native
    object LB extends TopLevel[LB with Double]
    
    /** Left stick */
    @js.native
    sealed trait LeftStick extends Xbox360Button
    /* 10 */ @js.native
    object LeftStick extends TopLevel[LeftStick with Double]
    
    /** Right button */
    @js.native
    sealed trait RB extends Xbox360Button
    /* 5 */ @js.native
    object RB extends TopLevel[RB with Double]
    
    /** Right stick */
    @js.native
    sealed trait RightStick extends Xbox360Button
    /* 11 */ @js.native
    object RightStick extends TopLevel[RightStick with Double]
    
    /** Start */
    @js.native
    sealed trait Start extends Xbox360Button
    /* 9 */ @js.native
    object Start extends TopLevel[Start with Double]
    
    /** X */
    @js.native
    sealed trait X extends Xbox360Button
    /* 2 */ @js.native
    object X extends TopLevel[X with Double]
    
    /** Y */
    @js.native
    sealed trait Y extends Xbox360Button
    /* 3 */ @js.native
    object Y extends TopLevel[Y with Double]
  }
  
  @js.native
  sealed trait Xbox360Dpad extends js.Object
  @js.native
  object Xbox360Dpad extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Xbox360Dpad with Double] = js.native
    
    /** Down */
    @js.native
    sealed trait Down extends Xbox360Dpad
    /* 13 */ @js.native
    object Down extends TopLevel[Down with Double]
    
    /** Left */
    @js.native
    sealed trait Left extends Xbox360Dpad
    /* 14 */ @js.native
    object Left extends TopLevel[Left with Double]
    
    /** Right */
    @js.native
    sealed trait Right extends Xbox360Dpad
    /* 15 */ @js.native
    object Right extends TopLevel[Right with Double]
    
    /** Up */
    @js.native
    sealed trait Up extends Xbox360Dpad
    /* 12 */ @js.native
    object Up extends TopLevel[Up with Double]
  }
  
  @js.native
  class Xbox360Pad protected ()
    extends typings.babylonjs.gamepadMod.Gamepad {
    /**
      * Creates a new XBox360 gamepad object
      * @param id defines the id of this gamepad
      * @param index defines its index
      * @param gamepad defines the internal HTML gamepad object
      * @param xboxOne defines if it is a XBox One gamepad
      */
    def this(id: String, index: Double, gamepad: js.Any) = this()
    def this(id: String, index: Double, gamepad: js.Any, xboxOne: Boolean) = this()
    
    var _buttonA: js.Any = js.native
    
    var _buttonB: js.Any = js.native
    
    var _buttonBack: js.Any = js.native
    
    var _buttonLB: js.Any = js.native
    
    var _buttonLeftStick: js.Any = js.native
    
    var _buttonRB: js.Any = js.native
    
    var _buttonRightStick: js.Any = js.native
    
    var _buttonStart: js.Any = js.native
    
    var _buttonX: js.Any = js.native
    
    var _buttonY: js.Any = js.native
    
    var _dPadDown: js.Any = js.native
    
    var _dPadLeft: js.Any = js.native
    
    var _dPadRight: js.Any = js.native
    
    var _dPadUp: js.Any = js.native
    
    var _isXboxOnePad: js.Any = js.native
    
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
