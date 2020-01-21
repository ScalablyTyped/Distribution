package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTextTranslationJobResponse extends js.Object {
  /**
    * The job ID of the stopped batch translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.native
  /**
    * The status of the designated job. Upon successful completion, the job's status will be STOPPED.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
}

object StopTextTranslationJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StopTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTextTranslationJobResponse]
  }
}

