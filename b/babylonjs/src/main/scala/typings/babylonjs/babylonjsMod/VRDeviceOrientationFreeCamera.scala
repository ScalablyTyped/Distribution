package typings.babylonjs.babylonjsMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "VRDeviceOrientationFreeCamera")
@js.native
open class VRDeviceOrientationFreeCamera protected ()
  extends typings.babylonjs.vRIndexMod.VRDeviceOrientationFreeCamera {
  /**
    * Creates a new VRDeviceOrientationFreeCamera
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
    vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Unit,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    compensateDistortion: Unit,
    vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
