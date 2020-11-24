package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "OculusTouchController")
@js.native
class OculusTouchController protected ()
  extends typings.babylonjs.gamepadsIndexMod.OculusTouchController {
  /**
    * Creates a new OculusTouchController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
@JSImport("babylonjs/index", "OculusTouchController")
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
