package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Vive Controller
     */
@JSImport("babylonjs", "ViveController")
@js.native
class ViveController protected ()
  extends babylonjsLib.BABYLONNs.ViveController {
  /**
           * Creates a new ViveController from a gamepad
           * @param vrGamepad the gamepad that the controller should be created from
           */
  def this(vrGamepad: js.Any) = this()
}

/**
     * Vive Controller
     */
@JSImport("babylonjs", "ViveController")
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

