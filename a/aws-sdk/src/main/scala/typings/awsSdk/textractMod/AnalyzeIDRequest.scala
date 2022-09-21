package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIDRequest extends StObject {
  
  /**
    * The document being passed to AnalyzeID.
    */
  var DocumentPages: typings.awsSdk.textractMod.DocumentPages
}
object AnalyzeIDRequest {
  
  inline def apply(DocumentPages: DocumentPages): AnalyzeIDRequest = {
    val __obj = js.Dynamic.literal(DocumentPages = DocumentPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeIDRequest]
  }
  
  extension [Self <: AnalyzeIDRequest](x: Self) {
    
    inline def setDocumentPages(value: DocumentPages): Self = StObject.set(x, "DocumentPages", value.asInstanceOf[js.Any])
    
    inline def setDocumentPagesVarargs(value: Document*): Self = StObject.set(x, "DocumentPages", js.Array(value*))
  }
}
