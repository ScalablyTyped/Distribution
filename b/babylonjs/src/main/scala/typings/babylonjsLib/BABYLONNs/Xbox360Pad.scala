package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a XBox360 gamepad
     */
@JSGlobal("BABYLON.Xbox360Pad")
@js.native
class Xbox360Pad protected () extends Gamepad {
  /**
           * Creates a new XBox360 gamepad object
           * @param id defines the id of this gamepad
           * @param index defines its index
           * @param gamepad defines the internal HTML gamepad object
           * @param xboxOne defines if it is a XBox One gamepad
           */
  def this(id: java.lang.String, index: scala.Double, gamepad: js.Any) = this()
  /**
           * Creates a new XBox360 gamepad object
           * @param id defines the id of this gamepad
           * @param index defines its index
           * @param gamepad defines the internal HTML gamepad object
           * @param xboxOne defines if it is a XBox One gamepad
           */
  def this(id: java.lang.String, index: scala.Double, gamepad: js.Any, xboxOne: scala.Boolean) = this()
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
  /**
          * Sets the value of the `A` button
          */
  var buttonA: scala.Double = js.native
  /**
           * Gets the value of the `B` button
           */
  /**
          * Sets the value of the `B` button
          */
  var buttonB: scala.Double = js.native
  /**
           * Gets the value of the `Back` button
           */
  /**
          * Sets the value of the `Back` button
          */
  var buttonBack: scala.Double = js.native
  /**
           * Gets the value of the `Left` button
           */
  /**
          * Sets the value of the `Left` button
          */
  var buttonLB: scala.Double = js.native
  /**
           * Gets the value of the Left joystick
           */
  /**
          * Sets the value of the Left joystick
          */
  var buttonLeftStick: scala.Double = js.native
  /**
           * Gets the value of the `Right` button
           */
  /**
          * Sets the value of the `Right` button
          */
  var buttonRB: scala.Double = js.native
  /**
           * Gets the value of the Right joystick
           */
  /**
          * Sets the value of the Right joystick
          */
  var buttonRightStick: scala.Double = js.native
  /**
           * Gets the value of the `Start` button
           */
  /**
          * Sets the value of the `Start` button
          */
  var buttonStart: scala.Double = js.native
  /**
           * Gets the value of the `X` button
           */
  /**
          * Sets the value of the `X` button
          */
  var buttonX: scala.Double = js.native
  /**
           * Gets the value of the `Y` button
           */
  /**
          * Sets the value of the `Y` button
          */
  var buttonY: scala.Double = js.native
  /**
           * Gets the value of D-pad down
           */
  /**
          * Sets the value of D-pad down
          */
  var dPadDown: scala.Double = js.native
  /**
           * Gets the value of D-pad left
           */
  /**
          * Sets the value of D-pad left
          */
  var dPadLeft: scala.Double = js.native
  /**
           * Gets the value of D-pad right
           */
  /**
          * Sets the value of D-pad right
          */
  var dPadRight: scala.Double = js.native
  /**
           * Gets the value of D-pad up
           */
  /**
          * Sets the value of D-pad up
          */
  var dPadUp: scala.Double = js.native
  /**
           * Gets the left trigger value
           */
  /**
          * Sets the left trigger value
          */
  var leftTrigger: scala.Double = js.native
  /** Observable raised when a button is pressed */
  var onButtonDownObservable: Observable[Xbox360Button] = js.native
  /** Observable raised when a button is released */
  var onButtonUpObservable: Observable[Xbox360Button] = js.native
  /** Observable raised when a pad is pressed */
  var onPadDownObservable: Observable[Xbox360Dpad] = js.native
  /** Observable raised when a pad is released */
  var onPadUpObservable: Observable[Xbox360Dpad] = js.native
  /**
           * Gets the right trigger value
           */
  /**
          * Sets the right trigger value
          */
  var rightTrigger: scala.Double = js.native
  /**
           * Defines the callback to call when a button is pressed
           * @param callback defines the callback to use
           */
  def onbuttondown(callback: js.Function1[/* buttonPressed */ Xbox360Button, scala.Unit]): scala.Unit = js.native
  /**
           * Defines the callback to call when a button is released
           * @param callback defines the callback to use
           */
  def onbuttonup(callback: js.Function1[/* buttonReleased */ Xbox360Button, scala.Unit]): scala.Unit = js.native
  /**
           * Defines the callback to call when a pad is pressed
           * @param callback defines the callback to use
           */
  def ondpaddown(callback: js.Function1[/* dPadPressed */ Xbox360Dpad, scala.Unit]): scala.Unit = js.native
  /**
           * Defines the callback to call when a pad is released
           * @param callback defines the callback to use
           */
  def ondpadup(callback: js.Function1[/* dPadReleased */ Xbox360Dpad, scala.Unit]): scala.Unit = js.native
  /**
           * Defines the callback to call when left trigger is pressed
           * @param callback defines the callback to use
           */
  def onlefttriggerchanged(callback: js.Function1[/* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
           * Defines the callback to call when right trigger is pressed
           * @param callback defines the callback to use
           */
  def onrighttriggerchanged(callback: js.Function1[/* value */ scala.Double, scala.Unit]): scala.Unit = js.native
}

