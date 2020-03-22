package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxColumnOption extends js.Object {
  var actionOnCheckbox: ActionOnCellCheckboxCheck
}

object CheckboxColumnOption {
  @scala.inline
  def apply(actionOnCheckbox: ActionOnCellCheckboxCheck): CheckboxColumnOption = {
    val __obj = js.Dynamic.literal(actionOnCheckbox = actionOnCheckbox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxColumnOption]
  }
}

