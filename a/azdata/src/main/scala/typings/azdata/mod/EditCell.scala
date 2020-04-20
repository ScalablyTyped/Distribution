package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCell extends DbCellValue {
  var isDirty: Boolean
}

object EditCell {
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isDirty: Boolean, isNull: Boolean): EditCell = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCell]
  }
}

