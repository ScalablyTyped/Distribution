package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Daydream controller
  */
@JSGlobal("BABYLON.DaydreamController")
@js.native
class DaydreamController protected () extends WebVRController {
  /**
    * Creates a new DaydreamController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSGlobal("BABYLON.DaydreamController")
@js.native
object DaydreamController extends js.Object {
  /**
    * Gamepad Id prefix used to identify Daydream Controller.
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

