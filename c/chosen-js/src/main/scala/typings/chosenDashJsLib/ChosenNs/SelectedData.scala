package typings
package chosenDashJsLib.ChosenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedData extends js.Object {
  var deselected: java.lang.String
  var selected: java.lang.String
}

object SelectedData {
  @scala.inline
  def apply(deselected: java.lang.String, selected: java.lang.String): SelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselected")(deselected)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[SelectedData]
  }
}

