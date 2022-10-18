package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemFields extends StObject {
  
  /**
    * ExpenseFields used to show information from detected lines on a table.
    */
  var LineItemExpenseFields: js.UndefOr[ExpenseFieldList] = js.undefined
}
object LineItemFields {
  
  inline def apply(): LineItemFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemFields]
  }
  
  extension [Self <: LineItemFields](x: Self) {
    
    inline def setLineItemExpenseFields(value: ExpenseFieldList): Self = StObject.set(x, "LineItemExpenseFields", value.asInstanceOf[js.Any])
    
    inline def setLineItemExpenseFieldsUndefined: Self = StObject.set(x, "LineItemExpenseFields", js.undefined)
    
    inline def setLineItemExpenseFieldsVarargs(value: ExpenseField*): Self = StObject.set(x, "LineItemExpenseFields", js.Array(value*))
  }
}
