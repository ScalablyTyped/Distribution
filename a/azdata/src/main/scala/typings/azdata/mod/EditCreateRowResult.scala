package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditCreateRowResult extends js.Object {
  var defaultValues: js.Array[String]
  var newRowId: Double
}

object EditCreateRowResult {
  @scala.inline
  def apply(defaultValues: js.Array[String], newRowId: Double): EditCreateRowResult = {
    val __obj = js.Dynamic.literal(defaultValues = defaultValues.asInstanceOf[js.Any], newRowId = newRowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditCreateRowResult]
  }
}

