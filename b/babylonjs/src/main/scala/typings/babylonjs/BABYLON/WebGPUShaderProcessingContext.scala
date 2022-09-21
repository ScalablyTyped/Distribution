package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroupEntry
import typings.babylonjs.GPUBindGroupLayoutEntry
import typings.babylonjs.anon.BindingIndex
import typings.babylonjs.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUShaderProcessingContext
  extends StObject
     with ShaderProcessingContext {
  
  /* private */ var _attributeNextLocation: Any = js.native
  
  /* private */ var _findStartingGroupBinding: Any = js.native
  
  /* private */ var _getNextFreeBinding: Any = js.native
  
  /* private */ var _varyingNextLocation: Any = js.native
  
  var attributeLocationsFromEffect: js.Array[Double] = js.native
  
  var attributeNamesFromEffect: js.Array[String] = js.native
  
  var availableAttributes: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
  var availableBuffers: org.scalablytyped.runtime.StringDictionary[WebGPUBufferDescription] = js.native
  
  var availableSamplers: org.scalablytyped.runtime.StringDictionary[WebGPUSamplerDescription] = js.native
  
  var availableTextures: org.scalablytyped.runtime.StringDictionary[WebGPUTextureDescription] = js.native
  
  var availableVaryings: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
  var bindGroupEntries: js.Array[js.Array[GPUBindGroupEntry]] = js.native
  
  var bindGroupLayoutEntries: js.Array[js.Array[GPUBindGroupLayoutEntry]] = js.native
  
  var bindGroupLayoutEntryInfo: js.Array[js.Array[WebGPUBindGroupLayoutEntryInfo]] = js.native
  
  var bufferNames: js.Array[String] = js.native
  
  var freeBindingIndex: Double = js.native
  
  var freeGroupIndex: Double = js.native
  
  def getAttributeNextLocation(dataType: String): Double = js.native
  def getAttributeNextLocation(dataType: String, arrayLength: Double): Double = js.native
  
  def getNextFreeUBOBinding(): BindingIndex = js.native
  
  def getVaryingNextLocation(dataType: String): Double = js.native
  def getVaryingNextLocation(dataType: String, arrayLength: Double): Double = js.native
  
  var leftOverUniforms: js.Array[Length] = js.native
  
  var orderedAttributes: js.Array[String] = js.native
  
  var samplerNames: js.Array[String] = js.native
  
  var shaderLanguage: ShaderLanguage = js.native
  
  var textureNames: js.Array[String] = js.native
  
  var uboNextBindingIndex: Double = js.native
}
