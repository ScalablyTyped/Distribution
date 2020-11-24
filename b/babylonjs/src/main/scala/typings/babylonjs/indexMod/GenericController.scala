package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "GenericController")
@js.native
class GenericController protected ()
  extends typings.babylonjs.gamepadsIndexMod.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
@JSImport("babylonjs/index", "GenericController")
@js.native
object GenericController extends js.Object {
  
  /**
    * Base Url for the controller model.
    */
  val MODEL_BASE_URL: String = js.native
  
  /**
    * File name for the controller model.
    */
  val MODEL_FILENAME: String = js.native
}
