package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRHTCViveMotionController")
@js.native
class WebXRHTCViveMotionController protected ()
  extends typings.babylonjs.BABYLON.WebXRHTCViveMotionController {
  /**
    * Create a new Vive motion controller object
    * @param scene the scene to use to create this controller
    * @param gamepadObject the corresponding gamepad object
    * @param handness the handness of the controller
    */
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRHTCViveMotionController")
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

