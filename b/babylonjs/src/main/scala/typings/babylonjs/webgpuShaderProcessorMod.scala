package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import typings.babylonjs.shaderLanguageMod.ShaderLanguage
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webgpuShaderProcessingContextMod.WebGPUBufferDescription
import typings.babylonjs.webgpuShaderProcessingContextMod.WebGPUSamplerDescription
import typings.babylonjs.webgpuShaderProcessingContextMod.WebGPUShaderProcessingContext
import typings.babylonjs.webgpuShaderProcessingContextMod.WebGPUTextureDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuShaderProcessorMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor")
  @js.native
  abstract class WebGPUShaderProcessor ()
    extends StObject
       with IShaderProcessor {
    
    /* protected */ def _addBufferBindingDescription(
      name: String,
      uniformBufferInfo: WebGPUBufferDescription,
      bufferType: GPUBufferBindingType,
      isVertex: Boolean
    ): Unit = js.native
    
    /* protected */ def _addSamplerBindingDescription(name: String, samplerInfo: WebGPUSamplerDescription, isVertex: Boolean): Unit = js.native
    
    /* protected */ def _addTextureBindingDescription(
      name: String,
      textureInfo: WebGPUTextureDescription,
      textureIndex: Double,
      dimension: Nullable[GPUTextureViewDimension],
      format: Nullable[GPUTextureFormat],
      isVertex: Boolean
    ): Unit = js.native
    
    /* protected */ def _addUniformToLeftOverUBO(name: String, uniformType: String, preProcessors: StringDictionary[String]): Unit = js.native
    
    /* protected */ def _buildLeftOverUBO(): String = js.native
    
    /* protected */ def _collectBindingNames(): Unit = js.native
    
    /* protected */ def _generateLeftOverUBOCode(name: String, uniformBufferDescription: WebGPUBufferDescription): String = js.native
    
    /* protected */ def _getArraySize(name: String, `type`: String, preProcessors: StringDictionary[String]): js.Tuple3[String, String, Double] = js.native
    
    /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String): String = js.native
    /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: String): String = js.native
    /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: String, endingCode: String): String = js.native
    /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: Unit, endingCode: String): String = js.native
    
    /* protected */ def _preCreateBindGroupEntries(): Unit = js.native
    
    /* protected */ var _webgpuProcessingContext: WebGPUShaderProcessingContext = js.native
    
    /* CompleteClass */
    var shaderLanguage: ShaderLanguage = js.native
  }
  /* static members */
  object WebGPUShaderProcessor {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor.AutoSamplerSuffix")
    @js.native
    val AutoSamplerSuffix: String = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor.InternalsUBOName")
    @js.native
    val InternalsUBOName: String = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor.LeftOvertUBOName")
    @js.native
    val LeftOvertUBOName: String = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor.UniformSizes")
    @js.native
    def UniformSizes: StringDictionary[Double] = js.native
    inline def UniformSizes_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniformSizes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor._GpuTextureViewDimensionByWebGPUTextureType")
    @js.native
    def _GpuTextureViewDimensionByWebGPUTextureType: StringDictionary[GPUTextureViewDimension] = js.native
    inline def _GpuTextureViewDimensionByWebGPUTextureType_=(x: StringDictionary[GPUTextureViewDimension]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GpuTextureViewDimensionByWebGPUTextureType")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor._IsComparisonSamplerByWebGPUSamplerType")
    @js.native
    def _IsComparisonSamplerByWebGPUSamplerType: StringDictionary[Boolean] = js.native
    inline def _IsComparisonSamplerByWebGPUSamplerType_=(x: StringDictionary[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsComparisonSamplerByWebGPUSamplerType")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor._SamplerFunctionByWebGLSamplerType")
    @js.native
    def _SamplerFunctionByWebGLSamplerType: StringDictionary[String] = js.native
    inline def _SamplerFunctionByWebGLSamplerType_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SamplerFunctionByWebGLSamplerType")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor._SamplerTypeByWebGLSamplerType")
    @js.native
    def _SamplerTypeByWebGLSamplerType: StringDictionary[String] = js.native
    inline def _SamplerTypeByWebGLSamplerType_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SamplerTypeByWebGLSamplerType")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessor", "WebGPUShaderProcessor._TextureTypeByWebGLSamplerType")
    @js.native
    def _TextureTypeByWebGLSamplerType: StringDictionary[String] = js.native
    inline def _TextureTypeByWebGLSamplerType_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureTypeByWebGLSamplerType")(x.asInstanceOf[js.Any])
  }
}
