package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ViveController")
@js.native
class ViveController protected () extends WebVRController {
  /**
    * Creates a new ViveController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
  /**
    * Fired when the left button on this controller is modified
    */
  def onLeftButtonStateChangedObservable(): Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the menu button on this controller is modified
    */
  def onMenuButtonStateChangedObservable(): Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the right button on this controller is modified
    */
  def onRightButtonStateChangedObservable(): Observable[ExtendedGamepadButton] = js.native
}

/* static members */
@JSGlobal("BABYLON.ViveController")
@js.native
object ViveController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}

