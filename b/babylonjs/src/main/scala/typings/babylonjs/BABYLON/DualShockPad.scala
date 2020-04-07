package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DualShockPad")
@js.native
class DualShockPad protected () extends Gamepad {
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
  /** Observable raised when a button is pressed */
  var onButtonDownObservable: Observable[DualShockButton] = js.native
  /** Observable raised when a button is released */
  var onButtonUpObservable: Observable[DualShockButton] = js.native
  /** Observable raised when a pad is pressed */
  var onPadDownObservable: Observable[DualShockDpad] = js.native
  /** Observable raised when a pad is released */
  var onPadUpObservable: Observable[DualShockDpad] = js.native
  /**
    * Gets the value of the `Circle` button
    */
  def buttonCircle(): Double = js.native
  /**
    * Sets the value of the `Circle` button
    */
  def buttonCircle(value: Double): js.Any = js.native
  /**
    * Gets the value of the `Cross` button
    */
  def buttonCross(): Double = js.native
  /**
    * Sets the value of the `Cross` button
    */
  def buttonCross(value: Double): js.Any = js.native
  /**
    * Gets the value of the `L1` button
    */
  def buttonL1(): Double = js.native
  /**
    * Sets the value of the `L1` button
    */
  def buttonL1(value: Double): js.Any = js.native
  /**
    * Gets the value of the Left joystick
    */
  def buttonLeftStick(): Double = js.native
  /**
    * Sets the value of the Left joystick
    */
  def buttonLeftStick(value: Double): js.Any = js.native
  /**
    * Gets the value of the `Options` button
    */
  def buttonOptions(): Double = js.native
  /**
    * Sets the value of the `Options` button
    */
  def buttonOptions(value: Double): js.Any = js.native
  /**
    * Gets the value of the `R1` button
    */
  def buttonR1(): Double = js.native
  /**
    * Sets the value of the `R1` button
    */
  def buttonR1(value: Double): js.Any = js.native
  /**
    * Gets the value of the Right joystick
    */
  def buttonRightStick(): Double = js.native
  /**
    * Sets the value of the Right joystick
    */
  def buttonRightStick(value: Double): js.Any = js.native
  /**
    * Gets the value of the `Share` button
    */
  def buttonShare(): Double = js.native
  /**
    * Sets the value of the `Share` button
    */
  def buttonShare(value: Double): js.Any = js.native
  /**
    * Gets the value of the `Square` button
    */
  def buttonSquare(): Double = js.native
  /**
    * Sets the value of the `Square` button
    */
  def buttonSquare(value: Double): js.Any = js.native
  /**
    * Gets the value of the `Triangle` button
    */
  def buttonTriangle(): Double = js.native
  /**
    * Sets the value of the `Triangle` button
    */
  def buttonTriangle(value: Double): js.Any = js.native
  /**
    * Gets the value of D-pad down
    */
  def dPadDown(): Double = js.native
  /**
    * Sets the value of D-pad down
    */
  def dPadDown(value: Double): js.Any = js.native
  /**
    * Gets the value of D-pad left
    */
  def dPadLeft(): Double = js.native
  /**
    * Sets the value of D-pad left
    */
  def dPadLeft(value: Double): js.Any = js.native
  /**
    * Gets the value of D-pad right
    */
  def dPadRight(): Double = js.native
  /**
    * Sets the value of D-pad right
    */
  def dPadRight(value: Double): js.Any = js.native
  /**
    * Gets the value of D-pad up
    */
  def dPadUp(): Double = js.native
  /**
    * Sets the value of D-pad up
    */
  def dPadUp(value: Double): js.Any = js.native
  /**
    * Gets the left trigger value
    */
  def leftTrigger(): Double = js.native
  /**
    * Sets the left trigger value
    */
  def leftTrigger(newValue: Double): js.Any = js.native
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
  def rightTrigger(): Double = js.native
  /**
    * Sets the right trigger value
    */
  def rightTrigger(newValue: Double): js.Any = js.native
}

