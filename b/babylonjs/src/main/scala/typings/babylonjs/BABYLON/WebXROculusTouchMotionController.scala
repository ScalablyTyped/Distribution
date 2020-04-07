package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXROculusTouchMotionController")
@js.native
class WebXROculusTouchMotionController protected () extends WebXRAbstractMotionController {
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
  var _forceLegacyControllers: js.Any = js.native
  /**
    * Is this the new type of oculus touch. At the moment both have the same profile and it is impossible to differentiate
    * between the touch and touch 2.
    */
  var _isQuest: js.Any = js.native
  var _modelRootNode: js.Any = js.native
  /* protected */ def _updateModel(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXROculusTouchMotionController")
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

