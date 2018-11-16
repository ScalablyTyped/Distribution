package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Camera used to simulate VR rendering (based on VRDeviceOrientationFreeCamera)
     * @see http://doc.babylonjs.com/babylon101/cameras#vr-device-orientation-cameras
     */
@JSGlobal("BABYLON.VRDeviceOrientationGamepadCamera")
@js.native
class VRDeviceOrientationGamepadCamera protected () extends VRDeviceOrientationFreeCamera {
  /**
           * Creates a new VRDeviceOrientationGamepadCamera
           * @param name defines camera name
           * @param position defines the start position of the camera
           * @param scene defines the scene the camera belongs to
           * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
           * @param vrCameraMetrics defines the vr metrics associated to the camera
           */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  /**
           * Creates a new VRDeviceOrientationGamepadCamera
           * @param name defines camera name
           * @param position defines the start position of the camera
           * @param scene defines the scene the camera belongs to
           * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
           * @param vrCameraMetrics defines the vr metrics associated to the camera
           */
  def this(name: java.lang.String, position: Vector3, scene: Scene, compensateDistortion: scala.Boolean) = this()
  /**
           * Creates a new VRDeviceOrientationGamepadCamera
           * @param name defines camera name
           * @param position defines the start position of the camera
           * @param scene defines the scene the camera belongs to
           * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
           * @param vrCameraMetrics defines the vr metrics associated to the camera
           */
  def this(name: java.lang.String, position: Vector3, scene: Scene, compensateDistortion: scala.Boolean, vrCameraMetrics: VRCameraMetrics) = this()
}

