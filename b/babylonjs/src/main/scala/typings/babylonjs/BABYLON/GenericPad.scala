package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericPad extends Gamepad {
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

