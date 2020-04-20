package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbCellValue extends js.Object {
  var displayValue: String
  var invariantCultureDisplayValue: String
  var isNull: Boolean
}

object DbCellValue {
  @scala.inline
  def apply(displayValue: String, invariantCultureDisplayValue: String, isNull: Boolean): DbCellValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCellValue]
  }
}

