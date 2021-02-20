package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxColumnOption extends StObject {
  
  var actionOnCheckbox: ActionOnCellCheckboxCheck = js.native
}
object CheckboxColumnOption {
  
  @scala.inline
  def apply(actionOnCheckbox: ActionOnCellCheckboxCheck): CheckboxColumnOption = {
    val __obj = js.Dynamic.literal(actionOnCheckbox = actionOnCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxColumnOption]
  }
  
  @scala.inline
  implicit class CheckboxColumnOptionMutableBuilder[Self <: CheckboxColumnOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOnCheckbox(value: ActionOnCellCheckboxCheck): Self = StObject.set(x, "actionOnCheckbox", value.asInstanceOf[js.Any])
  }
}
