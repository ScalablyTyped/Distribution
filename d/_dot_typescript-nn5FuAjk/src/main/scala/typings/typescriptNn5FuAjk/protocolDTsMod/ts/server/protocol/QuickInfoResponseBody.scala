package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Body of QuickInfoResponse.
  */
trait QuickInfoResponseBody extends StObject {
  
  /**
    * Type and kind of symbol.
    */
  var displayString: String
  
  /**
    * Documentation associated with symbol.
    * Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise.
    */
  var documentation: String | Array[SymbolDisplayPart]
  
  /**
    * One past last character of symbol.
    */
  var end: Location
  
  /**
    * The symbol's kind (such as 'className' or 'parameterName' or plain 'text').
    */
  var kind: ScriptElementKind
  
  /**
    * Optional modifiers for the kind (such as 'public').
    */
  var kindModifiers: String
  
  /**
    * Starting file location of symbol.
    */
  var start: Location
  
  /**
    * JSDoc tags associated with symbol.
    */
  var tags: Array[JSDocTagInfo]
}
object QuickInfoResponseBody {
  
  inline def apply(
    displayString: String,
    documentation: String | Array[SymbolDisplayPart],
    end: Location,
    kind: ScriptElementKind,
    kindModifiers: String,
    start: Location,
    tags: Array[JSDocTagInfo]
  ): QuickInfoResponseBody = {
    val __obj = js.Dynamic.literal(displayString = displayString.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInfoResponseBody]
  }
  
  extension [Self <: QuickInfoResponseBody](x: Self) {
    
    inline def setDisplayString(value: String): Self = StObject.set(x, "displayString", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String | Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
