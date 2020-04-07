package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "ViveController")
@js.native
class ViveController protected ()
  extends typings.babylonjs.gamepadsIndexMod.ViveController {
  /**
    * Creates a new ViveController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSImport("babylonjs/index", "ViveController")
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

