package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpenseField extends StObject {
  
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
  
  extension [Self <: ExpenseField](x: Self) {
    
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
