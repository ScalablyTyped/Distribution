package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Camera used to simulate VR rendering (based on FreeCamera)
  * @see http://doc.babylonjs.com/babylon101/cameras#vr-device-orientation-cameras
  */
@JSImport("babylonjs", "VRDeviceOrientationFreeCamera")
@js.native
class VRDeviceOrientationFreeCamera protected ()
  extends babylonjsLib.BABYLONNs.VRDeviceOrientationFreeCamera {
  /**
    * Creates a new VRDeviceOrientationFreeCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, compensateDistortion: scala.Boolean) = this()
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, compensateDistortion: scala.Boolean, vrCameraMetrics: babylonjsLib.BABYLONNs.VRCameraMetrics) = this()
}

