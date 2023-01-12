package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.enginesProcessorsIShaderProcessorMod.IShaderProcessor
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesProcessorsShaderProcessingOptionsMod {
  
  trait ProcessingOptions extends StObject {
    
    var defines: js.Array[String]
    
    var includesShadersStore: StringDictionary[String]
    
    var indexParameters: Any
    
    var isFragment: Boolean
    
    var isNDCHalfZRange: Boolean
    
    var lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.undefined
    
    var platformName: String
    
    var processCodeAfterIncludes: js.UndefOr[ShaderCustomProcessingFunction] = js.undefined
    
    var processingContext: Nullable[ShaderProcessingContext]
    
    var processor: Nullable[IShaderProcessor]
    
    var shadersRepository: String
    
    var shouldUseHighPrecisionShader: Boolean
    
    var supportsUniformBuffers: Boolean
    
    var useReverseDepthBuffer: Boolean
    
    var version: String
  }
  object ProcessingOptions {
    
    inline def apply(
      defines: js.Array[String],
      includesShadersStore: StringDictionary[String],
      indexParameters: Any,
      isFragment: Boolean,
      isNDCHalfZRange: Boolean,
      platformName: String,
      shadersRepository: String,
      shouldUseHighPrecisionShader: Boolean,
      supportsUniformBuffers: Boolean,
      useReverseDepthBuffer: Boolean,
      version: String
    ): ProcessingOptions = {
      val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], includesShadersStore = includesShadersStore.asInstanceOf[js.Any], indexParameters = indexParameters.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], isNDCHalfZRange = isNDCHalfZRange.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], shadersRepository = shadersRepository.asInstanceOf[js.Any], shouldUseHighPrecisionShader = shouldUseHighPrecisionShader.asInstanceOf[js.Any], supportsUniformBuffers = supportsUniformBuffers.asInstanceOf[js.Any], useReverseDepthBuffer = useReverseDepthBuffer.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], processingContext = null, processor = null)
      __obj.asInstanceOf[ProcessingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessingOptions] (val x: Self) extends AnyVal {
      
      inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
      
      inline def setIncludesShadersStore(value: StringDictionary[String]): Self = StObject.set(x, "includesShadersStore", value.asInstanceOf[js.Any])
      
      inline def setIndexParameters(value: Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
      
      inline def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
      
      inline def setIsNDCHalfZRange(value: Boolean): Self = StObject.set(x, "isNDCHalfZRange", value.asInstanceOf[js.Any])
      
      inline def setLookForClosingBracketForUniformBuffer(value: Boolean): Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", value.asInstanceOf[js.Any])
      
      inline def setLookForClosingBracketForUniformBufferUndefined: Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", js.undefined)
      
      inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
      
      inline def setProcessCodeAfterIncludes(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processCodeAfterIncludes", js.Any.fromFunction2(value))
      
      inline def setProcessCodeAfterIncludesUndefined: Self = StObject.set(x, "processCodeAfterIncludes", js.undefined)
      
      inline def setProcessingContext(value: Nullable[ShaderProcessingContext]): Self = StObject.set(x, "processingContext", value.asInstanceOf[js.Any])
      
      inline def setProcessingContextNull: Self = StObject.set(x, "processingContext", null)
      
      inline def setProcessor(value: Nullable[IShaderProcessor]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setProcessorNull: Self = StObject.set(x, "processor", null)
      
      inline def setShadersRepository(value: String): Self = StObject.set(x, "shadersRepository", value.asInstanceOf[js.Any])
      
      inline def setShouldUseHighPrecisionShader(value: Boolean): Self = StObject.set(x, "shouldUseHighPrecisionShader", value.asInstanceOf[js.Any])
      
      inline def setSupportsUniformBuffers(value: Boolean): Self = StObject.set(x, "supportsUniformBuffers", value.asInstanceOf[js.Any])
      
      inline def setUseReverseDepthBuffer(value: Boolean): Self = StObject.set(x, "useReverseDepthBuffer", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type ShaderCustomProcessingFunction = js.Function2[/* shaderType */ String, /* code */ String, String]
  
  trait ShaderProcessingContext extends StObject
}
