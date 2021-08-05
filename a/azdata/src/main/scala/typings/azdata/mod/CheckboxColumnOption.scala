package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxColumnOption extends StObject {
  
  var actionOnCheckbox: ActionOnCellCheckboxCheck
}
object CheckboxColumnOption {
  
  inline def apply(actionOnCheckbox: ActionOnCellCheckboxCheck): CheckboxColumnOption = {
    val __obj = js.Dynamic.literal(actionOnCheckbox = actionOnCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxColumnOption]
  }
  
  extension [Self <: CheckboxColumnOption](x: Self) {
    
    inline def setActionOnCheckbox(value: ActionOnCellCheckboxCheck): Self = StObject.set(x, "actionOnCheckbox", value.asInstanceOf[js.Any])
  }
}
