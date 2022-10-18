package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GenericController")
@js.native
open class GenericController protected ()
  extends typings.babylonjs.legacyLegacyMod.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: Any) = this()
}
/* static members */
object GenericController {
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs", "GenericController.MODEL_BASE_URL")
  @js.native
  val MODEL_BASE_URL: String = js.native
  
  /**
    * File name for the controller model.
    */
  @JSImport("babylonjs", "GenericController.MODEL_FILENAME")
  @js.native
  val MODEL_FILENAME: String = js.native
}
