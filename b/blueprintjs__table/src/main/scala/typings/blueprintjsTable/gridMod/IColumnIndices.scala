package typings.blueprintjsTable.gridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnIndices extends js.Object {
  var columnIndexEnd: Double = js.native
  var columnIndexStart: Double = js.native
}

object IColumnIndices {
  @scala.inline
  def apply(columnIndexEnd: Double, columnIndexStart: Double): IColumnIndices = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnIndices]
  }
  @scala.inline
  implicit class IColumnIndicesOps[Self <: IColumnIndices] (val x: Self) extends AnyVal {
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
    def setColumnIndexEnd(value: Double): Self = this.set("columnIndexEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIndexStart(value: Double): Self = this.set("columnIndexStart", value.asInstanceOf[js.Any])
  }
  
}

