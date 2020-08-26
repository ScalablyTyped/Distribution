package typings.blueprintjsTable.gridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowIndices extends js.Object {
  var rowIndexEnd: Double = js.native
  var rowIndexStart: Double = js.native
}

object IRowIndices {
  @scala.inline
  def apply(rowIndexEnd: Double, rowIndexStart: Double): IRowIndices = {
    val __obj = js.Dynamic.literal(rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowIndices]
  }
  @scala.inline
  implicit class IRowIndicesOps[Self <: IRowIndices] (val x: Self) extends AnyVal {
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
    def setRowIndexEnd(value: Double): Self = this.set("rowIndexEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndexStart(value: Double): Self = this.set("rowIndexStart", value.asInstanceOf[js.Any])
  }
  
}

