package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultRow extends js.Object {
  /**
    * List of all the data cells in a row.
    */
  var dataItems: DataItems = js.native
  /**
    * The ID for a particular row.
    */
  var rowId: js.UndefOr[RowId] = js.native
}

object ResultRow {
  @scala.inline
  def apply(dataItems: DataItems): ResultRow = {
    val __obj = js.Dynamic.literal(dataItems = dataItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRow]
  }
  @scala.inline
  implicit class ResultRowOps[Self <: ResultRow] (val x: Self) extends AnyVal {
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
    def setDataItemsVarargs(value: DataItem*): Self = this.set("dataItems", js.Array(value :_*))
    @scala.inline
    def setDataItems(value: DataItems): Self = this.set("dataItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowId(value: RowId): Self = this.set("rowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
  }
  
}

