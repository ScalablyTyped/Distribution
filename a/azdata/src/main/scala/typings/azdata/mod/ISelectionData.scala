package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionData extends js.Object {
  var endColumn: Double = js.native
  var endLine: Double = js.native
  var startColumn: Double = js.native
  var startLine: Double = js.native
}

object ISelectionData {
  @scala.inline
  def apply(endColumn: Double, endLine: Double, startColumn: Double, startLine: Double): ISelectionData = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionData]
  }
  @scala.inline
  implicit class ISelectionDataOps[Self <: ISelectionData] (val x: Self) extends AnyVal {
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
  }
  
}

