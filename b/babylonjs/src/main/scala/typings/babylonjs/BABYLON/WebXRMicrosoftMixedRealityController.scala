package typings.babylonjs.BABYLON

import typings.babylonjs.AnonAxes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
class WebXRMicrosoftMixedRealityController protected () extends WebXRAbstractMotionController {
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  val _mapping: AnonAxes = js.native
  /* protected */ def _updateModel(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
object WebXRMicrosoftMixedRealityController extends js.Object {
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
}

