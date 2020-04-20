package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OculusTouchController")
@js.native
class OculusTouchController protected () extends WebVRController {
  /**
    * Creates a new OculusTouchController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
  /**
    * Fired when the secondary trigger on this controller is modified
    */
  var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the thumb rest on this controller is modified
    */
  var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the A button on this controller is modified
    */
  def onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the B button on this controller is modified
    */
  def onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the X button on this controller is modified
    */
  def onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the Y button on this controller is modified
    */
  def onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}

/* static members */
@JSGlobal("BABYLON.OculusTouchController")
@js.native
object OculusTouchController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the left controller model.
    */
  var MODEL_LEFT_FILENAME: String = js.native
  /**
    * File name for the right controller model.
    */
  var MODEL_RIGHT_FILENAME: String = js.native
  /**
    * Base Url for the Quest controller model.
    */
  var QUEST_MODEL_BASE_URL: String = js.native
  /**
    * @hidden
    * If the controllers are running on a device that needs the updated Quest controller models
    */
  var _IsQuest: Boolean = js.native
}

