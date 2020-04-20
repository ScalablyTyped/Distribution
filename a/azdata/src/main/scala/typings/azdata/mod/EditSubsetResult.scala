package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSubsetResult extends js.Object {
  var rowCount: Double
  var subset: js.Array[EditRow]
}

object EditSubsetResult {
  @scala.inline
  def apply(rowCount: Double, subset: js.Array[EditRow]): EditSubsetResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetResult]
  }
}

