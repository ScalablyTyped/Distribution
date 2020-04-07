package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VRDeviceOrientationArcRotateCamera")
@js.native
class VRDeviceOrientationArcRotateCamera protected () extends ArcRotateCamera {
  /**
    * Creates a new VRDeviceOrientationArcRotateCamera
    * @param name defines camera name
    * @param alpha defines the camera rotation along the logitudinal axis
    * @param beta defines the camera rotation along the latitudinal axis
    * @param radius defines the camera distance from its target
    * @param target defines the camera target
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
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
    scene: Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: VRCameraMetrics
  ) = this()
}

