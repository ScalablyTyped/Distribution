package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpParameter extends StObject {
  
  var displayParts: Array[SymbolDisplayPart]
  
  var documentation: Array[SymbolDisplayPart]
  
  var isOptional: Boolean
  
  var isRest: js.UndefOr[Boolean] = js.undefined
  
  var name: java.lang.String
}
object SignatureHelpParameter {
  
  inline def apply(
    displayParts: Array[SymbolDisplayPart],
    documentation: Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParameter]
  }
  
  extension [Self <: SignatureHelpParameter](x: Self) {
    
    inline def setDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsRest(value: Boolean): Self = StObject.set(x, "isRest", value.asInstanceOf[js.Any])
    
    inline def setIsRestUndefined: Self = StObject.set(x, "isRest", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
