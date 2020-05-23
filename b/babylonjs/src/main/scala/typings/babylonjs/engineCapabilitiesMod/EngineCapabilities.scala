package typings.babylonjs.engineCapabilitiesMod

import typings.babylonjs.EXTDisjointTimerQuery
import typings.babylonjs.anon.COMPLETIONSTATUSKHR
import typings.std.EXTTextureFilterAnisotropic
import typings.std.WEBGLCompressedTextureS3tc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineCapabilities extends js.Object {
  /** Defines if astc texture compression is supported */
  var astc: js.Any
  /** Defines if the blend min max extension is supported */
  var blendMinMax: Boolean
  /** Defines if timestamp can be used with timer query */
  var canUseTimestampForTimerQuery: Boolean
  /** Defines if float color buffer are supported */
  var colorBufferFloat: Boolean
  /** Defines if depth textures are supported */
  var depthTextureExtension: Boolean
  /** Defines if draw buffers extension is supported */
  var drawBuffersExtension: Boolean
  /** Defines if etc1 texture compression is supported */
  var etc1: js.Any
  /** Defines if etc2 texture compression is supported */
  var etc2: js.Any
  /** Defines if depth reading in the fragment shader is supported */
  var fragmentDepthSupported: Boolean
  /** Defines if high precision shaders are supported */
  var highPrecisionShaderSupported: Boolean
  /** Defines if instancing is supported */
  var instancedArrays: Boolean
  /** Gets the maximum level of anisotropy supported */
  var maxAnisotropy: Double
  /** Maximum textures units in the entire pipeline */
  var maxCombinedTexturesImageUnits: Double
  /** Maximum cube texture size */
  var maxCubemapTextureSize: Double
  /** Maximum number of uniforms per fragment shader */
  var maxFragmentUniformVectors: Double
  /** Max number of texture samples for MSAA */
  var maxMSAASamples: Double
  /** Maximum render texture size */
  var maxRenderTextureSize: Double
  /** Maximum texture samples */
  var maxSamples: js.UndefOr[Double] = js.undefined
  /** Maximum texture size */
  var maxTextureSize: Double
  /** Maximum textures units per fragment shader */
  var maxTexturesImageUnits: Double
  /** Maximum number of varyings */
  var maxVaryingVectors: Double
  /** Maximum number of vertex attributes */
  var maxVertexAttribs: Double
  /** Maximum texture units per vertex shader */
  var maxVertexTextureImageUnits: Double
  /** Maximum number of uniforms per vertex shader */
  var maxVertexUniformVectors: Double
  /** Defines if multiview is supported (https://www.khronos.org/registry/webgl/extensions/WEBGL_multiview/) */
  var multiview: js.UndefOr[js.Any] = js.undefined
  /** Defines if oculus multiview is supported (https://developer.oculus.com/documentation/oculus-browser/latest/concepts/browser-multiview/) */
  var oculusMultiview: js.UndefOr[js.Any] = js.undefined
  /** Function used to let the system compiles shaders in background */
  var parallelShaderCompile: js.UndefOr[COMPLETIONSTATUSKHR] = js.undefined
  /** Defines if pvrtc texture compression is supported */
  var pvrtc: js.Any
  /** Defines if s3tc texture compression is supported */
  var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.undefined
  /** Defines if standard derivates (dx/dy) are supported */
  var standardDerivatives: Boolean
  /** Gets the webgl extension for anisotropic filtering (null if not supported) */
  var textureAnisotropicFilterExtension: js.UndefOr[EXTTextureFilterAnisotropic] = js.undefined
  /** Defines if float textures are supported */
  var textureFloat: Boolean
  /** Defines if float texture linear filtering is supported*/
  var textureFloatLinearFiltering: Boolean
  /** Defines if rendering to float textures is supported */
  var textureFloatRender: Boolean
  /** Defines if half float textures are supported*/
  var textureHalfFloat: Boolean
  /** Defines if half float texture linear filtering is supported*/
  var textureHalfFloatLinearFiltering: Boolean
  /** Defines if rendering to half float textures is supported */
  var textureHalfFloatRender: Boolean
  /** Defines if textureLOD shader command is supported */
  var textureLOD: Boolean
  /** Gets disjoint timer query extension (null if not supported) */
  var timerQuery: js.UndefOr[EXTDisjointTimerQuery] = js.undefined
  /** Defines if 32 bits indices are supported */
  var uintIndices: Boolean
  /** Defines if vertex array objects are supported */
  var vertexArrayObject: Boolean
}

