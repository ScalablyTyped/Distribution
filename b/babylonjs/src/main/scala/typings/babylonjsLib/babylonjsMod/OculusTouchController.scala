package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Oculus Touch Controller
  */
@JSImport("babylonjs", "OculusTouchController")
@js.native
class OculusTouchController protected ()
  extends babylonjsLib.BABYLONNs.OculusTouchController {
  /**
    * Creates a new OculusTouchController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/**
  * Oculus Touch Controller
  */
@JSImport("babylonjs", "OculusTouchController")
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

