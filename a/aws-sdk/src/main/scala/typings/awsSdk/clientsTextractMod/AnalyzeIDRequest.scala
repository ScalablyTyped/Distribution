package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIDRequest extends StObject {
  
  /**
    * The document being passed to AnalyzeID.
    */
  var DocumentPages: typings.awsSdk.clientsTextractMod.DocumentPages
}
object AnalyzeIDRequest {
  
  inline def apply(DocumentPages: DocumentPages): AnalyzeIDRequest = {
    val __obj = js.Dynamic.literal(DocumentPages = DocumentPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeIDRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeIDRequest] (val x: Self) extends AnyVal {
    
    inline def setDocumentPages(value: DocumentPages): Self = StObject.set(x, "DocumentPages", value.asInstanceOf[js.Any])
    
    inline def setDocumentPagesVarargs(value: Document*): Self = StObject.set(x, "DocumentPages", js.Array(value*))
  }
}
