package typings.babylonjs.webVRCameraMod

import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoseControlled extends js.Object {
  
  /**
    * The position of the device in babylon space.
    */
  var devicePosition: js.UndefOr[Vector3] = js.native
  
  /**
    * The rotation quaternion of the device in babylon space.
    */
  var deviceRotationQuaternion: Quaternion = js.native
  
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  var deviceScaleFactor: Double = js.native
  
  /**
    * The position of the object in babylon space.
    */
  var position: Vector3 = js.native
  
  /**
    * The raw pose coming from the device.
    */
  var rawPose: Nullable[DevicePose] = js.native
  
  /**
    * The rotation quaternion of the object in babylon space.
    */
  var rotationQuaternion: Quaternion = js.native
  
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  def updateFromDevice(poseData: DevicePose): Unit = js.native
}
object PoseControlled {
  
  @scala.inline
  def apply(
    deviceRotationQuaternion: Quaternion,
    deviceScaleFactor: Double,
    position: Vector3,
    rotationQuaternion: Quaternion,
    updateFromDevice: DevicePose => Unit
  ): PoseControlled = {
    val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice))
    __obj.asInstanceOf[PoseControlled]
  }
  
  @scala.inline
  implicit class PoseControlledOps[Self <: PoseControlled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceRotationQuaternion(value: Quaternion): Self = this.set("deviceRotationQuaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Vector3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationQuaternion(value: Quaternion): Self = this.set("rotationQuaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFromDevice(value: DevicePose => Unit): Self = this.set("updateFromDevice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDevicePosition(value: Vector3): Self = this.set("devicePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePosition: Self = this.set("devicePosition", js.undefined)
    
    @scala.inline
    def setRawPose(value: Nullable[DevicePose]): Self = this.set("rawPose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPoseNull: Self = this.set("rawPose", null)
  }
}
