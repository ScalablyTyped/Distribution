package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DevicePose
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebVRController")
@js.native
abstract class WebVRController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebVRController {
  /**
    * Creates a new WebVRController from a gamepad
    * @param vrGamepad the gamepad that the WebVRController should be created from
    */
  def this(vrGamepad: Any) = this()
  
  /**
    * The rotation quaternion of the device in babylon space.
    */
  /* CompleteClass */
  var deviceRotationQuaternion: typings.babylonjs.BABYLON.Quaternion = js.native
  
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  /* CompleteClass */
  var deviceScaleFactor: Double = js.native
  
  /**
    * The position of the object in babylon space.
    */
  /* CompleteClass */
  var position: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The raw pose coming from the device.
    */
  /* CompleteClass */
  var rawPose: Nullable[DevicePose] = js.native
  
  /**
    * The rotation quaternion of the object in babylon space.
    */
  /* CompleteClass */
  var rotationQuaternion: typings.babylonjs.BABYLON.Quaternion = js.native
  
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  /* CompleteClass */
  override def updateFromDevice(poseData: DevicePose): Unit = js.native
}
