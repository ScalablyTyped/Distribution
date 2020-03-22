package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSubsetParams extends IEditSessionOperationParams {
  var rowCount: Double
  var rowStartIndex: Double
}

object EditSubsetParams {
  @scala.inline
  def apply(ownerUri: String, rowCount: Double, rowStartIndex: Double): EditSubsetParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditSubsetParams]
  }
}

