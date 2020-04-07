package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRHTCViveMotionController")
@js.native
class WebXRHTCViveMotionController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRHTCViveMotionController {
  /**
    * Create a new Vive motion controller object
    * @param scene the scene to use to create this controller
    * @param gamepadObject the corresponding gamepad object
    * @param handness the handness of the controller
    */
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
}

/* static members */
@JSImport("babylonjs/XR/index", "WebXRHTCViveMotionController")
@js.native
object WebXRHTCViveMotionController extends js.Object {
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}

