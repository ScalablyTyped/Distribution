package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DevicePose
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OculusTouchController")
@js.native
class OculusTouchController protected ()
  extends typings.babylonjs.BABYLON.OculusTouchController {
  /**
    * Creates a new OculusTouchController from a gamepad
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
@JSGlobal("BABYLON.OculusTouchController")
@js.native
object OculusTouchController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the left controller model.
    */
  var MODEL_LEFT_FILENAME: String = js.native
  /**
    * File name for the right controller model.
    */
  var MODEL_RIGHT_FILENAME: String = js.native
  /**
    * Base Url for the Quest controller model.
    */
  var QUEST_MODEL_BASE_URL: String = js.native
  /**
    * @hidden
    * If the controllers are running on a device that needs the updated Quest controller models
    */
  var _IsQuest: Boolean = js.native
}

