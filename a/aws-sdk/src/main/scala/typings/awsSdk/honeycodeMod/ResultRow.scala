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
  def apply(dataItems: DataItems, rowId: RowId = null): ResultRow = {
    val __obj = js.Dynamic.literal(dataItems = dataItems.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRow]
  }
}

