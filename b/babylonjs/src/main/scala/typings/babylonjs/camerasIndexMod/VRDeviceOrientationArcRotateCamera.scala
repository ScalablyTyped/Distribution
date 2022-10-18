package typings.babylonjs.camerasIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "VRDeviceOrientationArcRotateCamera")
@js.native
open class VRDeviceOrientationArcRotateCamera protected ()
  extends typings.babylonjs.camerasVRIndexMod.VRDeviceOrientationArcRotateCamera {
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
    vrCameraMetrics: typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Unit,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Scene,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
