package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSAO2RenderingPipeline extends PostProcessRenderPipeline {
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
  var _bits: js.Any = js.native
  var _blurHPostProcess: js.Any = js.native
  var _blurVPostProcess: js.Any = js.native
  var _createBlurPostProcess: js.Any = js.native
  var _createRandomTexture: js.Any = js.native
  var _createSSAOCombinePostProcess: js.Any = js.native
  var _createSSAOPostProcess: js.Any = js.native
  var _depthTexture: js.Any = js.native
  var _expensiveBlur: js.Any = js.native
  var _generateHemisphere: js.Any = js.native
  var _hammersley: js.Any = js.native
  var _hemisphereSample_uniform: js.Any = js.native
  var _normalTexture: js.Any = js.native
  var _originalColorPostProcess: js.Any = js.native
  var _radicalInverse_VdC: js.Any = js.native
  var _randomTexture: js.Any = js.native
  /**
    * Ratio object used for SSAO ratio and blur ratio
    */
  var _ratio: js.Any = js.native
  /**
    * Dynamically generated sphere sampler.
    */
  var _sampleSphere: js.Any = js.native
  /**
    * Blur filter offsets
    */
  var _samplerOffsets: js.Any = js.native
  var _samples: js.Any = js.native
  var _scene: js.Any = js.native
  var _ssaoCombinePostProcess: js.Any = js.native
  var _ssaoPostProcess: js.Any = js.native
  var _textureSamples: js.Any = js.native
  /**
    * The base color of the SSAO post-process
    * The final result is "base + ssao" between [0, 1]
    */
  var base: Double = js.native
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
  /**
    * The output strength of the SSAO post-process. Default value is 1.0.
    */
  var totalStrength: Double = js.native
  def dispose(disableGeometryBufferRenderer: Boolean): Unit = js.native
  def expensiveBlur: Boolean = js.native
  /**
    * If bilateral blur should be used
    */
  def expensiveBlur(b: Boolean): js.Any = js.native
  def samples: Double = js.native
  /**
    * Number of samples used for the SSAO calculations. Default value is 8
    */
  def samples(n: Double): js.Any = js.native
  /**
    * Gets active scene
    */
  def scene: Scene = js.native
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  def textureSamples: Double = js.native
  /**
    * Number of samples to use for antialiasing
    */
  def textureSamples(n: Double): js.Any = js.native
}

