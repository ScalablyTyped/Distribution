package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signature help information for a single parameter
  */
trait SignatureHelpParameter extends StObject {
  
  /**
    * Display parts of the parameter.
    */
  var displayParts: Array[SymbolDisplayPart]
  
  /**
    * Documentation of the parameter.
    */
  var documentation: Array[SymbolDisplayPart]
  
  /**
    * Whether the parameter is optional or not.
    */
  var isOptional: Boolean
  
  /**
    * The parameter's name
    */
  var name: String
}
object SignatureHelpParameter {
  
  inline def apply(
    displayParts: Array[SymbolDisplayPart],
    documentation: Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParameter]
  }
  
  extension [Self <: SignatureHelpParameter](x: Self) {
    
    inline def setDisplayParts(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
