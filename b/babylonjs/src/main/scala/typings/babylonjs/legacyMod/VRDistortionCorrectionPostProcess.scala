package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "VRDistortionCorrectionPostProcess")
@js.native
class VRDistortionCorrectionPostProcess protected ()
  extends typings.babylonjs.indexMod.VRDistortionCorrectionPostProcess {
  /**
    * Initializes the VRDistortionCorrectionPostProcess
    * @param name The name of the effect.
    * @param camera The camera to apply the render pass to.
    * @param isRightEye If this is for the right eye distortion
    * @param vrMetrics All the required metrics for the VR camera
    */
  def this(
    name: String,
    camera: typings.babylonjs.cameraMod.Camera,
    isRightEye: Boolean,
    vrMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}

