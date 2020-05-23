package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DevicePose
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.XRWindowsMotionController")
@js.native
class XRWindowsMotionController protected ()
  extends typings.babylonjs.BABYLON.XRWindowsMotionController {
  /**
    * Construct a new XR-Based windows motion controller
    *
    * @param gamepadInfo the gamepad object from the browser
    */
  def this(gamepadInfo: js.Any) = this()
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

