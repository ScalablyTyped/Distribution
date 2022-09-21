package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseDocument extends StObject {
  
  /**
    * Denotes which invoice or receipt in the document the information is coming from. First document will be 1, the second 2, and so on.
    */
  var ExpenseIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * Information detected on each table of a document, seperated into LineItems.
    */
  var LineItemGroups: js.UndefOr[LineItemGroupList] = js.undefined
  
  /**
    * Any information found outside of a table by Amazon Textract.
    */
  var SummaryFields: js.UndefOr[ExpenseFieldList] = js.undefined
}
object ExpenseDocument {
  
  inline def apply(): ExpenseDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseDocument]
  }
  
  extension [Self <: ExpenseDocument](x: Self) {
    
    inline def setExpenseIndex(value: UInteger): Self = StObject.set(x, "ExpenseIndex", value.asInstanceOf[js.Any])
    
    inline def setExpenseIndexUndefined: Self = StObject.set(x, "ExpenseIndex", js.undefined)
    
    inline def setLineItemGroups(value: LineItemGroupList): Self = StObject.set(x, "LineItemGroups", value.asInstanceOf[js.Any])
    
    inline def setLineItemGroupsUndefined: Self = StObject.set(x, "LineItemGroups", js.undefined)
    
    inline def setLineItemGroupsVarargs(value: LineItemGroup*): Self = StObject.set(x, "LineItemGroups", js.Array(value*))
    
    inline def setSummaryFields(value: ExpenseFieldList): Self = StObject.set(x, "SummaryFields", value.asInstanceOf[js.Any])
    
    inline def setSummaryFieldsUndefined: Self = StObject.set(x, "SummaryFields", js.undefined)
    
    inline def setSummaryFieldsVarargs(value: ExpenseField*): Self = StObject.set(x, "SummaryFields", js.Array(value*))
  }
}
