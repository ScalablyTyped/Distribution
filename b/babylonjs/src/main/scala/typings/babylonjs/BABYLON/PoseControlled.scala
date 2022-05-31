package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoseControlled extends StObject {
  
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
  
  inline def apply(
    deviceRotationQuaternion: Quaternion,
    deviceScaleFactor: Double,
    position: Vector3,
    rotationQuaternion: Quaternion,
    updateFromDevice: DevicePose => Unit
  ): PoseControlled = {
    val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice), rawPose = null)
    __obj.asInstanceOf[PoseControlled]
  }
  
  extension [Self <: PoseControlled](x: Self) {
    
    inline def setDevicePosition(value: Vector3): Self = StObject.set(x, "devicePosition", value.asInstanceOf[js.Any])
    
    inline def setDevicePositionUndefined: Self = StObject.set(x, "devicePosition", js.undefined)
    
    inline def setDeviceRotationQuaternion(value: Quaternion): Self = StObject.set(x, "deviceRotationQuaternion", value.asInstanceOf[js.Any])
    
    inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRawPose(value: Nullable[DevicePose]): Self = StObject.set(x, "rawPose", value.asInstanceOf[js.Any])
    
    inline def setRawPoseNull: Self = StObject.set(x, "rawPose", null)
    
    inline def setRotationQuaternion(value: Quaternion): Self = StObject.set(x, "rotationQuaternion", value.asInstanceOf[js.Any])
    
    inline def setUpdateFromDevice(value: DevicePose => Unit): Self = StObject.set(x, "updateFromDevice", js.Any.fromFunction1(value))
  }
}
