package typings.bootstrapTreeview.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var expanded: Boolean
  var selected: Boolean
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, expanded: Boolean, selected: Boolean): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

