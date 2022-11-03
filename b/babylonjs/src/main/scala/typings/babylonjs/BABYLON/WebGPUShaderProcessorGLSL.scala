package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FragmentCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUShaderProcessorGLSL
  extends StObject
     with WebGPUShaderProcessor {
  
  /* private */ var _applyTextureArrayProcessing: Any = js.native
  
  /* protected */ var _fragmentIsGLES3: Boolean = js.native
  
  /* protected */ var _missingVaryings: js.Array[String] = js.native
  
  /* protected */ var _preProcessors: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  /* protected */ var _textureArrayProcessing: js.Array[String] = js.native
  
  /* protected */ var _vertexIsGLES3: Boolean = js.native
  
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGPUShaderProcessorGLSL(attribute: String, preProcessors: org.scalablytyped.runtime.StringDictionary[String]): String = js.native
  
  @JSName("finalizeShaders")
  def finalizeShaders_MWebGPUShaderProcessorGLSL(vertexCode: String, fragmentCode: String): FragmentCode = js.native
  
  @JSName("initializeShaders")
  def initializeShaders_MWebGPUShaderProcessorGLSL(processingContext: Nullable[ShaderProcessingContext]): Unit = js.native
  
  @JSName("parseGLES3")
  var parseGLES3_WebGPUShaderProcessorGLSL: Boolean = js.native
  
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
  def uniformProcessor_MWebGPUShaderProcessorGLSL(
    uniform: String,
    isFragment: Boolean,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): String = js.native
  
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGPUShaderProcessorGLSL(
    varying: String,
    isFragment: Boolean,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): String = js.native
}
