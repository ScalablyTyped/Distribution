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
  def apply(
    Errors: BatchStopJobRunErrorList = null,
    SuccessfulSubmissions: BatchStopJobRunSuccessfulSubmissionList = null
  ): BatchStopJobRunResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (SuccessfulSubmissions != null) __obj.updateDynamic("SuccessfulSubmissions")(SuccessfulSubmissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopJobRunResponse]
  }
}

