package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingOptions extends StObject {
  
  var defines: js.Array[String] = js.native
  
  var includesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  var indexParameters: js.Any = js.native
  
  var isFragment: Boolean = js.native
  
  var lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.native
  
  var platformName: String = js.native
  
  var processor: js.UndefOr[IShaderProcessor] = js.native
  
  var shadersRepository: String = js.native
  
  var shouldUseHighPrecisionShader: Boolean = js.native
  
  var supportsUniformBuffers: Boolean = js.native
  
  var version: String = js.native
}
object ProcessingOptions {
  
  @scala.inline
  def apply(
    defines: js.Array[String],
    includesShadersStore: org.scalablytyped.runtime.StringDictionary[String],
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
  
  @scala.inline
  implicit class ProcessingOptionsMutableBuilder[Self <: ProcessingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    @scala.inline
    def setIncludesShadersStore(value: org.scalablytyped.runtime.StringDictionary[String]): Self = StObject.set(x, "includesShadersStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexParameters(value: js.Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookForClosingBracketForUniformBuffer(value: Boolean): Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookForClosingBracketForUniformBufferUndefined: Self = StObject.set(x, "lookForClosingBracketForUniformBuffer", js.undefined)
    
    @scala.inline
    def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessor(value: IShaderProcessor): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    @scala.inline
    def setShadersRepository(value: String): Self = StObject.set(x, "shadersRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUseHighPrecisionShader(value: Boolean): Self = StObject.set(x, "shouldUseHighPrecisionShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUniformBuffers(value: Boolean): Self = StObject.set(x, "supportsUniformBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
