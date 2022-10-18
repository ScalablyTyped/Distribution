package typings.babylonjs

import typings.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasVRVrDeviceOrientationArcRotateCameraMod {
  
  @JSImport("babylonjs/Cameras/VR/vrDeviceOrientationArcRotateCamera", "VRDeviceOrientationArcRotateCamera")
  @js.native
  open class VRDeviceOrientationArcRotateCamera protected () extends ArcRotateCamera {
    /**
      * Creates a new VRDeviceOrientationArcRotateCamera
      * @param name defines camera name
      * @param alpha defines the camera rotation along the longitudinal axis
      * @param beta defines the camera rotation along the latitudinal axis
      * @param radius defines the camera distance from its target
      * @param target defines the camera target
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distortion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3) = this()
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Unit,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Unit,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
