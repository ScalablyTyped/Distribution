package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataResponse extends js.Object {
  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  var errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.native
}

object BatchDeleteImportDataResponse {
  @scala.inline
  def apply(): BatchDeleteImportDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataResponse]
  }
  @scala.inline
  implicit class BatchDeleteImportDataResponseOps[Self <: BatchDeleteImportDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: BatchDeleteImportDataError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchDeleteImportDataErrorList): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

