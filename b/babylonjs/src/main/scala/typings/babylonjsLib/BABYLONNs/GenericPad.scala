package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a generic gamepad
  */
@JSGlobal("BABYLON.GenericPad")
@js.native
class GenericPad protected () extends Gamepad {
  /**
    * Initializes the generic gamepad
    * @param id The id of the generic gamepad
    * @param index The index of the generic gamepad
    * @param browserGamepad The browser gamepad
    */
  def this(id: java.lang.String, index: scala.Double, browserGamepad: js.Any) = this()
  var _buttons: js.Any = js.native
  var _onbuttondown: js.Any = js.native
  var _onbuttonup: js.Any = js.native
  var _setButtonValue: js.Any = js.native
  /**
    * Observable triggered when a button has been pressed
    */
  var onButtonDownObservable: Observable[scala.Double] = js.native
  /**
    * Observable triggered when a button has been released
    */
  var onButtonUpObservable: Observable[scala.Double] = js.native
  /**
    * Callback triggered when a button has been pressed
    * @param callback Called when a button has been pressed
    */
  def onbuttondown(callback: js.Function1[/* buttonPressed */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    * Callback triggered when a button has been released
    * @param callback Called when a button has been released
    */
  def onbuttonup(callback: js.Function1[/* buttonReleased */ scala.Double, scala.Unit]): scala.Unit = js.native
}

