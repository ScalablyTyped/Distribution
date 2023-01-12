package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeExpenseRequest extends StObject {
  
  var Document: typings.awsSdk.clientsTextractMod.Document
}
object AnalyzeExpenseRequest {
  
  inline def apply(Document: Document): AnalyzeExpenseRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeExpenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzeExpenseRequest] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
  }
}
