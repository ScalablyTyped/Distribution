package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRGenericTriggerMotionController")
@js.native
class WebXRGenericTriggerMotionController protected () extends WebXRAbstractMotionController {
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
  /* protected */ def _updateModel(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRGenericTriggerMotionController")
@js.native
object WebXRGenericTriggerMotionController extends js.Object {
  /**
    * Static version of the profile id of this controller
    */
  var ProfileId: String = js.native
}

