package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXROculusTouchMotionController")
@js.native
class WebXROculusTouchMotionController protected ()
  extends typings.babylonjs.BABYLON.WebXROculusTouchMotionController {
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: js.UndefOr[scala.Nothing],
    _forceLegacyControllers: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: Boolean,
    _forceLegacyControllers: Boolean
  ) = this()
}
/* static members */
object WebXROculusTouchMotionController {
  
  @JSGlobal("BABYLON.WebXROculusTouchMotionController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The base url used to load the left and right controller models
    */
  @JSGlobal("BABYLON.WebXROculusTouchMotionController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  @scala.inline
  def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the left controller model file
    */
  @JSGlobal("BABYLON.WebXROculusTouchMotionController.MODEL_LEFT_FILENAME")
  @js.native
  def MODEL_LEFT_FILENAME: String = js.native
  @scala.inline
  def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the right controller model file
    */
  @JSGlobal("BABYLON.WebXROculusTouchMotionController.MODEL_RIGHT_FILENAME")
  @js.native
  def MODEL_RIGHT_FILENAME: String = js.native
  @scala.inline
  def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  
  /**
    * Base Url for the Quest controller model.
    */
  @JSGlobal("BABYLON.WebXROculusTouchMotionController.QUEST_MODEL_BASE_URL")
  @js.native
  def QUEST_MODEL_BASE_URL: String = js.native
  @scala.inline
  def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
}
