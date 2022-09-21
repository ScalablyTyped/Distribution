package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single signature to show in signature help.
  */
trait SignatureHelpItem extends StObject {
  
  /**
    * The signature's documentation
    */
  var documentation: Array[SymbolDisplayPart]
  
  /**
    * Whether the signature accepts a variable number of arguments.
    */
  var isVariadic: Boolean
  
  /**
    * The signature helps items for the parameters.
    */
  var parameters: Array[SignatureHelpParameter]
  
  /**
    * The prefix display parts.
    */
  var prefixDisplayParts: Array[SymbolDisplayPart]
  
  /**
    * The separator display parts.
    */
  var separatorDisplayParts: Array[SymbolDisplayPart]
  
  /**
    * The suffix display parts.
    */
  var suffixDisplayParts: Array[SymbolDisplayPart]
  
  /**
    * The signature's JSDoc tags
    */
  var tags: Array[JSDocTagInfo]
}
object SignatureHelpItem {
  
  inline def apply(
    documentation: Array[SymbolDisplayPart],
    isVariadic: Boolean,
    parameters: Array[SignatureHelpParameter],
    prefixDisplayParts: Array[SymbolDisplayPart],
    separatorDisplayParts: Array[SymbolDisplayPart],
    suffixDisplayParts: Array[SymbolDisplayPart],
    tags: Array[JSDocTagInfo]
  ): SignatureHelpItem = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], isVariadic = isVariadic.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], prefixDisplayParts = prefixDisplayParts.asInstanceOf[js.Any], separatorDisplayParts = separatorDisplayParts.asInstanceOf[js.Any], suffixDisplayParts = suffixDisplayParts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItem]
  }
  
  extension [Self <: SignatureHelpItem](x: Self) {
    
    inline def setDocumentation(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setIsVariadic(value: Boolean): Self = StObject.set(x, "isVariadic", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Array[SignatureHelpParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setPrefixDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "prefixDisplayParts", value.asInstanceOf[js.Any])
    
    inline def setSeparatorDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "separatorDisplayParts", value.asInstanceOf[js.Any])
    
    inline def setSuffixDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "suffixDisplayParts", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
