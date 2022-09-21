package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSAO2RenderingPipeline
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
  
  /* private */ var _bits: Any = js.native
  
  /* private */ var _blurHPostProcess: Any = js.native
  
  /* private */ var _blurVPostProcess: Any = js.native
  
  /* private */ var _createBlurPostProcess: Any = js.native
  
  /* private */ var _createRandomTexture: Any = js.native
  
  /* private */ var _createSSAOCombinePostProcess: Any = js.native
  
  /* private */ var _createSSAOPostProcess: Any = js.native
  
  /* private */ var _expensiveBlur: Any = js.native
  
  /**
    * Force rendering the geometry through geometry buffer
    */
  /* private */ var _forceGeometryBuffer: Any = js.native
  
  /* private */ var _generateHemisphere: Any = js.native
  
  /* private */ def _geometryBufferRenderer: Any = js.native
  
  /* private */ var _getDefinesForSSAO: Any = js.native
  
  /* private */ var _hammersley: Any = js.native
  
  /* private */ var _hemisphereSample_uniform: Any = js.native
  
  /* private */ var _originalColorPostProcess: Any = js.native
  
  /* private */ def _prePassRenderer: Any = js.native
  
  /* private */ var _radicalInverse_VdC: Any = js.native
  
  /* private */ var _randomTexture: Any = js.native
  
  /**
    * Ratio object used for SSAO ratio and blur ratio
    */
  /* private */ var _ratio: Any = js.native
  
  /**
    * Dynamically generated sphere sampler.
    */
  /* private */ var _sampleSphere: Any = js.native
  
  /**
    * Blur filter offsets
    */
  /* private */ var _samplerOffsets: Any = js.native
  
  /* private */ var _samples: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _ssaoCombinePostProcess: Any = js.native
  
  /* private */ var _ssaoPostProcess: Any = js.native
  
  /* private */ var _textureSamples: Any = js.native
  
  /**
    * The base color of the SSAO post-process
    * The final result is "base + ssao" between [0, 1]
    */
  var base: Double = js.native
  
  def dispose(disableGeometryBufferRenderer: Boolean): Unit = js.native
  
  def expensiveBlur: Boolean = js.native
  /**
    * If bilateral blur should be used
    */
  def expensiveBlur_=(b: Boolean): Unit = js.native
  
  /**
    * Maximum depth value to still render AO. A smooth falloff makes the dimming more natural, so there will be no abrupt shading change.
    */
  var maxZ: Double = js.native
  
  /**
    * In order to save performances, SSAO radius is clamped on close geometry. This ratio changes by how much
    */
  var minZAspect: Double = js.native
  
  /**
    * The radius around the analyzed pixel used by the SSAO post-process. Default value is 2.0
    */
  var radius: Double = js.native
  
  def samples: Double = js.native
  /**
    * Number of samples used for the SSAO calculations. Default value is 8
    */
  def samples_=(n: Double): Unit = js.native
  
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): Any = js.native
  
  def textureSamples: Double = js.native
  /**
    * Number of samples to use for antialiasing
    */
  def textureSamples_=(n: Double): Unit = js.native
  
  /**
    * The output strength of the SSAO post-process. Default value is 1.0.
    */
  var totalStrength: Double = js.native
}
