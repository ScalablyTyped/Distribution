package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render pipeline to produce ssao effect
  */
@JSGlobal("BABYLON.SSAO2RenderingPipeline")
@js.native
class SSAO2RenderingPipeline protected () extends PostProcessRenderPipeline {
  /**
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: java.lang.String, scene: Scene, ratio: js.Any) = this()
  def this(name: java.lang.String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
  /**
    * @ignore
    * The horizontal blur PostProcess id in the pipeline
    */
  var SSAOBlurHRenderEffect: java.lang.String = js.native
  /**
    * @ignore
    * The vertical blur PostProcess id in the pipeline
    */
  var SSAOBlurVRenderEffect: java.lang.String = js.native
  /**
    * @ignore
    * The PostProcess id in the pipeline that combines the SSAO-Blur output with the original scene color (SSAOOriginalSceneColorEffect)
    */
  var SSAOCombineRenderEffect: java.lang.String = js.native
  /**
    * @ignore
    * The PassPostProcess id in the pipeline that contains the original scene color
    */
  var SSAOOriginalSceneColorEffect: java.lang.String = js.native
  /**
    * @ignore
    * The SSAO PostProcess id in the pipeline
    */
  var SSAORenderEffect: java.lang.String = js.native
  var _bits: js.Any = js.native
  var _blurHPostProcess: js.Any = js.native
  var _blurVPostProcess: js.Any = js.native
  var _createBlurPostProcess: js.Any = js.native
  var _createRandomTexture: js.Any = js.native
  var _createSSAOCombinePostProcess: js.Any = js.native
  var _createSSAOPostProcess: js.Any = js.native
  var _depthTexture: js.Any = js.native
  var _expensiveBlur: js.Any = js.native
  var _firstUpdate: js.Any = js.native
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
  var base: scala.Double = js.native
  /**
    * If bilateral blur should be used
    */
  var expensiveBlur: scala.Boolean = js.native
  /**
    * Maximum depth value to still render AO. A smooth falloff makes the dimming more natural, so there will be no abrupt shading change.
    */
  var maxZ: scala.Double = js.native
  /**
    * In order to save performances, SSAO radius is clamped on close geometry. This ratio changes by how much
    */
  var minZAspect: scala.Double = js.native
  /**
    * The radius around the analyzed pixel used by the SSAO post-process. Default value is 2.0
    */
  var radius: scala.Double = js.native
  /**
    * Number of samples used for the SSAO calculations. Default value is 8
    */
  var samples: scala.Double = js.native
  /**
    * Number of samples to use for antialiasing
    */
  var textureSamples: scala.Double = js.native
  /**
    * The output strength of the SSAO post-process. Default value is 1.0.
    */
  var totalStrength: scala.Double = js.native
  def dispose(disableGeometryBufferRenderer: scala.Boolean): scala.Unit = js.native
  /**
    * Serialize the rendering pipeline (Used when exporting)
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

/**
  * Render pipeline to produce ssao effect
  */
@JSGlobal("BABYLON.SSAO2RenderingPipeline")
@js.native
object SSAO2RenderingPipeline extends js.Object {
  /**
    *  Support test.
    */
  val IsSupported: scala.Boolean = js.native
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.SSAO2RenderingPipeline = js.native
}

