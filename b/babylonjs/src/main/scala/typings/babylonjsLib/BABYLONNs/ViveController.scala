package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Vive Controller
     */
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
  val onLeftButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the menu button on this controller is modified
           */
  val onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the right button on this controller is modified
           */
  val onRightButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}

/**
     * Vive Controller
     */
@JSGlobal("BABYLON.ViveController")
@js.native
object ViveController extends js.Object {
  /**
           * Base Url for the controller model.
           */
  var MODEL_BASE_URL: java.lang.String = js.native
  /**
           * File name for the controller model.
           */
  var MODEL_FILENAME: java.lang.String = js.native
}

