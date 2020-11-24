package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ViveController")
@js.native
class ViveController protected ()
  extends typings.babylonjs.legacyMod.ViveController {
  /**
    * Creates a new ViveController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
@JSImport("babylonjs", "ViveController")
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
