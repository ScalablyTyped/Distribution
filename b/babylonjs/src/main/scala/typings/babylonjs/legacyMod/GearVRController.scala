package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GearVRController")
@js.native
class GearVRController protected ()
  extends typings.babylonjs.indexMod.GearVRController {
  /**
    * Creates a new GearVRController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "GearVRController")
@js.native
object GearVRController extends js.Object {
  
  /**
    * Gamepad Id prefix used to identify this controller.
    */
  val GAMEPAD_ID_PREFIX: String = js.native
  
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}
