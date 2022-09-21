package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.FragmentCode
import typings.babylonjs.shaderProcessingOptionsMod.ShaderProcessingContext
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webgpuShaderProcessorMod.WebGPUShaderProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuShaderProcessorsGLSLMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessorsGLSL", "WebGPUShaderProcessorGLSL")
  @js.native
  open class WebGPUShaderProcessorGLSL () extends WebGPUShaderProcessor {
    
    /* private */ var _applyTextureArrayProcessing: Any = js.native
    
    /* protected */ var _missingVaryings: js.Array[String] = js.native
    
    /* protected */ var _preProcessors: StringDictionary[String] = js.native
    
    /* protected */ var _textureArrayProcessing: js.Array[String] = js.native
    
    @JSName("attributeProcessor")
    def attributeProcessor_MWebGPUShaderProcessorGLSL(attribute: String, preProcessors: StringDictionary[String]): String = js.native
    
    @JSName("finalizeShaders")
    def finalizeShaders_MWebGPUShaderProcessorGLSL(vertexCode: String, fragmentCode: String): FragmentCode = js.native
    
    @JSName("initializeShaders")
    def initializeShaders_MWebGPUShaderProcessorGLSL(processingContext: Nullable[ShaderProcessingContext]): Unit = js.native
    
    @JSName("postProcessor")
    def postProcessor_MWebGPUShaderProcessorGLSL(
      code: String,
      defines: js.Array[String],
      isFragment: Boolean,
      processingContext: Nullable[ShaderProcessingContext],
      engine: ThinEngine
    ): String = js.native
    
    @JSName("preProcessShaderCode")
    def preProcessShaderCode_MWebGPUShaderProcessorGLSL(code: String, isFragment: Boolean): String = js.native
    
    @JSName("uniformBufferProcessor")
    def uniformBufferProcessor_MWebGPUShaderProcessorGLSL(uniformBuffer: String, isFragment: Boolean): String = js.native
    
    @JSName("uniformProcessor")
    def uniformProcessor_MWebGPUShaderProcessorGLSL(uniform: String, isFragment: Boolean, preProcessors: StringDictionary[String]): String = js.native
    
    @JSName("varyingProcessor")
    def varyingProcessor_MWebGPUShaderProcessorGLSL(varying: String, isFragment: Boolean, preProcessors: StringDictionary[String]): String = js.native
  }
}
