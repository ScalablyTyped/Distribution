package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingOptions extends js.Object {
  
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
  implicit class ProcessingOptionsOps[Self <: ProcessingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesShadersStore(value: org.scalablytyped.runtime.StringDictionary[String]): Self = this.set("includesShadersStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexParameters(value: js.Any): Self = this.set("indexParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFragment(value: Boolean): Self = this.set("isFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformName(value: String): Self = this.set("platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadersRepository(value: String): Self = this.set("shadersRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldUseHighPrecisionShader(value: Boolean): Self = this.set("shouldUseHighPrecisionShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUniformBuffers(value: Boolean): Self = this.set("supportsUniformBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookForClosingBracketForUniformBuffer(value: Boolean): Self = this.set("lookForClosingBracketForUniformBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookForClosingBracketForUniformBuffer: Self = this.set("lookForClosingBracketForUniformBuffer", js.undefined)
    
    @scala.inline
    def setProcessor(value: IShaderProcessor): Self = this.set("processor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessor: Self = this.set("processor", js.undefined)
  }
}
