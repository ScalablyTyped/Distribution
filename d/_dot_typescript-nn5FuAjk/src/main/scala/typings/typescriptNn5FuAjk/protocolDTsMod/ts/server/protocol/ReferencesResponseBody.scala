package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The body of a "references" response message.
  */
trait ReferencesResponseBody extends StObject {
  
  /**
    * The file locations referencing the symbol.
    */
  var refs: Array[ReferencesResponseItem]
  
  /**
    * The full display name of the symbol.
    */
  var symbolDisplayString: String
  
  /**
    * The name of the symbol.
    */
  var symbolName: String
  
  /**
    * The start character offset of the symbol (on the line provided by the references request).
    */
  var symbolStartOffset: Double
}
object ReferencesResponseBody {
  
  inline def apply(
    refs: Array[ReferencesResponseItem],
    symbolDisplayString: String,
    symbolName: String,
    symbolStartOffset: Double
  ): ReferencesResponseBody = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any], symbolDisplayString = symbolDisplayString.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any], symbolStartOffset = symbolStartOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencesResponseBody]
  }
  
  extension [Self <: ReferencesResponseBody](x: Self) {
    
    inline def setRefs(value: Array[ReferencesResponseItem]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setSymbolDisplayString(value: String): Self = StObject.set(x, "symbolDisplayString", value.asInstanceOf[js.Any])
    
    inline def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
    
    inline def setSymbolStartOffset(value: Double): Self = StObject.set(x, "symbolStartOffset", value.asInstanceOf[js.Any])
  }
}
