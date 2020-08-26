package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonExportOptions extends js.Object {
  var columns: js.UndefOr[ButtonSelectorTypes | js.Array[ButtonSelectorTypes]] = js.native
}

object ButtonExportOptions {
  @scala.inline
  def apply(): ButtonExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonExportOptions]
  }
  @scala.inline
  implicit class ButtonExportOptionsOps[Self <: ButtonExportOptions] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: ButtonSelectorTypes*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ButtonSelectorTypes | js.Array[ButtonSelectorTypes]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
  
}

