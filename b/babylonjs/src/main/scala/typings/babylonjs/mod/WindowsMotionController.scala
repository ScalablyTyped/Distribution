package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WindowsMotionController")
@js.native
class WindowsMotionController protected ()
  extends typings.babylonjs.legacyMod.WindowsMotionController {
  /**
    * Creates a new WindowsMotionController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object WindowsMotionController {
  
  @JSImport("babylonjs", "WindowsMotionController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The controller id pattern for this controller type
    */
  @JSImport("babylonjs", "WindowsMotionController.GAMEPAD_ID_PATTERN")
  @js.native
  val GAMEPAD_ID_PATTERN: js.Any = js.native
  
  /**
    * The controller name prefix for this controller type
    */
  @JSImport("babylonjs", "WindowsMotionController.GAMEPAD_ID_PREFIX")
  @js.native
  val GAMEPAD_ID_PREFIX: String = js.native
  
  /**
    * The base url used to load the left and right controller models
    */
  @JSImport("babylonjs", "WindowsMotionController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the left controller model file
    */
  @JSImport("babylonjs", "WindowsMotionController.MODEL_LEFT_FILENAME")
  @js.native
  def MODEL_LEFT_FILENAME: String = js.native
  inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the right controller model file
    */
  @JSImport("babylonjs", "WindowsMotionController.MODEL_RIGHT_FILENAME")
  @js.native
  def MODEL_RIGHT_FILENAME: String = js.native
  inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
}
