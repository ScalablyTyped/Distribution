package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxColumnOption extends js.Object {
  
  var actionOnCheckbox: ActionOnCellCheckboxCheck = js.native
}
object CheckboxColumnOption {
  
  @scala.inline
  def apply(actionOnCheckbox: ActionOnCellCheckboxCheck): CheckboxColumnOption = {
    val __obj = js.Dynamic.literal(actionOnCheckbox = actionOnCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxColumnOption]
  }
  
  @scala.inline
  implicit class CheckboxColumnOptionOps[Self <: CheckboxColumnOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionOnCheckbox(value: ActionOnCellCheckboxCheck): Self = this.set("actionOnCheckbox", value.asInstanceOf[js.Any])
  }
}
