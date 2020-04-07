package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXROculusTouchMotionController")
@js.native
class WebXROculusTouchMotionController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXROculusTouchMotionController {
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  def this(
    scene: Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness,
    legacyMapping: Boolean
  ) = this()
  def this(
    scene: Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness,
    legacyMapping: Boolean,
    _forceLegacyControllers: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/XR/index", "WebXROculusTouchMotionController")
@js.native
object WebXROculusTouchMotionController extends js.Object {
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * The name of the left controller model file
    */
  var MODEL_LEFT_FILENAME: String = js.native
  /**
    * The name of the right controller model file
    */
  var MODEL_RIGHT_FILENAME: String = js.native
  /**
    * Base Url for the Quest controller model.
    */
  var QUEST_MODEL_BASE_URL: String = js.native
}

