package typings.baseui.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxState extends js.Object {
  var isActive: Boolean
  var isFocused: Boolean
  var isHovered: Boolean
}

object CheckboxState {
  @scala.inline
  def apply(isActive: Boolean, isFocused: Boolean, isHovered: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxState]
  }
}

