package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GearVRController")
@js.native
class GearVRController protected ()
  extends typings.babylonjs.BABYLON.GearVRController {
  /**
    * Creates a new GearVRController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object GearVRController {
  
  @JSGlobal("BABYLON.GearVRController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gamepad Id prefix used to identify this controller.
    */
  @JSGlobal("BABYLON.GearVRController.GAMEPAD_ID_PREFIX")
  @js.native
  val GAMEPAD_ID_PREFIX: String = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSGlobal("BABYLON.GearVRController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  @scala.inline
  def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the controller model.
    */
  @JSGlobal("BABYLON.GearVRController.MODEL_FILENAME")
  @js.native
  def MODEL_FILENAME: String = js.native
  @scala.inline
  def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
}
