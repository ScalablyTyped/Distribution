package typings
package bootstrapDashTreeviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: scala.Boolean
  var disabled: scala.Boolean
  var expanded: scala.Boolean
  var selected: scala.Boolean
}

object Anon_Checked {
  @scala.inline
  def apply(checked: scala.Boolean, disabled: scala.Boolean, expanded: scala.Boolean, selected: scala.Boolean): Anon_Checked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_Checked]
  }
}

