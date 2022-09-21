package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeExpenseRequest extends StObject {
  
  var Document: typings.awsSdk.textractMod.Document
}
object AnalyzeExpenseRequest {
  
  inline def apply(Document: Document): AnalyzeExpenseRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeExpenseRequest]
  }
  
  extension [Self <: AnalyzeExpenseRequest](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
  }
}
