package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickInfo extends StObject {
  
  var displayParts: js.UndefOr[Array[SymbolDisplayPart]] = js.undefined
  
  var documentation: js.UndefOr[Array[SymbolDisplayPart]] = js.undefined
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var tags: js.UndefOr[Array[JSDocTagInfo]] = js.undefined
  
  var textSpan: TextSpan
}
object QuickInfo {
  
  inline def apply(kind: ScriptElementKind, kindModifiers: java.lang.String, textSpan: TextSpan): QuickInfo = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInfo]
  }
  
  extension [Self <: QuickInfo](x: Self) {
    
    inline def setDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    inline def setDisplayPartsUndefined: Self = StObject.set(x, "displayParts", js.undefined)
    
    inline def setDocumentation(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
