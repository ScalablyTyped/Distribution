package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ViveController")
@js.native
open class ViveController protected ()
  extends typings.babylonjs.indexMod.ViveController {
  /**
    * Creates a new ViveController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: Any) = this()
}
/* static members */
object ViveController {
  
  @JSImport("babylonjs/Legacy/legacy", "ViveController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "ViveController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "ViveController.MODEL_FILENAME")
  @js.native
  def MODEL_FILENAME: String = js.native
  inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
}
