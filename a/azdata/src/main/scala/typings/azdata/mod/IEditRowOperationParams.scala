package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditRowOperationParams extends IEditSessionOperationParams {
  var rowId: Double
}

object IEditRowOperationParams {
  @scala.inline
  def apply(ownerUri: String, rowId: Double): IEditRowOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditRowOperationParams]
  }
}

