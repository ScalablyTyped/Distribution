package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xbox360Pad extends Gamepad {
  
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
