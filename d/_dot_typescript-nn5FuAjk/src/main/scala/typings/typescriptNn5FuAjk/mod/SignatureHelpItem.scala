package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single signature to show in signature help.
  * The id is used for subsequent calls into the language service to ask questions about the
  * signature help item in the context of any documents that have been updated.  i.e. after
  * an edit has happened, while signature help is still active, the host can ask important
  * questions like 'what parameter is the user currently contained within?'.
  */
trait SignatureHelpItem extends StObject {
  
  var documentation: Array[SymbolDisplayPart]
  
  var isVariadic: Boolean
  
  var parameters: Array[SignatureHelpParameter]
  
  var prefixDisplayParts: Array[SymbolDisplayPart]
  
  var separatorDisplayParts: Array[SymbolDisplayPart]
  
  var suffixDisplayParts: Array[SymbolDisplayPart]
  
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
