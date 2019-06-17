package typings
package baseuiLib.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxState extends js.Object {
  var isActive: scala.Boolean
  var isFocused: scala.Boolean
  var isHovered: scala.Boolean
}

object CheckboxState {
  @scala.inline
  def apply(isActive: scala.Boolean, isFocused: scala.Boolean, isHovered: scala.Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isActive = isActive, isFocused = isFocused, isHovered = isHovered)
  
    __obj.asInstanceOf[CheckboxState]
  }
}

