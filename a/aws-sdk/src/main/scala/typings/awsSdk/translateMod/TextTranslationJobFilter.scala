package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTranslationJobFilter extends js.Object {
  /**
    * Filters the list of jobs by name.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  /**
    * Filters the list of jobs based by job status.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmittedAfterTime: js.UndefOr[Timestamp] = js.native
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmittedBeforeTime: js.UndefOr[Timestamp] = js.native
}

object TextTranslationJobFilter {
  @scala.inline
  def apply(
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    SubmittedAfterTime: Timestamp = null,
    SubmittedBeforeTime: Timestamp = null
  ): TextTranslationJobFilter = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (SubmittedAfterTime != null) __obj.updateDynamic("SubmittedAfterTime")(SubmittedAfterTime.asInstanceOf[js.Any])
    if (SubmittedBeforeTime != null) __obj.updateDynamic("SubmittedBeforeTime")(SubmittedBeforeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTranslationJobFilter]
  }
}

