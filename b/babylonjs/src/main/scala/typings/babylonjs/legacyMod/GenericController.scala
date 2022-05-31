package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GenericController")
@js.native
class GenericController protected ()
  extends typings.babylonjs.indexMod.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object GenericController {
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "GenericController.MODEL_BASE_URL")
  @js.native
  val MODEL_BASE_URL: String = js.native
  
  /**
    * File name for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "GenericController.MODEL_FILENAME")
  @js.native
  val MODEL_FILENAME: String = js.native
}
