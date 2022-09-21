package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional completion entry details, available on demand
  */
trait CompletionEntryDetails extends StObject {
  
  /**
    * The associated code actions for this entry
    */
  var codeActions: js.UndefOr[Array[CodeAction]] = js.undefined
  
  /**
    * Display parts of the symbol (similar to quick info).
    */
  var displayParts: Array[SymbolDisplayPart]
  
  /**
    * Documentation strings for the symbol.
    */
  var documentation: js.UndefOr[Array[SymbolDisplayPart]] = js.undefined
  
  /**
    * The symbol's kind (such as 'className' or 'parameterName').
    */
  var kind: ScriptElementKind
  
  /**
    * Optional modifiers for the kind (such as 'public').
    */
  var kindModifiers: String
  
  /**
    * The symbol's name.
    */
  var name: String
  
  /**
    * @deprecated Use `sourceDisplay` instead.
    */
  var source: js.UndefOr[Array[SymbolDisplayPart]] = js.undefined
  
  /**
    * Human-readable description of the `source` from the CompletionEntry.
    */
  var sourceDisplay: js.UndefOr[Array[SymbolDisplayPart]] = js.undefined
  
  /**
    * JSDoc tags for the symbol.
    */
  var tags: js.UndefOr[Array[JSDocTagInfo]] = js.undefined
}
object CompletionEntryDetails {
  
  inline def apply(
    displayParts: Array[SymbolDisplayPart],
    kind: ScriptElementKind,
    kindModifiers: String,
    name: String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
  
  extension [Self <: CompletionEntryDetails](x: Self) {
    
    inline def setCodeActions(value: Array[CodeAction]): Self = StObject.set(x, "codeActions", value.asInstanceOf[js.Any])
    
    inline def setCodeActionsUndefined: Self = StObject.set(x, "codeActions", js.undefined)
    
    inline def setDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDisplay(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "sourceDisplay", value.asInstanceOf[js.Any])
    
    inline def setSourceDisplayUndefined: Self = StObject.set(x, "sourceDisplay", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTags(value: Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
