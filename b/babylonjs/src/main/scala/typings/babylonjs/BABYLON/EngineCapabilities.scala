package typings.babylonjs.BABYLON

import typings.babylonjs.EXTDisjointTimerQuery
import typings.babylonjs.anon.COMPLETIONSTATUSKHR
import typings.std.EXTTextureFilterAnisotropic
import typings.std.WEBGLCompressedTextureS3tc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineCapabilities extends StObject {
  
  /** Defines if astc texture compression is supported */
  var astc: js.Any = js.native
  
  /** Defines if the blend min max extension is supported */
  var blendMinMax: Boolean = js.native
  
  /** Defines if bptc texture compression is supported */
  var bptc: js.Any = js.native
  
  /** Defines if timestamp can be used with timer query */
  var canUseTimestampForTimerQuery: Boolean = js.native
  
  /** Defines if float color buffer are supported */
  var colorBufferFloat: Boolean = js.native
  
  /** Defines if depth textures are supported */
  var depthTextureExtension: Boolean = js.native
  
  /** Defines if draw buffers extension is supported */
  var drawBuffersExtension: Boolean = js.native
  
  /** Defines if etc1 texture compression is supported */
  var etc1: js.Any = js.native
  
  /** Defines if etc2 texture compression is supported */
  var etc2: js.Any = js.native
  
  /** Defines if depth reading in the fragment shader is supported */
  var fragmentDepthSupported: Boolean = js.native
  
  /** Defines if high precision shaders are supported */
  var highPrecisionShaderSupported: Boolean = js.native
  
  /** Defines if instancing is supported */
  var instancedArrays: Boolean = js.native
  
  /** Gets the maximum level of anisotropy supported */
  var maxAnisotropy: Double = js.native
  
  /** Maximum textures units in the entire pipeline */
  var maxCombinedTexturesImageUnits: Double = js.native
  
  /** Maximum cube texture size */
  var maxCubemapTextureSize: Double = js.native
  
  /** Maximum number of uniforms per fragment shader */
  var maxFragmentUniformVectors: Double = js.native
  
  /** Max number of texture samples for MSAA */
  var maxMSAASamples: Double = js.native
  
  /** Maximum render texture size */
  var maxRenderTextureSize: Double = js.native
  
  /** Maximum texture samples */
  var maxSamples: js.UndefOr[Double] = js.native
  
  /** Maximum texture size */
  var maxTextureSize: Double = js.native
  
  /** Maximum textures units per fragment shader */
  var maxTexturesImageUnits: Double = js.native
  
  /** Maximum number of varyings */
  var maxVaryingVectors: Double = js.native
  
  /** Maximum number of vertex attributes */
  var maxVertexAttribs: Double = js.native
  
  /** Maximum texture units per vertex shader */
  var maxVertexTextureImageUnits: Double = js.native
  
  /** Maximum number of uniforms per vertex shader */
  var maxVertexUniformVectors: Double = js.native
  
  /** Defines if multiview is supported (https://www.khronos.org/registry/webgl/extensions/WEBGL_multiview/) */
  var multiview: js.UndefOr[js.Any] = js.native
  
  /** Defines if oculus multiview is supported (https://developer.oculus.com/documentation/oculus-browser/latest/concepts/browser-multiview/) */
  var oculusMultiview: js.UndefOr[js.Any] = js.native
  
  /** Function used to let the system compiles shaders in background */
  var parallelShaderCompile: js.UndefOr[COMPLETIONSTATUSKHR] = js.native
  
  /** Defines if pvrtc texture compression is supported */
  var pvrtc: js.Any = js.native
  
  /** Defines if s3tc texture compression is supported */
  var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.native
  
  /** Defines if standard derivates (dx/dy) are supported */
  var standardDerivatives: Boolean = js.native
  
  /** Gets the webgl extension for anisotropic filtering (null if not supported) */
  var textureAnisotropicFilterExtension: js.UndefOr[EXTTextureFilterAnisotropic] = js.native
  
  /** Defines if float textures are supported */
  var textureFloat: Boolean = js.native
  
  /** Defines if float texture linear filtering is supported*/
  var textureFloatLinearFiltering: Boolean = js.native
  
  /** Defines if rendering to float textures is supported */
  var textureFloatRender: Boolean = js.native
  
  /** Defines if half float textures are supported*/
  var textureHalfFloat: Boolean = js.native
  
  /** Defines if half float texture linear filtering is supported*/
  var textureHalfFloatLinearFiltering: Boolean = js.native
  
  /** Defines if rendering to half float textures is supported */
  var textureHalfFloatRender: Boolean = js.native
  
  /** Defines if textureLOD shader command is supported */
  var textureLOD: Boolean = js.native
  
  /** Gets disjoint timer query extension (null if not supported) */
  var timerQuery: js.UndefOr[EXTDisjointTimerQuery] = js.native
  
  /** Defines if 32 bits indices are supported */
  var uintIndices: Boolean = js.native
  
  /** Defines if vertex array objects are supported */
  var vertexArrayObject: Boolean = js.native
}
object EngineCapabilities {
  
