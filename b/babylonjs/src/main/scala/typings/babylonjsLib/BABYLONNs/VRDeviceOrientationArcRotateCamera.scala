package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Camera used to simulate VR rendering (based on ArcRotateCamera)
     * @see http://doc.babylonjs.com/babylon101/cameras#vr-device-orientation-cameras
     */
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
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, scene: Scene) = this()
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
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, scene: Scene, compensateDistortion: scala.Boolean) = this()
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
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, scene: Scene, compensateDistortion: scala.Boolean, vrCameraMetrics: VRCameraMetrics) = this()
}

