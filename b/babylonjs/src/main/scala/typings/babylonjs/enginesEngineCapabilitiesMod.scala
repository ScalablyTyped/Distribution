package typings.babylonjs

import typings.babylonjs.anon.COMPLETIONSTATUSKHR
import typings.std.EXTTextureFilterAnisotropic
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLCompressedTextureS3tcSrgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesEngineCapabilitiesMod {
  
  trait EngineCapabilities extends StObject {
    
    /** Defines if astc texture compression is supported */
    var astc: Any
    
    /** Defines if the blend min max extension is supported */
    var blendMinMax: Boolean
    
    /** Defines if bptc texture compression is supported */
    var bptc: Any
    
    /** In some iOS + WebGL1, gl_InstanceID (and gl_InstanceIDEXT) is undefined even if instancedArrays is true. So don't use gl_InstanceID in those cases */
    var canUseGLInstanceID: Boolean
    
    /** Defines if gl_vertexID is available */
    var canUseGLVertexID: Boolean
    
    /** Defines if timestamp can be used with timer query */
    var canUseTimestampForTimerQuery: Boolean
    
    /** Defines if float color buffer are supported */
    var colorBufferFloat: Boolean
    
    /** Defines if depth textures are supported */
    var depthTextureExtension: Boolean
    
    /** Defines if draw buffers extension is supported */
    var drawBuffersExtension: Boolean
    
    /** Defines if etc1 texture compression is supported */
    var etc1: Any
    
    /** Defines if etc2 texture compression is supported */
    var etc2: Any
    
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
    var multiview: js.UndefOr[Any] = js.undefined
    
    /** Defines if oculus multiview is supported (https://developer.oculus.com/documentation/oculus-browser/latest/concepts/browser-multiview/) */
    var oculusMultiview: js.UndefOr[Any] = js.undefined
    
    /** Function used to let the system compiles shaders in background */
    var parallelShaderCompile: js.UndefOr[COMPLETIONSTATUSKHR] = js.undefined
    
    /** Defines if pvrtc texture compression is supported */
    var pvrtc: Any
    
    /** Defines if s3tc texture compression is supported */
    var s3tc: js.UndefOr[WEBGLCompressedTextureS3tc] = js.undefined
    
    /** Defines if s3tc sRGB texture compression is supported */
    var s3tc_srgb: js.UndefOr[WEBGLCompressedTextureS3tcSrgb] = js.undefined
    
    /** Defines if standard derivatives (dx/dy) are supported */
    var standardDerivatives: Boolean
    
    /** Defines if compute shaders are supported by the engine */
    var supportComputeShaders: Boolean
    
    /** Defines if occlusion queries are supported by the engine */
    var supportOcclusionQuery: Boolean
    
    /** Defines if sRGB texture formats are supported */
    var supportSRGBBuffers: Boolean
    
    /** Defines if transform feedbacks are supported */
    var supportTransformFeedbacks: Boolean
    
    /** Defines the maximum layer count for a 2D Texture array. */
    var texture2DArrayMaxLayerCount: Double
    
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
    
    /** Defines if texture max level are supported */
    var textureMaxLevel: Boolean
    
    /** Gets disjoint timer query extension (null if not supported) */
    var timerQuery: js.UndefOr[EXTDisjointTimerQuery] = js.undefined
    
    /** Defines if 32 bits indices are supported */
    var uintIndices: Boolean
    
    /** Defines if vertex array objects are supported */
    var vertexArrayObject: Boolean
  }
  object EngineCapabilities {
    
    inline def apply(
      astc: Any,
      blendMinMax: Boolean,
      bptc: Any,
      canUseGLInstanceID: Boolean,
      canUseGLVertexID: Boolean,
      canUseTimestampForTimerQuery: Boolean,
      colorBufferFloat: Boolean,
      depthTextureExtension: Boolean,
      drawBuffersExtension: Boolean,
      etc1: Any,
      etc2: Any,
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
      pvrtc: Any,
      standardDerivatives: Boolean,
      supportComputeShaders: Boolean,
      supportOcclusionQuery: Boolean,
      supportSRGBBuffers: Boolean,
      supportTransformFeedbacks: Boolean,
      texture2DArrayMaxLayerCount: Double,
      textureFloat: Boolean,
      textureFloatLinearFiltering: Boolean,
      textureFloatRender: Boolean,
      textureHalfFloat: Boolean,
      textureHalfFloatLinearFiltering: Boolean,
      textureHalfFloatRender: Boolean,
      textureLOD: Boolean,
      textureMaxLevel: Boolean,
      uintIndices: Boolean,
      vertexArrayObject: Boolean
    ): EngineCapabilities = {
      val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], blendMinMax = blendMinMax.asInstanceOf[js.Any], bptc = bptc.asInstanceOf[js.Any], canUseGLInstanceID = canUseGLInstanceID.asInstanceOf[js.Any], canUseGLVertexID = canUseGLVertexID.asInstanceOf[js.Any], canUseTimestampForTimerQuery = canUseTimestampForTimerQuery.asInstanceOf[js.Any], colorBufferFloat = colorBufferFloat.asInstanceOf[js.Any], depthTextureExtension = depthTextureExtension.asInstanceOf[js.Any], drawBuffersExtension = drawBuffersExtension.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], etc2 = etc2.asInstanceOf[js.Any], fragmentDepthSupported = fragmentDepthSupported.asInstanceOf[js.Any], highPrecisionShaderSupported = highPrecisionShaderSupported.asInstanceOf[js.Any], instancedArrays = instancedArrays.asInstanceOf[js.Any], maxAnisotropy = maxAnisotropy.asInstanceOf[js.Any], maxCombinedTexturesImageUnits = maxCombinedTexturesImageUnits.asInstanceOf[js.Any], maxCubemapTextureSize = maxCubemapTextureSize.asInstanceOf[js.Any], maxFragmentUniformVectors = maxFragmentUniformVectors.asInstanceOf[js.Any], maxMSAASamples = maxMSAASamples.asInstanceOf[js.Any], maxRenderTextureSize = maxRenderTextureSize.asInstanceOf[js.Any], maxTextureSize = maxTextureSize.asInstanceOf[js.Any], maxTexturesImageUnits = maxTexturesImageUnits.asInstanceOf[js.Any], maxVaryingVectors = maxVaryingVectors.asInstanceOf[js.Any], maxVertexAttribs = maxVertexAttribs.asInstanceOf[js.Any], maxVertexTextureImageUnits = maxVertexTextureImageUnits.asInstanceOf[js.Any], maxVertexUniformVectors = maxVertexUniformVectors.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], standardDerivatives = standardDerivatives.asInstanceOf[js.Any], supportComputeShaders = supportComputeShaders.asInstanceOf[js.Any], supportOcclusionQuery = supportOcclusionQuery.asInstanceOf[js.Any], supportSRGBBuffers = supportSRGBBuffers.asInstanceOf[js.Any], supportTransformFeedbacks = supportTransformFeedbacks.asInstanceOf[js.Any], texture2DArrayMaxLayerCount = texture2DArrayMaxLayerCount.asInstanceOf[js.Any], textureFloat = textureFloat.asInstanceOf[js.Any], textureFloatLinearFiltering = textureFloatLinearFiltering.asInstanceOf[js.Any], textureFloatRender = textureFloatRender.asInstanceOf[js.Any], textureHalfFloat = textureHalfFloat.asInstanceOf[js.Any], textureHalfFloatLinearFiltering = textureHalfFloatLinearFiltering.asInstanceOf[js.Any], textureHalfFloatRender = textureHalfFloatRender.asInstanceOf[js.Any], textureLOD = textureLOD.asInstanceOf[js.Any], textureMaxLevel = textureMaxLevel.asInstanceOf[js.Any], uintIndices = uintIndices.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineCapabilities]
    }
    
    extension [Self <: EngineCapabilities](x: Self) {
      
      inline def setAstc(value: Any): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
      
      inline def setBlendMinMax(value: Boolean): Self = StObject.set(x, "blendMinMax", value.asInstanceOf[js.Any])
      
      inline def setBptc(value: Any): Self = StObject.set(x, "bptc", value.asInstanceOf[js.Any])
      
      inline def setCanUseGLInstanceID(value: Boolean): Self = StObject.set(x, "canUseGLInstanceID", value.asInstanceOf[js.Any])
      
      inline def setCanUseGLVertexID(value: Boolean): Self = StObject.set(x, "canUseGLVertexID", value.asInstanceOf[js.Any])
      
      inline def setCanUseTimestampForTimerQuery(value: Boolean): Self = StObject.set(x, "canUseTimestampForTimerQuery", value.asInstanceOf[js.Any])
      
      inline def setColorBufferFloat(value: Boolean): Self = StObject.set(x, "colorBufferFloat", value.asInstanceOf[js.Any])
      
      inline def setDepthTextureExtension(value: Boolean): Self = StObject.set(x, "depthTextureExtension", value.asInstanceOf[js.Any])
      
      inline def setDrawBuffersExtension(value: Boolean): Self = StObject.set(x, "drawBuffersExtension", value.asInstanceOf[js.Any])
      
      inline def setEtc1(value: Any): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
      
      inline def setEtc2(value: Any): Self = StObject.set(x, "etc2", value.asInstanceOf[js.Any])
      
      inline def setFragmentDepthSupported(value: Boolean): Self = StObject.set(x, "fragmentDepthSupported", value.asInstanceOf[js.Any])
      
      inline def setHighPrecisionShaderSupported(value: Boolean): Self = StObject.set(x, "highPrecisionShaderSupported", value.asInstanceOf[js.Any])
      
      inline def setInstancedArrays(value: Boolean): Self = StObject.set(x, "instancedArrays", value.asInstanceOf[js.Any])
      
      inline def setMaxAnisotropy(value: Double): Self = StObject.set(x, "maxAnisotropy", value.asInstanceOf[js.Any])
      
      inline def setMaxCombinedTexturesImageUnits(value: Double): Self = StObject.set(x, "maxCombinedTexturesImageUnits", value.asInstanceOf[js.Any])
      
      inline def setMaxCubemapTextureSize(value: Double): Self = StObject.set(x, "maxCubemapTextureSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFragmentUniformVectors(value: Double): Self = StObject.set(x, "maxFragmentUniformVectors", value.asInstanceOf[js.Any])
      
      inline def setMaxMSAASamples(value: Double): Self = StObject.set(x, "maxMSAASamples", value.asInstanceOf[js.Any])
      
      inline def setMaxRenderTextureSize(value: Double): Self = StObject.set(x, "maxRenderTextureSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSamples(value: Double): Self = StObject.set(x, "maxSamples", value.asInstanceOf[js.Any])
      
      inline def setMaxSamplesUndefined: Self = StObject.set(x, "maxSamples", js.undefined)
      
      inline def setMaxTextureSize(value: Double): Self = StObject.set(x, "maxTextureSize", value.asInstanceOf[js.Any])
      
      inline def setMaxTexturesImageUnits(value: Double): Self = StObject.set(x, "maxTexturesImageUnits", value.asInstanceOf[js.Any])
      
      inline def setMaxVaryingVectors(value: Double): Self = StObject.set(x, "maxVaryingVectors", value.asInstanceOf[js.Any])
      
      inline def setMaxVertexAttribs(value: Double): Self = StObject.set(x, "maxVertexAttribs", value.asInstanceOf[js.Any])
      
      inline def setMaxVertexTextureImageUnits(value: Double): Self = StObject.set(x, "maxVertexTextureImageUnits", value.asInstanceOf[js.Any])
      
      inline def setMaxVertexUniformVectors(value: Double): Self = StObject.set(x, "maxVertexUniformVectors", value.asInstanceOf[js.Any])
      
      inline def setMultiview(value: Any): Self = StObject.set(x, "multiview", value.asInstanceOf[js.Any])
      
      inline def setMultiviewUndefined: Self = StObject.set(x, "multiview", js.undefined)
      
      inline def setOculusMultiview(value: Any): Self = StObject.set(x, "oculusMultiview", value.asInstanceOf[js.Any])
      
      inline def setOculusMultiviewUndefined: Self = StObject.set(x, "oculusMultiview", js.undefined)
      
      inline def setParallelShaderCompile(value: COMPLETIONSTATUSKHR): Self = StObject.set(x, "parallelShaderCompile", value.asInstanceOf[js.Any])
      
      inline def setParallelShaderCompileUndefined: Self = StObject.set(x, "parallelShaderCompile", js.undefined)
      
      inline def setPvrtc(value: Any): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
      
      inline def setS3tc(value: WEBGLCompressedTextureS3tc): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
      
      inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
      
      inline def setS3tc_srgb(value: WEBGLCompressedTextureS3tcSrgb): Self = StObject.set(x, "s3tc_srgb", value.asInstanceOf[js.Any])
      
      inline def setS3tc_srgbUndefined: Self = StObject.set(x, "s3tc_srgb", js.undefined)
      
      inline def setStandardDerivatives(value: Boolean): Self = StObject.set(x, "standardDerivatives", value.asInstanceOf[js.Any])
      
      inline def setSupportComputeShaders(value: Boolean): Self = StObject.set(x, "supportComputeShaders", value.asInstanceOf[js.Any])
      
      inline def setSupportOcclusionQuery(value: Boolean): Self = StObject.set(x, "supportOcclusionQuery", value.asInstanceOf[js.Any])
      
      inline def setSupportSRGBBuffers(value: Boolean): Self = StObject.set(x, "supportSRGBBuffers", value.asInstanceOf[js.Any])
      
      inline def setSupportTransformFeedbacks(value: Boolean): Self = StObject.set(x, "supportTransformFeedbacks", value.asInstanceOf[js.Any])
      
      inline def setTexture2DArrayMaxLayerCount(value: Double): Self = StObject.set(x, "texture2DArrayMaxLayerCount", value.asInstanceOf[js.Any])
      
      inline def setTextureAnisotropicFilterExtension(value: EXTTextureFilterAnisotropic): Self = StObject.set(x, "textureAnisotropicFilterExtension", value.asInstanceOf[js.Any])
      
      inline def setTextureAnisotropicFilterExtensionUndefined: Self = StObject.set(x, "textureAnisotropicFilterExtension", js.undefined)
      
      inline def setTextureFloat(value: Boolean): Self = StObject.set(x, "textureFloat", value.asInstanceOf[js.Any])
      
      inline def setTextureFloatLinearFiltering(value: Boolean): Self = StObject.set(x, "textureFloatLinearFiltering", value.asInstanceOf[js.Any])
      
      inline def setTextureFloatRender(value: Boolean): Self = StObject.set(x, "textureFloatRender", value.asInstanceOf[js.Any])
      
      inline def setTextureHalfFloat(value: Boolean): Self = StObject.set(x, "textureHalfFloat", value.asInstanceOf[js.Any])
      
      inline def setTextureHalfFloatLinearFiltering(value: Boolean): Self = StObject.set(x, "textureHalfFloatLinearFiltering", value.asInstanceOf[js.Any])
      
      inline def setTextureHalfFloatRender(value: Boolean): Self = StObject.set(x, "textureHalfFloatRender", value.asInstanceOf[js.Any])
      
      inline def setTextureLOD(value: Boolean): Self = StObject.set(x, "textureLOD", value.asInstanceOf[js.Any])
      
      inline def setTextureMaxLevel(value: Boolean): Self = StObject.set(x, "textureMaxLevel", value.asInstanceOf[js.Any])
      
      inline def setTimerQuery(value: EXTDisjointTimerQuery): Self = StObject.set(x, "timerQuery", value.asInstanceOf[js.Any])
      
      inline def setTimerQueryUndefined: Self = StObject.set(x, "timerQuery", js.undefined)
      
      inline def setUintIndices(value: Boolean): Self = StObject.set(x, "uintIndices", value.asInstanceOf[js.Any])
      
      inline def setVertexArrayObject(value: Boolean): Self = StObject.set(x, "vertexArrayObject", value.asInstanceOf[js.Any])
    }
  }
}
