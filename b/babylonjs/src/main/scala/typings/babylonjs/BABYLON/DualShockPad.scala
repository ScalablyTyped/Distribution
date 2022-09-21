package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DualShockPad
  extends StObject
     with Gamepad {
  
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