object EngineCapabilities {
  @scala.inline
  def apply(
    astc: js.Any,
    blendMinMax: Boolean,
    canUseTimestampForTimerQuery: Boolean,
    colorBufferFloat: Boolean,
    depthTextureExtension: Boolean,
    drawBuffersExtension: Boolean,
    etc1: js.Any,
    etc2: js.Any,
    fragmentDepthSupported: Boolean,
    highPrecisionShaderSupported: Boolean,
    instancedArrays: Boolean,
    maxAnisotropy: Double,
    maxCombinedTexturesImageUnits: Double,
    maxCubemapTextureSize: Double,
    maxFragmentUniformVectors: Double,
    maxMSAASamples: Double,
    maxRenderTextureSize: Double,
    maxTextureSize: Double,
    maxTexturesImageUnits: Double,
    maxVaryingVectors: Double,
    maxVertexAttribs: Double,
    maxVertexTextureImageUnits: Double,
    maxVertexUniformVectors: Double,
    pvrtc: js.Any,
    standardDerivatives: Boolean,
    textureFloat: Boolean,
    textureFloatLinearFiltering: Boolean,
    textureFloatRender: Boolean,
    textureHalfFloat: Boolean,
    textureHalfFloatLinearFiltering: Boolean,
    textureHalfFloatRender: Boolean,
    textureLOD: Boolean,
    uintIndices: Boolean,
    vertexArrayObject: Boolean,
    maxSamples: js.UndefOr[Double] = js.undefined,
    multiview: js.Any = null,
    oculusMultiview: js.Any = null,
    parallelShaderCompile: COMPLETIONSTATUSKHR = null,
    s3tc: WEBGLCompressedTextureS3tc = null,
    textureAnisotropicFilterExtension: EXTTextureFilterAnisotropic = null,
    timerQuery: EXTDisjointTimerQuery = null
  ): EngineCapabilities = {
    val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], blendMinMax = blendMinMax.asInstanceOf[js.Any], canUseTimestampForTimerQuery = canUseTimestampForTimerQuery.asInstanceOf[js.Any], colorBufferFloat = colorBufferFloat.asInstanceOf[js.Any], depthTextureExtension = depthTextureExtension.asInstanceOf[js.Any], drawBuffersExtension = drawBuffersExtension.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], etc2 = etc2.asInstanceOf[js.Any], fragmentDepthSupported = fragmentDepthSupported.asInstanceOf[js.Any], highPrecisionShaderSupported = highPrecisionShaderSupported.asInstanceOf[js.Any], instancedArrays = instancedArrays.asInstanceOf[js.Any], maxAnisotropy = maxAnisotropy.asInstanceOf[js.Any], maxCombinedTexturesImageUnits = maxCombinedTexturesImageUnits.asInstanceOf[js.Any], maxCubemapTextureSize = maxCubemapTextureSize.asInstanceOf[js.Any], maxFragmentUniformVectors = maxFragmentUniformVectors.asInstanceOf[js.Any], maxMSAASamples = maxMSAASamples.asInstanceOf[js.Any], maxRenderTextureSize = maxRenderTextureSize.asInstanceOf[js.Any], maxTextureSize = maxTextureSize.asInstanceOf[js.Any], maxTexturesImageUnits = maxTexturesImageUnits.asInstanceOf[js.Any], maxVaryingVectors = maxVaryingVectors.asInstanceOf[js.Any], maxVertexAttribs = maxVertexAttribs.asInstanceOf[js.Any], maxVertexTextureImageUnits = maxVertexTextureImageUnits.asInstanceOf[js.Any], maxVertexUniformVectors = maxVertexUniformVectors.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], standardDerivatives = standardDerivatives.asInstanceOf[js.Any], textureFloat = textureFloat.asInstanceOf[js.Any], textureFloatLinearFiltering = textureFloatLinearFiltering.asInstanceOf[js.Any], textureFloatRender = textureFloatRender.asInstanceOf[js.Any], textureHalfFloat = textureHalfFloat.asInstanceOf[js.Any], textureHalfFloatLinearFiltering = textureHalfFloatLinearFiltering.asInstanceOf[js.Any], textureHalfFloatRender = textureHalfFloatRender.asInstanceOf[js.Any], textureLOD = textureLOD.asInstanceOf[js.Any], uintIndices = uintIndices.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSamples)) __obj.updateDynamic("maxSamples")(maxSamples.get.asInstanceOf[js.Any])
    if (multiview != null) __obj.updateDynamic("multiview")(multiview.asInstanceOf[js.Any])
    if (oculusMultiview != null) __obj.updateDynamic("oculusMultiview")(oculusMultiview.asInstanceOf[js.Any])
    if (parallelShaderCompile != null) __obj.updateDynamic("parallelShaderCompile")(parallelShaderCompile.asInstanceOf[js.Any])
    if (s3tc != null) __obj.updateDynamic("s3tc")(s3tc.asInstanceOf[js.Any])
    if (textureAnisotropicFilterExtension != null) __obj.updateDynamic("textureAnisotropicFilterExtension")(textureAnisotropicFilterExtension.asInstanceOf[js.Any])
    if (timerQuery != null) __obj.updateDynamic("timerQuery")(timerQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineCapabilities]
  }
}

