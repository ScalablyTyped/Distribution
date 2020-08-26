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
  def apply(): ColumnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnError]
  }
  @scala.inline
  implicit class ColumnErrorOps[Self <: ColumnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnName(value: NameString): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("ColumnName", js.undefined)
    @scala.inline
    def setError(value: ErrorDetail): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
  }
  
}

