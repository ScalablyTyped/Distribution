package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRDistortionCorrectionPostProcess")
@js.native
open class VRDistortionCorrectionPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.VRDistortionCorrectionPostProcess {
  /**
    * Initializes the VRDistortionCorrectionPostProcess
    * @param name The name of the effect.
    * @param camera The camera to apply the render pass to.
    * @param isRightEye If this is for the right eye distortion
    * @param vrMetrics All the required metrics for the VR camera
    */
  def this(
    name: String,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    isRightEye: Boolean,
    vrMetrics: typings.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
}
