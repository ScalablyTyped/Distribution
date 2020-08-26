package typings.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedData extends js.Object {
  var deselected: String = js.native
  var selected: String = js.native
}

object SelectedData {
  @scala.inline
  def apply(deselected: String, selected: String): SelectedData = {
    val __obj = js.Dynamic.literal(deselected = deselected.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedData]
  }
  @scala.inline
  implicit class SelectedDataOps[Self <: SelectedData] (val x: Self) extends AnyVal {
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
    def setDeselected(value: String): Self = this.set("deselected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

