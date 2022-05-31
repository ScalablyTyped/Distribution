package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderProcessingOptionsMod {
  
  trait ProcessingOptions extends StObject {
    
    var defines: js.Array[String]
    
    var includesShadersStore: StringDictionary[String]
    
    var indexParameters: js.Any
    
    var isFragment: Boolean
    
    var lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.undefined
    
    var platformName: String
    
    var processor: js.UndefOr[IShaderProcessor] = js.undefined
    
    var shadersRepository: String
    
    var shouldUseHighPrecisionShader: Boolean
    
    var supportsUniformBuffers: Boolean
    
    var version: String
  }
  object ProcessingOptions {
    
    inline def apply(
      defines: js.Array[String],
      includesShadersStore: StringDictionary[String],
      indexParameters: js.Any,
      isFragment: Boolean,
      platformName: String,
      shadersRepository: String,
      shouldUseHighPrecisionShader: Boolean,
      supportsUniformBuffers: Boolean,
      version: String
    ): ProcessingOptions = {
      val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], includesShadersStore = includesShadersStore.asInstanceOf[js.Any], indexParameters = indexParameters.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], shadersRepository = shadersRepository.asInstanceOf[js.Any], shouldUseHighPrecisionShader = shouldUseHighPrecisionShader.asInstanceOf[js.Any], supportsUniformBuffers = supportsUniformBuffers.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessingOptions]
    }
    
    extension [Self <: ProcessingOptions](x: Self) {
      
      inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
      
      inline def setIncludesShadersStore(value: StringDictionary[String]): Self = StObject.set(x, "includesShadersStore", value.asInstanceOf[js.Any])
      
      inline def setIndexParameters(value: js.Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
      
      inline def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
      
      inline def setLookForClosingBracketForUniformBuffer(value: Boolean): Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", value.asInstanceOf[js.Any])
      
      inline def setLookForClosingBracketForUniformBufferUndefined: Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", js.undefined)
      
      inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: IShaderProcessor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
      
      inline def setShadersRepository(value: String): Self = StObject.set(x, "shadersRepository", value.asInstanceOf[js.Any])
      
      inline def setShouldUseHighPrecisionShader(value: Boolean): Self = StObject.set(x, "shouldUseHighPrecisionShader", value.asInstanceOf[js.Any])
      
      inline def setSupportsUniformBuffers(value: Boolean): Self = StObject.set(x, "supportsUniformBuffers", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
