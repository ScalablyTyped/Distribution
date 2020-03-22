package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRow extends js.Object {
  var cells: js.Array[DbCellValue]
  var id: Double
  var isDirty: Boolean
  var state: EditRowState
}

object EditRow {
  @scala.inline
  def apply(cells: js.Array[DbCellValue], id: Double, isDirty: Boolean, state: EditRowState): EditRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditRow]
  }
}

