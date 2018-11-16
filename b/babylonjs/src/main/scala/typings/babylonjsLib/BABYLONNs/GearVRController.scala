package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Gear VR Controller
     */
@JSGlobal("BABYLON.GearVRController")
@js.native
class GearVRController protected () extends WebVRController {
  /**
           * Creates a new GearVRController from a gamepad
           * @param vrGamepad the gamepad that the controller should be created from
           */
  def this(vrGamepad: js.Any) = this()
  val _buttonIndexToObservableNameMap: js.Any = js.native
}

/**
     * Gear VR Controller
     */
@JSGlobal("BABYLON.GearVRController")
@js.native
object GearVRController extends js.Object {
  /**
           * Gamepad Id prefix used to identify this controller.
           */
  val GAMEPAD_ID_PREFIX: java.lang.String = js.native
  /**
           * Base Url for the controller model.
           */
  var MODEL_BASE_URL: java.lang.String = js.native
  /**
           * File name for the controller model.
           */
  var MODEL_FILENAME: java.lang.String = js.native
}

