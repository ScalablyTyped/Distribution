package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseField extends StObject {
  
  /**
    * Shows the kind of currency, both the code and confidence associated with any monatary value detected.
    */
  var Currency: js.UndefOr[ExpenseCurrency] = js.undefined
  
  /**
    * Shows which group a response object belongs to, such as whether an address line belongs to the vendor's address or the recipent's address.
    */
  var GroupProperties: js.UndefOr[ExpenseGroupPropertyList] = js.undefined
  
  /**
    * The explicitly stated label of a detected element.
    */
  var LabelDetection: js.UndefOr[ExpenseDetection] = js.undefined
  
  /**
    * The page number the value was detected on.
    */
  var PageNumber: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The implied label of a detected element. Present alongside LabelDetection for explicit elements.
    */
  var Type: js.UndefOr[ExpenseType] = js.undefined
  
  /**
    * The value of a detected element. Present in explicit and implicit elements.
    */
  var ValueDetection: js.UndefOr[ExpenseDetection] = js.undefined
}
object ExpenseField {
  
  inline def apply(): ExpenseField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpenseField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpenseField] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: ExpenseCurrency): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
    
    inline def setGroupProperties(value: ExpenseGroupPropertyList): Self = StObject.set(x, "GroupProperties", value.asInstanceOf[js.Any])
    
    inline def setGroupPropertiesUndefined: Self = StObject.set(x, "GroupProperties", js.undefined)
    
    inline def setGroupPropertiesVarargs(value: ExpenseGroupProperty*): Self = StObject.set(x, "GroupProperties", js.Array(value*))
    
    inline def setLabelDetection(value: ExpenseDetection): Self = StObject.set(x, "LabelDetection", value.asInstanceOf[js.Any])
    
    inline def setLabelDetectionUndefined: Self = StObject.set(x, "LabelDetection", js.undefined)
    
    inline def setPageNumber(value: UInteger): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
    
    inline def setType(value: ExpenseType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValueDetection(value: ExpenseDetection): Self = StObject.set(x, "ValueDetection", value.asInstanceOf[js.Any])
    
    inline def setValueDetectionUndefined: Self = StObject.set(x, "ValueDetection", js.undefined)
  }
}
