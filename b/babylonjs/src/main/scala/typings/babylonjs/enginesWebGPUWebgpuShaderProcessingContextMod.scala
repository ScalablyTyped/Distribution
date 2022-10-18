package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.BindingIndex
import typings.babylonjs.anon.Length
import typings.babylonjs.enginesProcessorsShaderProcessingOptionsMod.ShaderProcessingContext
import typings.babylonjs.materialsShaderLanguageMod.ShaderLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuShaderProcessingContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessingContext", "WebGPUShaderProcessingContext")
  @js.native
  open class WebGPUShaderProcessingContext protected ()
    extends StObject
       with ShaderProcessingContext {
    def this(shaderLanguage: ShaderLanguage) = this()
    
    /* private */ var _attributeNextLocation: Any = js.native
    
    /* private */ var _findStartingGroupBinding: Any = js.native
    
    /* private */ var _getNextFreeBinding: Any = js.native
    
    /* private */ var _varyingNextLocation: Any = js.native
    
    var attributeLocationsFromEffect: js.Array[Double] = js.native
    
    var attributeNamesFromEffect: js.Array[String] = js.native
    
    var availableAttributes: StringDictionary[Double] = js.native
    
    var availableBuffers: StringDictionary[WebGPUBufferDescription] = js.native
    
    var availableSamplers: StringDictionary[WebGPUSamplerDescription] = js.native
    
    var availableTextures: StringDictionary[WebGPUTextureDescription] = js.native
    
    var availableVaryings: StringDictionary[Double] = js.native
    
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
  /* static members */
  object WebGPUShaderProcessingContext {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessingContext", "WebGPUShaderProcessingContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessingContext", "WebGPUShaderProcessingContext._KnownUBOs")
    @js.native
    def _KnownUBOs: StringDictionary[WebGPUBufferDescription] = js.native
    inline def _KnownUBOs_=(x: StringDictionary[WebGPUBufferDescription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KnownUBOs")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessingContext", "WebGPUShaderProcessingContext._SimplifiedKnownBindings")
    @js.native
    def _SimplifiedKnownBindings: Boolean = js.native
    inline def _SimplifiedKnownBindings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifiedKnownBindings")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuShaderProcessingContext", "WebGPUShaderProcessingContext._SimplifiedKnownUBOs")
    @js.native
    def _SimplifiedKnownUBOs: StringDictionary[WebGPUBufferDescription] = js.native
    inline def _SimplifiedKnownUBOs_=(x: StringDictionary[WebGPUBufferDescription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifiedKnownUBOs")(x.asInstanceOf[js.Any])
  }
  
  trait WebGPUBindGroupLayoutEntryInfo extends StObject {
    
    var index: Double
    
    var name: String
    
    var nameInArrayOfTexture: js.UndefOr[String] = js.undefined
  }
  object WebGPUBindGroupLayoutEntryInfo {
    
    inline def apply(index: Double, name: String): WebGPUBindGroupLayoutEntryInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGPUBindGroupLayoutEntryInfo]
    }
    
    extension [Self <: WebGPUBindGroupLayoutEntryInfo](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameInArrayOfTexture(value: String): Self = StObject.set(x, "nameInArrayOfTexture", value.asInstanceOf[js.Any])
      
      inline def setNameInArrayOfTextureUndefined: Self = StObject.set(x, "nameInArrayOfTexture", js.undefined)
    }
  }
  
  trait WebGPUBindingInfo extends StObject {
    
    var bindingIndex: Double
    
    var groupIndex: Double
  }
  object WebGPUBindingInfo {
    
    inline def apply(bindingIndex: Double, groupIndex: Double): WebGPUBindingInfo = {
      val __obj = js.Dynamic.literal(bindingIndex = bindingIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGPUBindingInfo]
    }
    
    extension [Self <: WebGPUBindingInfo](x: Self) {
      
      inline def setBindingIndex(value: Double): Self = StObject.set(x, "bindingIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGPUBufferDescription extends StObject {
    
    var binding: WebGPUBindingInfo
  }
  object WebGPUBufferDescription {
    
    inline def apply(binding: WebGPUBindingInfo): WebGPUBufferDescription = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGPUBufferDescription]
    }
    
    extension [Self <: WebGPUBufferDescription](x: Self) {
      
      inline def setBinding(value: WebGPUBindingInfo): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGPUSamplerDescription extends StObject {
    
    var binding: WebGPUBindingInfo
    
    var `type`: GPUSamplerBindingType
  }
  object WebGPUSamplerDescription {
    
    inline def apply(binding: WebGPUBindingInfo, `type`: GPUSamplerBindingType): WebGPUSamplerDescription = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGPUSamplerDescription]
    }
    
    extension [Self <: WebGPUSamplerDescription](x: Self) {
      
      inline def setBinding(value: WebGPUBindingInfo): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setType(value: GPUSamplerBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGPUTextureDescription extends StObject {
    
    var autoBindSampler: js.UndefOr[Boolean] = js.undefined
    
    var isStorageTexture: Boolean
    
    var isTextureArray: Boolean
    
    var sampleType: js.UndefOr[GPUTextureSampleType] = js.undefined
    
    var textures: js.Array[WebGPUBindingInfo]
  }
  object WebGPUTextureDescription {
    
    inline def apply(isStorageTexture: Boolean, isTextureArray: Boolean, textures: js.Array[WebGPUBindingInfo]): WebGPUTextureDescription = {
      val __obj = js.Dynamic.literal(isStorageTexture = isStorageTexture.asInstanceOf[js.Any], isTextureArray = isTextureArray.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGPUTextureDescription]
    }
    
    extension [Self <: WebGPUTextureDescription](x: Self) {
      
      inline def setAutoBindSampler(value: Boolean): Self = StObject.set(x, "autoBindSampler", value.asInstanceOf[js.Any])
      
      inline def setAutoBindSamplerUndefined: Self = StObject.set(x, "autoBindSampler", js.undefined)
      
      inline def setIsStorageTexture(value: Boolean): Self = StObject.set(x, "isStorageTexture", value.asInstanceOf[js.Any])
      
      inline def setIsTextureArray(value: Boolean): Self = StObject.set(x, "isTextureArray", value.asInstanceOf[js.Any])
      
      inline def setSampleType(value: GPUTextureSampleType): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
      
      inline def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
      
      inline def setTextures(value: js.Array[WebGPUBindingInfo]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
      
      inline def setTexturesVarargs(value: WebGPUBindingInfo*): Self = StObject.set(x, "textures", js.Array(value*))
    }
  }
}