  @scala.inline
  def apply(
    astc: js.Any,
    blendMinMax: Boolean,
    bptc: js.Any,
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
    vertexArrayObject: Boolean
  ): EngineCapabilities = {
    val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], blendMinMax = blendMinMax.asInstanceOf[js.Any], bptc = bptc.asInstanceOf[js.Any], canUseTimestampForTimerQuery = canUseTimestampForTimerQuery.asInstanceOf[js.Any], colorBufferFloat = colorBufferFloat.asInstanceOf[js.Any], depthTextureExtension = depthTextureExtension.asInstanceOf[js.Any], drawBuffersExtension = drawBuffersExtension.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], etc2 = etc2.asInstanceOf[js.Any], fragmentDepthSupported = fragmentDepthSupported.asInstanceOf[js.Any], highPrecisionShaderSupported = highPrecisionShaderSupported.asInstanceOf[js.Any], instancedArrays = instancedArrays.asInstanceOf[js.Any], maxAnisotropy = maxAnisotropy.asInstanceOf[js.Any], maxCombinedTexturesImageUnits = maxCombinedTexturesImageUnits.asInstanceOf[js.Any], maxCubemapTextureSize = maxCubemapTextureSize.asInstanceOf[js.Any], maxFragmentUniformVectors = maxFragmentUniformVectors.asInstanceOf[js.Any], maxMSAASamples = maxMSAASamples.asInstanceOf[js.Any], maxRenderTextureSize = maxRenderTextureSize.asInstanceOf[js.Any], maxTextureSize = maxTextureSize.asInstanceOf[js.Any], maxTexturesImageUnits = maxTexturesImageUnits.asInstanceOf[js.Any], maxVaryingVectors = maxVaryingVectors.asInstanceOf[js.Any], maxVertexAttribs = maxVertexAttribs.asInstanceOf[js.Any], maxVertexTextureImageUnits = maxVertexTextureImageUnits.asInstanceOf[js.Any], maxVertexUniformVectors = maxVertexUniformVectors.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], standardDerivatives = standardDerivatives.asInstanceOf[js.Any], textureFloat = textureFloat.asInstanceOf[js.Any], textureFloatLinearFiltering = textureFloatLinearFiltering.asInstanceOf[js.Any], textureFloatRender = textureFloatRender.asInstanceOf[js.Any], textureHalfFloat = textureHalfFloat.asInstanceOf[js.Any], textureHalfFloatLinearFiltering = textureHalfFloatLinearFiltering.asInstanceOf[js.Any], textureHalfFloatRender = textureHalfFloatRender.asInstanceOf[js.Any], textureLOD = textureLOD.asInstanceOf[js.Any], uintIndices = uintIndices.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineCapabilities]
  }
  
  @scala.inline
  implicit class EngineCapabilitiesMutableBuilder[Self <: EngineCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAstc(value: js.Any): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMinMax(value: Boolean): Self = StObject.set(x, "blendMinMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBptc(value: js.Any): Self = StObject.set(x, "bptc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseTimestampForTimerQuery(value: Boolean): Self = StObject.set(x, "canUseTimestampForTimerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBufferFloat(value: Boolean): Self = StObject.set(x, "colorBufferFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthTextureExtension(value: Boolean): Self = StObject.set(x, "depthTextureExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBuffersExtension(value: Boolean): Self = StObject.set(x, "drawBuffersExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtc1(value: js.Any): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtc2(value: js.Any): Self = StObject.set(x, "etc2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentDepthSupported(value: Boolean): Self = StObject.set(x, "fragmentDepthSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighPrecisionShaderSupported(value: Boolean): Self = StObject.set(x, "highPrecisionShaderSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancedArrays(value: Boolean): Self = StObject.set(x, "instancedArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAnisotropy(value: Double): Self = StObject.set(x, "maxAnisotropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCombinedTexturesImageUnits(value: Double): Self = StObject.set(x, "maxCombinedTexturesImageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCubemapTextureSize(value: Double): Self = StObject.set(x, "maxCubemapTextureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFragmentUniformVectors(value: Double): Self = StObject.set(x, "maxFragmentUniformVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMSAASamples(value: Double): Self = StObject.set(x, "maxMSAASamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRenderTextureSize(value: Double): Self = StObject.set(x, "maxRenderTextureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSamples(value: Double): Self = StObject.set(x, "maxSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSamplesUndefined: Self = StObject.set(x, "maxSamples", js.undefined)
    
    @scala.inline
    def setMaxTextureSize(value: Double): Self = StObject.set(x, "maxTextureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTexturesImageUnits(value: Double): Self = StObject.set(x, "maxTexturesImageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVaryingVectors(value: Double): Self = StObject.set(x, "maxVaryingVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVertexAttribs(value: Double): Self = StObject.set(x, "maxVertexAttribs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVertexTextureImageUnits(value: Double): Self = StObject.set(x, "maxVertexTextureImageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVertexUniformVectors(value: Double): Self = StObject.set(x, "maxVertexUniformVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiview(value: js.Any): Self = StObject.set(x, "multiview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiviewUndefined: Self = StObject.set(x, "multiview", js.undefined)
    
    @scala.inline
    def setOculusMultiview(value: js.Any): Self = StObject.set(x, "oculusMultiview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOculusMultiviewUndefined: Self = StObject.set(x, "oculusMultiview", js.undefined)
    
    @scala.inline
    def setParallelShaderCompile(value: COMPLETIONSTATUSKHR): Self = StObject.set(x, "parallelShaderCompile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelShaderCompileUndefined: Self = StObject.set(x, "parallelShaderCompile", js.undefined)
    
    @scala.inline
    def setPvrtc(value: js.Any): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3tc(value: WEBGLCompressedTextureS3tc): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
    
    @scala.inline
    def setStandardDerivatives(value: Boolean): Self = StObject.set(x, "standardDerivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureAnisotropicFilterExtension(value: EXTTextureFilterAnisotropic): Self = StObject.set(x, "textureAnisotropicFilterExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureAnisotropicFilterExtensionUndefined: Self = StObject.set(x, "textureAnisotropicFilterExtension", js.undefined)
    
    @scala.inline
    def setTextureFloat(value: Boolean): Self = StObject.set(x, "textureFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFloatLinearFiltering(value: Boolean): Self = StObject.set(x, "textureFloatLinearFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureFloatRender(value: Boolean): Self = StObject.set(x, "textureFloatRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureHalfFloat(value: Boolean): Self = StObject.set(x, "textureHalfFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureHalfFloatLinearFiltering(value: Boolean): Self = StObject.set(x, "textureHalfFloatLinearFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureHalfFloatRender(value: Boolean): Self = StObject.set(x, "textureHalfFloatRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureLOD(value: Boolean): Self = StObject.set(x, "textureLOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerQuery(value: EXTDisjointTimerQuery): Self = StObject.set(x, "timerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerQueryUndefined: Self = StObject.set(x, "timerQuery", js.undefined)
    
    @scala.inline
    def setUintIndices(value: Boolean): Self = StObject.set(x, "uintIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexArrayObject(value: Boolean): Self = StObject.set(x, "vertexArrayObject", value.asInstanceOf[js.Any])
  }
}
