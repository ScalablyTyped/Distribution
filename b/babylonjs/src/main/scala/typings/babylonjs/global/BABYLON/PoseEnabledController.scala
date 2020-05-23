package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DevicePose
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PoseEnabledController")
@js.native
class PoseEnabledController protected ()
  extends typings.babylonjs.BABYLON.PoseEnabledController {
  /**
    * Creates a new PoseEnabledController from a gamepad
    * @param browserGamepad the gamepad that the PoseEnabledController should be created from
    */
  def this(browserGamepad: js.Any) = this()
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
@JSGlobal("BABYLON.PoseEnabledController")
@js.native
object PoseEnabledController extends js.Object {
  /**
    * Name of the child mesh that can be used to cast a ray from the controller
    */
  val POINTING_POSE: String = js.native
}

