package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForJobsOutput extends js.Object {
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[JobList] = js.native
}

object PollForJobsOutput {
  @scala.inline
  def apply(): PollForJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForJobsOutput]
  }
  @scala.inline
  implicit class PollForJobsOutputOps[Self <: PollForJobsOutput] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: Job*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: JobList): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
  }
  
}

