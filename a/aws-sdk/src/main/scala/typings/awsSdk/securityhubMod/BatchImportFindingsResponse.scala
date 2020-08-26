package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchImportFindingsResponse extends js.Object {
  /**
    * The number of findings that failed to import.
    */
  var FailedCount: Integer = js.native
  /**
    * The list of findings that failed to import.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.native
  /**
    * The number of findings that were successfully imported.
    */
  var SuccessCount: Integer = js.native
}

object BatchImportFindingsResponse {
  @scala.inline
  def apply(FailedCount: Integer, SuccessCount: Integer): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount.asInstanceOf[js.Any], SuccessCount = SuccessCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
  @scala.inline
  implicit class BatchImportFindingsResponseOps[Self <: BatchImportFindingsResponse] (val x: Self) extends AnyVal {
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
    def setFailedCount(value: Integer): Self = this.set("FailedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessCount(value: Integer): Self = this.set("SuccessCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedFindingsVarargs(value: ImportFindingsError*): Self = this.set("FailedFindings", js.Array(value :_*))
    @scala.inline
    def setFailedFindings(value: ImportFindingsErrorList): Self = this.set("FailedFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedFindings: Self = this.set("FailedFindings", js.undefined)
  }
  
}

