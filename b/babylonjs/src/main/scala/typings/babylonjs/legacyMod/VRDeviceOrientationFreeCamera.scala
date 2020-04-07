package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "VRDeviceOrientationFreeCamera")
@js.native
class VRDeviceOrientationFreeCamera protected ()
  extends typings.babylonjs.indexMod.VRDeviceOrientationFreeCamera {
  /**
    * Creates a new VRDeviceOrientationFreeCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}

