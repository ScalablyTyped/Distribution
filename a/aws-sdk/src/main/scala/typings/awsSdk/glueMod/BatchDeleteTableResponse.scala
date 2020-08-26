package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableResponse extends js.Object {
  /**
    * A list of errors encountered in attempting to delete the specified tables.
    */
  var Errors: js.UndefOr[TableErrors] = js.native
}

object BatchDeleteTableResponse {
  @scala.inline
  def apply(): BatchDeleteTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableResponse]
  }
  @scala.inline
  implicit class BatchDeleteTableResponseOps[Self <: BatchDeleteTableResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: TableError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: TableErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
  
}

