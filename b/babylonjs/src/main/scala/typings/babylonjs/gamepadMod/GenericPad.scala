package typings.babylonjs.gamepadMod

import typings.babylonjs.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/gamepad", "GenericPad")
@js.native
class GenericPad protected () extends Gamepad {
  /**
    * Initializes the generic gamepad
    * @param id The id of the generic gamepad
    * @param index The index of the generic gamepad
    * @param browserGamepad The browser gamepad
    */
  def this(id: String, index: Double, browserGamepad: js.Any) = this()
  var _buttons: js.Any = js.native
  var _onbuttondown: js.Any = js.native
  var _onbuttonup: js.Any = js.native
  var _setButtonValue: js.Any = js.native
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

