package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GenericController")
@js.native
class GenericController protected ()
  extends typings.babylonjs.BABYLON.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
@JSGlobal("BABYLON.GenericController")
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
