package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobsResult extends ResultStatus {
  var jobs: js.Array[AgentJobInfo] = js.native
}

object AgentJobsResult {
  @scala.inline
  def apply(errorMessage: String, jobs: js.Array[AgentJobInfo], success: Boolean): AgentJobsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobsResult]
  }
  @scala.inline
  implicit class AgentJobsResultOps[Self <: AgentJobsResult] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: AgentJobInfo*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: js.Array[AgentJobInfo]): Self = this.set("jobs", value.asInstanceOf[js.Any])
  }
  
}

