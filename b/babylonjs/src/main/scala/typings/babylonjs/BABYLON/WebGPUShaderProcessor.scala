package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBufferBindingType
import typings.babylonjs.GPUTextureFormat
import typings.babylonjs.GPUTextureViewDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUShaderProcessor
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
  
  /* protected */ def _addUniformToLeftOverUBO(
    name: String,
    uniformType: String,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): Unit = js.native
  
  /* protected */ def _buildLeftOverUBO(): String = js.native
  
  /* protected */ def _collectBindingNames(): Unit = js.native
  
  /* protected */ def _generateLeftOverUBOCode(name: String, uniformBufferDescription: WebGPUBufferDescription): String = js.native
  
  /* protected */ def _getArraySize(name: String, `type`: String, preProcessors: org.scalablytyped.runtime.StringDictionary[String]): js.Tuple3[String, String, Double] = js.native
  
  /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String): String = js.native
  /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: String): String = js.native
  /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: String, endingCode: String): String = js.native
  /* protected */ def _injectStartingAndEndingCode(code: String, mainFuncDecl: String, startingCode: Unit, endingCode: String): String = js.native
  
  /* protected */ def _preCreateBindGroupEntries(): Unit = js.native
  
  /* protected */ var _webgpuProcessingContext: WebGPUShaderProcessingContext = js.native
}
