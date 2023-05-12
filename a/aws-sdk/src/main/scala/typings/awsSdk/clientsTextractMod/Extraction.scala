package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extraction extends StObject {
  
  var ExpenseDocument: js.UndefOr[typings.awsSdk.clientsTextractMod.ExpenseDocument] = js.undefined
  
  var IdentityDocument: js.UndefOr[typings.awsSdk.clientsTextractMod.IdentityDocument] = js.undefined
  
  /**
    * Holds the structured data returned by AnalyzeDocument for lending documents.
    */
  var LendingDocument: js.UndefOr[typings.awsSdk.clientsTextractMod.LendingDocument] = js.undefined
}
object Extraction {
  
  inline def apply(): Extraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extraction] (val x: Self) extends AnyVal {
    
    inline def setExpenseDocument(value: ExpenseDocument): Self = StObject.set(x, "ExpenseDocument", value.asInstanceOf[js.Any])
    
    inline def setExpenseDocumentUndefined: Self = StObject.set(x, "ExpenseDocument", js.undefined)
    
    inline def setIdentityDocument(value: IdentityDocument): Self = StObject.set(x, "IdentityDocument", value.asInstanceOf[js.Any])
    
    inline def setIdentityDocumentUndefined: Self = StObject.set(x, "IdentityDocument", js.undefined)
    
    inline def setLendingDocument(value: LendingDocument): Self = StObject.set(x, "LendingDocument", value.asInstanceOf[js.Any])
    
    inline def setLendingDocumentUndefined: Self = StObject.set(x, "LendingDocument", js.undefined)
  }
}
