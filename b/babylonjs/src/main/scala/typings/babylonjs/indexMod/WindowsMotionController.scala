package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "WindowsMotionController")
@js.native
class WindowsMotionController protected ()
  extends typings.babylonjs.gamepadsIndexMod.WindowsMotionController {
  /**
    * Creates a new WindowsMotionController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSImport("babylonjs/index", "WindowsMotionController")
@js.native
object WindowsMotionController extends js.Object {
  /**
    * The controller id pattern for this controller type
    */
  val GAMEPAD_ID_PATTERN: js.Any = js.native
  /**
    * The controller name prefix for this controller type
    */
  val GAMEPAD_ID_PREFIX: String = js.native
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * The name of the left controller model file
    */
  var MODEL_LEFT_FILENAME: String = js.native
  /**
    * The name of the right controller model file
    */
  var MODEL_RIGHT_FILENAME: String = js.native
}

