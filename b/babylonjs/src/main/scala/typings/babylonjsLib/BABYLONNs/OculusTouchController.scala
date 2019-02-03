package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Oculus Touch Controller
  */
@JSGlobal("BABYLON.OculusTouchController")
@js.native
class OculusTouchController protected () extends WebVRController {
  /**
    * Creates a new OculusTouchController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
  /**
    * Fired when the A button on this controller is modified
    */
  val onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the B button on this controller is modified
    */
  val onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the secondary trigger on this controller is modified
    */
  var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the thumb rest on this controller is modified
    */
  var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the X button on this controller is modified
    */
  val onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the Y button on this controller is modified
    */
  val onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}

/* static members */
@JSGlobal("BABYLON.OculusTouchController")
@js.native
object OculusTouchController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: java.lang.String = js.native
  /**
    * File name for the left controller model.
    */
  var MODEL_LEFT_FILENAME: java.lang.String = js.native
  /**
    * File name for the right controller model.
    */
  var MODEL_RIGHT_FILENAME: java.lang.String = js.native
}

