package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VRDistortionCorrectionPostProcess used for mobile VR
  */
@JSGlobal("BABYLON.VRDistortionCorrectionPostProcess")
@js.native
class VRDistortionCorrectionPostProcess protected () extends PostProcess {
  /**
    * Initializes the VRDistortionCorrectionPostProcess
    * @param name The name of the effect.
    * @param camera The camera to apply the render pass to.
    * @param isRightEye If this is for the right eye distortion
    * @param vrMetrics All the required metrics for the VR camera
    */
  def this(name: java.lang.String, camera: Camera, isRightEye: scala.Boolean, vrMetrics: VRCameraMetrics) = this()
  var _distortionFactors: js.Any = js.native
  var _isRightEye: js.Any = js.native
  var _lensCenter: js.Any = js.native
  var _lensCenterOffset: js.Any = js.native
  var _postProcessScaleFactor: js.Any = js.native
  var _scaleFactor: js.Any = js.native
  var _scaleIn: js.Any = js.native
}

