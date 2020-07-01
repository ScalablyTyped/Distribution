package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnError extends js.Object {
  /**
    * The name of the column.
    */
  var ColumnName: js.UndefOr[NameString] = js.native
  /**
    * The error message occurred during operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
}

object ColumnError {
  @scala.inline
  def apply(ColumnName: NameString = null, Error: ErrorDetail = null): ColumnError = {
    val __obj = js.Dynamic.literal()
    if (ColumnName != null) __obj.updateDynamic("ColumnName")(ColumnName.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnError]
  }
}

