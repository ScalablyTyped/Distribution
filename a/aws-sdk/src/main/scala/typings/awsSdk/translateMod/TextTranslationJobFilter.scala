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
  def apply(): TextTranslationJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobFilter]
  }
  @scala.inline
  implicit class TextTranslationJobFilterOps[Self <: TextTranslationJobFilter] (val x: Self) extends AnyVal {
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
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    @scala.inline
    def setSubmittedAfterTime(value: Timestamp): Self = this.set("SubmittedAfterTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedAfterTime: Self = this.set("SubmittedAfterTime", js.undefined)
    @scala.inline
    def setSubmittedBeforeTime(value: Timestamp): Self = this.set("SubmittedBeforeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedBeforeTime: Self = this.set("SubmittedBeforeTime", js.undefined)
  }
  
}

