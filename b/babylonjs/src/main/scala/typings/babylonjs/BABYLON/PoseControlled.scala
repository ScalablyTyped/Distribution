package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoseControlled extends js.Object {
  /**
    * The position of the device in babylon space.
    */
  var devicePosition: js.UndefOr[Vector3] = js.undefined
  /**
    * The rotation quaternion of the device in babylon space.
    */
  var deviceRotationQuaternion: Quaternion
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  var deviceScaleFactor: Double
  /**
    * The position of the object in babylon space.
    */
  var position: Vector3
  /**
    * The raw pose coming from the device.
    */
  var rawPose: Nullable[DevicePose]
  /**
    * The rotation quaternion of the object in babylon space.
    */
  var rotationQuaternion: Quaternion
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  def updateFromDevice(poseData: DevicePose): Unit
}

object PoseControlled {
  @scala.inline
  def apply(
    deviceRotationQuaternion: Quaternion,
    deviceScaleFactor: Double,
    position: Vector3,
    rotationQuaternion: Quaternion,
    updateFromDevice: DevicePose => Unit,
    devicePosition: Vector3 = null,
    rawPose: Nullable[DevicePose] = null
  ): PoseControlled = {
    val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice))
    if (devicePosition != null) __obj.updateDynamic("devicePosition")(devicePosition.asInstanceOf[js.Any])
    if (rawPose != null) __obj.updateDynamic("rawPose")(rawPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoseControlled]
  }
}

