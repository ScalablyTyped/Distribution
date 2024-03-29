package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.ts.CompletionEntry
import typings.typescriptNn5FuAjk.ts.CompletionInfoFlags
import typings.typescriptNn5FuAjk.ts.TextSpan
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .typescript-nn5FuAjk.ts.WithMetadata<.typescript-nn5FuAjk.ts.CompletionInfo> */
trait WithMetadataCompletionInfFlags extends StObject {
  
  var entries: Array[CompletionEntry]
  
  /** For performance telemetry. */
  var flags: js.UndefOr[CompletionInfoFlags] = js.undefined
  
  /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: Boolean
  
  /**
    * Indicates to client to continue requesting completions on subsequent keystrokes.
    */
  var isIncomplete: js.UndefOr[`true`] = js.undefined
  
  var isMemberCompletion: Boolean
  
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: Boolean
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * In the absence of `CompletionEntry["replacementSpan"], the editor may choose whether to use
    * this span or its default one. If `CompletionEntry["replacementSpan"]` is defined, that span
    * must be used to commit that completion entry.
    */
  var optionalReplacementSpan: js.UndefOr[TextSpan] = js.undefined
}
object WithMetadataCompletionInfFlags {
  
  inline def apply(
    entries: Array[CompletionEntry],
    isGlobalCompletion: Boolean,
    isMemberCompletion: Boolean,
    isNewIdentifierLocation: Boolean
  ): WithMetadataCompletionInfFlags = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMetadataCompletionInfFlags]
  }
  
  extension [Self <: WithMetadataCompletionInfFlags](x: Self) {
    
    inline def setEntries(value: Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: CompletionInfoFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setIsGlobalCompletion(value: Boolean): Self = StObject.set(x, "isGlobalCompletion", value.asInstanceOf[js.Any])
    
    inline def setIsIncomplete(value: `true`): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    inline def setIsIncompleteUndefined: Self = StObject.set(x, "isIncomplete", js.undefined)
    
    inline def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
    
    inline def setIsNewIdentifierLocation(value: Boolean): Self = StObject.set(x, "isNewIdentifierLocation", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOptionalReplacementSpan(value: TextSpan): Self = StObject.set(x, "optionalReplacementSpan", value.asInstanceOf[js.Any])
    
    inline def setOptionalReplacementSpanUndefined: Self = StObject.set(x, "optionalReplacementSpan", js.undefined)
  }
}
