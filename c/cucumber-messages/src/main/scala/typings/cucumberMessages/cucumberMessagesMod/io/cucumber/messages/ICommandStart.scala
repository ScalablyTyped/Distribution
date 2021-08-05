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
  
  inline def apply(): ICommandStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandStart]
  }
  
  extension [Self <: ICommandStart](x: Self) {
    
    inline def setBaseDirectory(value: String): Self = StObject.set(x, "baseDirectory", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectoryNull: Self = StObject.set(x, "baseDirectory", null)
    
    inline def setBaseDirectoryUndefined: Self = StObject.set(x, "baseDirectory", js.undefined)
    
    inline def setRuntimeConfig(value: IRuntimeConfig): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigNull: Self = StObject.set(x, "runtimeConfig", null)
    
    inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    inline def setSourcesConfig(value: ISourcesConfig): Self = StObject.set(x, "sourcesConfig", value.asInstanceOf[js.Any])
    
    inline def setSourcesConfigNull: Self = StObject.set(x, "sourcesConfig", null)
    
    inline def setSourcesConfigUndefined: Self = StObject.set(x, "sourcesConfig", js.undefined)
    
    inline def setSupportCodeConfig(value: ISupportCodeConfig): Self = StObject.set(x, "supportCodeConfig", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeConfigNull: Self = StObject.set(x, "supportCodeConfig", null)
    
    inline def setSupportCodeConfigUndefined: Self = StObject.set(x, "supportCodeConfig", js.undefined)
  }
}
