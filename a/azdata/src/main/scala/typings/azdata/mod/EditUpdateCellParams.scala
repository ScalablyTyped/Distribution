package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditUpdateCellParams extends IEditRowOperationParams {
  var columnId: Double
  var newValue: String
}

object EditUpdateCellParams {
  @scala.inline
  def apply(columnId: Double, newValue: String, ownerUri: String, rowId: Double): EditUpdateCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditUpdateCellParams]
  }
}

