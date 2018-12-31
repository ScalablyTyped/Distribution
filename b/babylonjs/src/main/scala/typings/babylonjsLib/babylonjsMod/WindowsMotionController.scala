package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the WindowsMotionController object that the state of the windows motion controller
  */
@JSImport("babylonjs", "WindowsMotionController")
@js.native
class WindowsMotionController protected ()
  extends babylonjsLib.BABYLONNs.WindowsMotionController {
  /**
    * Creates a new WindowsMotionController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/**
  * Defines the WindowsMotionController object that the state of the windows motion controller
  */
@JSImport("babylonjs", "WindowsMotionController")
@js.native
object WindowsMotionController extends js.Object {
  /**
    * The controller id pattern for this controller type
    */
  val GAMEPAD_ID_PATTERN: js.Any = js.native
  /**
    * The controller name prefix for this controller type
    */
  val GAMEPAD_ID_PREFIX: java.lang.String = js.native
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: java.lang.String = js.native
  /**
    * The name of the left controller model file
    */
  var MODEL_LEFT_FILENAME: java.lang.String = js.native
  /**
    * The name of the right controller model file
    */
  var MODEL_RIGHT_FILENAME: java.lang.String = js.native
}

