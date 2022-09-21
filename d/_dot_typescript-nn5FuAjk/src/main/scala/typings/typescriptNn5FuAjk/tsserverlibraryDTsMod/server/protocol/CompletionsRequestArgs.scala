package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for completions messages.
  */
trait CompletionsRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * @deprecated Use UserPreferences.includeCompletionsForModuleExports
    */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Use UserPreferences.includeCompletionsWithInsertText
    */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional prefix to apply to possible completions.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Character that was responsible for triggering completion.
    * Should be `undefined` if a user manually requested completion.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.undefined
  
  var triggerKind: js.UndefOr[CompletionTriggerKind] = js.undefined
}
object CompletionsRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double): CompletionsRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsRequestArgs]
  }
  
  extension [Self <: CompletionsRequestArgs](x: Self) {
    
    inline def setIncludeExternalModuleExports(value: Boolean): Self = StObject.set(x, "includeExternalModuleExports", value.asInstanceOf[js.Any])
    
    inline def setIncludeExternalModuleExportsUndefined: Self = StObject.set(x, "includeExternalModuleExports", js.undefined)
    
    inline def setIncludeInsertTextCompletions(value: Boolean): Self = StObject.set(x, "includeInsertTextCompletions", value.asInstanceOf[js.Any])
    
    inline def setIncludeInsertTextCompletionsUndefined: Self = StObject.set(x, "includeInsertTextCompletions", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTriggerCharacter(value: CompletionsTriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    inline def setTriggerKind(value: CompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
    
    inline def setTriggerKindUndefined: Self = StObject.set(x, "triggerKind", js.undefined)
  }
}
