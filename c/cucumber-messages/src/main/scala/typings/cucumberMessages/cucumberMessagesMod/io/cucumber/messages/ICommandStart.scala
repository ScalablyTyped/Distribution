package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandStart. */
trait ICommandStart extends StObject {
  
  /** CommandStart baseDirectory */
  var baseDirectory: js.UndefOr[String | Null] = js.undefined
  
  /** CommandStart runtimeConfig */
  var runtimeConfig: js.UndefOr[IRuntimeConfig | Null] = js.undefined
  
  /** CommandStart sourcesConfig */
  var sourcesConfig: js.UndefOr[ISourcesConfig | Null] = js.undefined
  
  /** CommandStart supportCodeConfig */
  var supportCodeConfig: js.UndefOr[ISupportCodeConfig | Null] = js.undefined
}
object ICommandStart {
  
  @scala.inline
  def apply(): ICommandStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandStart]
  }
  
  @scala.inline
  implicit class ICommandStartMutableBuilder[Self <: ICommandStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDirectory(value: String): Self = StObject.set(x, "baseDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDirectoryNull: Self = StObject.set(x, "baseDirectory", null)
    
    @scala.inline
    def setBaseDirectoryUndefined: Self = StObject.set(x, "baseDirectory", js.undefined)
    
    @scala.inline
    def setRuntimeConfig(value: IRuntimeConfig): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigNull: Self = StObject.set(x, "runtimeConfig", null)
    
    @scala.inline
    def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    @scala.inline
    def setSourcesConfig(value: ISourcesConfig): Self = StObject.set(x, "sourcesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesConfigNull: Self = StObject.set(x, "sourcesConfig", null)
    
    @scala.inline
    def setSourcesConfigUndefined: Self = StObject.set(x, "sourcesConfig", js.undefined)
    
    @scala.inline
    def setSupportCodeConfig(value: ISupportCodeConfig): Self = StObject.set(x, "supportCodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeConfigNull: Self = StObject.set(x, "supportCodeConfig", null)
    
    @scala.inline
    def setSupportCodeConfigUndefined: Self = StObject.set(x, "supportCodeConfig", js.undefined)
  }
}
