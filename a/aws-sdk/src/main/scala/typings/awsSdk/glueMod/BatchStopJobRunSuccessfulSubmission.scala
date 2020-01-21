package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunSuccessfulSubmission extends js.Object {
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object BatchStopJobRunSuccessfulSubmission {
  @scala.inline
  def apply(JobName: NameString = null, JobRunId: IdString = null): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobRunId != null) __obj.updateDynamic("JobRunId")(JobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
}

