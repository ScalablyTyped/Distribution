package typings.bootstrapTreeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var expanded: Boolean
  var selected: Boolean
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, expanded: Boolean, selected: Boolean): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

