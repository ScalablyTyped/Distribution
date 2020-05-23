package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DevicePose
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WindowsMotionController")
@js.native
class WindowsMotionController protected ()
  extends typings.babylonjs.BABYLON.WindowsMotionController {
  /**
    * Creates a new WindowsMotionController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
  /**
    * The rotation quaternion of the device in babylon space.
    */
  /* CompleteClass */
  override var deviceRotationQuaternion: typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  /* CompleteClass */
  override var deviceScaleFactor: Double = js.native
  /**
    * The position of the object in babylon space.
    */
  /* CompleteClass */
  override var position: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The raw pose coming from the device.
    */
  /* CompleteClass */
  override var rawPose: Nullable[DevicePose] = js.native
  /**
    * The rotation quaternion of the object in babylon space.
    */
  /* CompleteClass */
  override var rotationQuaternion: typings.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  /* CompleteClass */
  override def updateFromDevice(poseData: DevicePose): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WindowsMotionController")
@js.native
object WindowsMotionController extends js.Object {
  /**
    * The controller id pattern for this controller type
    */
  val GAMEPAD_ID_PATTERN: js.Any = js.native
  /**
    * The controller name prefix for this controller type
    */
  val GAMEPAD_ID_PREFIX: String = js.native
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

