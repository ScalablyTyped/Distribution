package typings.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedData extends js.Object {
  var deselected: String
  var selected: String
}

object SelectedData {
  @scala.inline
  def apply(deselected: String, selected: String): SelectedData = {
    val __obj = js.Dynamic.literal(deselected = deselected.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedData]
  }
}

