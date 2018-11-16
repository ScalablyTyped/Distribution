package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * VRDistortionCorrectionPostProcess used for mobile VR
     */
@JSImport("babylonjs", "VRDistortionCorrectionPostProcess")
@js.native
class VRDistortionCorrectionPostProcess protected ()
  extends babylonjsLib.BABYLONNs.VRDistortionCorrectionPostProcess {
  /**
           * Initializes the VRDistortionCorrectionPostProcess
           * @param name The name of the effect.
           * @param camera The camera to apply the render pass to.
           * @param isRightEye If this is for the right eye distortion
           * @param vrMetrics All the required metrics for the VR camera
           */
  def this(name: java.lang.String, camera: babylonjsLib.BABYLONNs.Camera, isRightEye: scala.Boolean, vrMetrics: babylonjsLib.BABYLONNs.VRCameraMetrics) = this()
}

