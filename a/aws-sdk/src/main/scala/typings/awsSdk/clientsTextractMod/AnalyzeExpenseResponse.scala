package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeExpenseResponse extends StObject {
  
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsTextractMod.DocumentMetadata] = js.undefined
  
  /**
    * The expenses detected by Amazon Textract.
    */
  var ExpenseDocuments: js.UndefOr[ExpenseDocumentList] = js.undefined
}
object AnalyzeExpenseResponse {
  
  inline def apply(): AnalyzeExpenseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeExpenseResponse]
  }
  
  extension [Self <: AnalyzeExpenseResponse](x: Self) {
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setExpenseDocuments(value: ExpenseDocumentList): Self = StObject.set(x, "ExpenseDocuments", value.asInstanceOf[js.Any])
    
    inline def setExpenseDocumentsUndefined: Self = StObject.set(x, "ExpenseDocuments", js.undefined)
    
    inline def setExpenseDocumentsVarargs(value: ExpenseDocument*): Self = StObject.set(x, "ExpenseDocuments", js.Array(value*))
  }
}
