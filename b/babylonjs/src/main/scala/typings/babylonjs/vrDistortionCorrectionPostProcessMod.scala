package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrDistortionCorrectionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/vrDistortionCorrectionPostProcess", "VRDistortionCorrectionPostProcess")
  @js.native
  open class VRDistortionCorrectionPostProcess protected () extends PostProcess {
    /**
      * Initializes the VRDistortionCorrectionPostProcess
      * @param name The name of the effect.
      * @param camera The camera to apply the render pass to.
      * @param isRightEye If this is for the right eye distortion
      * @param vrMetrics All the required metrics for the VR camera
      */
    def this(name: String, camera: Camera, isRightEye: Boolean, vrMetrics: VRCameraMetrics) = this()
    
    /* private */ var _distortionFactors: Any = js.native
    
    /* private */ var _isRightEye: Any = js.native
    
    /* private */ var _lensCenter: Any = js.native
    
    /* private */ var _lensCenterOffset: Any = js.native
    
    /* private */ var _postProcessScaleFactor: Any = js.native
    
    /* private */ var _scaleFactor: Any = js.native
    
    /* private */ var _scaleIn: Any = js.native
  }
}
