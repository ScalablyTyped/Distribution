package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSAORenderingPipeline
  extends StObject
     with PostProcessRenderPipeline {
  
  /**
    * @ignore
    * The horizontal blur PostProcess id in the pipeline
    */
  var SSAOBlurHRenderEffect: String = js.native
  
  /**
    * @ignore
    * The vertical blur PostProcess id in the pipeline
    */
  var SSAOBlurVRenderEffect: String = js.native
  
  /**
    * @ignore
    * The PostProcess id in the pipeline that combines the SSAO-Blur output with the original scene color (SSAOOriginalSceneColorEffect)
    */
  var SSAOCombineRenderEffect: String = js.native
  
  /**
    * @ignore
    * The PassPostProcess id in the pipeline that contains the original scene color
    */
  var SSAOOriginalSceneColorEffect: String = js.native
  
  /**
    * @ignore
    * The SSAO PostProcess id in the pipeline
    */
  var SSAORenderEffect: String = js.native
  
  /**
    * @internal
    */
  def _attachCameras(cameras: Any, unique: Boolean): Unit = js.native
  
  /* private */ var _blurHPostProcess: Any = js.native
  
  /* private */ var _blurVPostProcess: Any = js.native
  
  /* private */ var _createBlurPostProcess: Any = js.native
  
  /* private */ var _createRandomTexture: Any = js.native
  
  /* private */ var _createSSAOCombinePostProcess: Any = js.native
  
  /* private */ var _createSSAOPostProcess: Any = js.native
  
  /* private */ var _firstUpdate: Any = js.native
  
  /* private */ var _originalColorPostProcess: Any = js.native
  
  /* private */ var _randomTexture: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _ssaoCombinePostProcess: Any = js.native
  
  /* private */ var _ssaoPostProcess: Any = js.native
  
  /**
    * Related to fallOff, used to interpolate SSAO samples (first interpolate function input) based on the occlusion difference of each pixel
    * Must not be equal to fallOff and superior to fallOff.
    * Default value is 0.0075
    */
  var area: Double = js.native
  
  /**
    * The base color of the SSAO post-process
    * The final result is "base + ssao" between [0, 1]
    */
  var base: Double = js.native
  
  def dispose(disableDepthRender: Boolean): Unit = js.native
  
  /**
    * Related to area, used to interpolate SSAO samples (second interpolate function input) based on the occlusion difference of each pixel
    * Must not be equal to area and inferior to area.
    * Default value is 0.000001
    */
  var fallOff: Double = js.native
  
  /**
    * The radius around the analyzed pixel used by the SSAO post-process. Default value is 0.0006
    */
  var radius: Double = js.native
  
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  
  /**
    * The output strength of the SSAO post-process. Default value is 1.0.
    */
  var totalStrength: Double = js.native
}
