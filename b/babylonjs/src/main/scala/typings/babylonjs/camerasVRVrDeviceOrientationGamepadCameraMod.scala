package typings.babylonjs

import typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
import typings.babylonjs.camerasVRVrDeviceOrientationFreeCameraMod.VRDeviceOrientationFreeCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasVRVrDeviceOrientationGamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/VR/vrDeviceOrientationGamepadCamera", "VRDeviceOrientationGamepadCamera")
  @js.native
  open class VRDeviceOrientationGamepadCamera protected () extends VRDeviceOrientationFreeCamera {
    /**
      * Creates a new VRDeviceOrientationGamepadCamera
      * @param name defines camera name
      * @param position defines the start position of the camera
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distortion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, compensateDistortion: Boolean) = this()
    def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Unit,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Unit,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
  }
}
