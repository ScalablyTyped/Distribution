package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunResponse extends js.Object {
  /**
    * A list of the errors that were encountered in trying to stop JobRuns, including the JobRunId for which each error was encountered and details about the error.
    */
  var Errors: js.UndefOr[BatchStopJobRunErrorList] = js.native
  /**
    * A list of the JobRuns that were successfully submitted for stopping.
    */
  var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.native
}

object BatchStopJobRunResponse {
  @scala.inline
  def apply(): BatchStopJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunResponse]
  }
  @scala.inline
  implicit class BatchStopJobRunResponseOps[Self <: BatchStopJobRunResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: BatchStopJobRunError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchStopJobRunErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setSuccessfulSubmissionsVarargs(value: BatchStopJobRunSuccessfulSubmission*): Self = this.set("SuccessfulSubmissions", js.Array(value :_*))
    @scala.inline
    def setSuccessfulSubmissions(value: BatchStopJobRunSuccessfulSubmissionList): Self = this.set("SuccessfulSubmissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulSubmissions: Self = this.set("SuccessfulSubmissions", js.undefined)
  }
  
}

