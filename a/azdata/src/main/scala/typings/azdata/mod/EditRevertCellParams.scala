package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRevertCellParams extends IEditRowOperationParams {
  var columnId: Double
}

object EditRevertCellParams {
  @scala.inline
  def apply(columnId: Double, ownerUri: String, rowId: Double): EditRevertCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditRevertCellParams]
  }
}

