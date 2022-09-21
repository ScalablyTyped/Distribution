package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReferencesResponseBody extends StObject {
  
  /**
    * The file locations referencing the symbol.
    */
  var refs: Array[ReferencesResponseItem]
  
  /**
    * The name of the symbol.
    */
  var symbolName: String
}
object FileReferencesResponseBody {
  
  inline def apply(refs: Array[ReferencesResponseItem], symbolName: String): FileReferencesResponseBody = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReferencesResponseBody]
  }
  
  extension [Self <: FileReferencesResponseBody](x: Self) {
    
    inline def setRefs(value: Array[ReferencesResponseItem]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
  }
}
