package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableError extends js.Object {
  /**
    * The details about the error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.native
  /**
    * The name of the table. For Hive compatibility, this must be entirely lowercase.
    */
  var TableName: js.UndefOr[NameString] = js.native
}

object TableError {
  @scala.inline
  def apply(): TableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableError]
  }
  @scala.inline
  implicit class TableErrorOps[Self <: TableError] (val x: Self) extends AnyVal {
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
    def setErrorDetail(value: ErrorDetail): Self = this.set("ErrorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetail: Self = this.set("ErrorDetail", js.undefined)
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

