package typings.babylonjs

import typings.babylonjs.deviceOrientationCameraMod.DeviceOrientationCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/VR/vrDeviceOrientationFreeCamera", JSImport.Namespace)
@js.native
object vrDeviceOrientationFreeCameraMod extends js.Object {
  @js.native
  class VRDeviceOrientationFreeCamera protected () extends DeviceOrientationCamera {
    /**
      * Creates a new VRDeviceOrientationFreeCamera
      * @param name defines camera name
      * @param position defines the start position of the camera
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
  }
  
}

