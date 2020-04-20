package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCellResult extends js.Object {
  var cell: EditCell
  var isRowDirty: Boolean
}

object EditCellResult {
  @scala.inline
  def apply(cell: EditCell, isRowDirty: Boolean): EditCellResult = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], isRowDirty = isRowDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellResult]
  }
}

