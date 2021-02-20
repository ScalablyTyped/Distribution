package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "OculusTouchController")
@js.native
class OculusTouchController protected ()
  extends typings.babylonjs.indexMod.OculusTouchController {
  /**
    * Creates a new OculusTouchController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object OculusTouchController {
  
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  @scala.inline
  def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the left controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController.MODEL_LEFT_FILENAME")
  @js.native
  def MODEL_LEFT_FILENAME: String = js.native
  @scala.inline
  def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the right controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController.MODEL_RIGHT_FILENAME")
  @js.native
  def MODEL_RIGHT_FILENAME: String = js.native
  @scala.inline
  def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * Base Url for the Quest controller model.
    */
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController.QUEST_MODEL_BASE_URL")
  @js.native
  def QUEST_MODEL_BASE_URL: String = js.native
  @scala.inline
  def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * @hidden
    * If the controllers are running on a device that needs the updated Quest controller models
    */
  @JSImport("babylonjs/Legacy/legacy", "OculusTouchController._IsQuest")
  @js.native
  def _IsQuest: Boolean = js.native
  @scala.inline
  def _IsQuest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsQuest")(x.asInstanceOf[js.Any])
}
