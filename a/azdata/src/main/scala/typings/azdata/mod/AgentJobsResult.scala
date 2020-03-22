package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobsResult extends ResultStatus {
  var jobs: js.Array[AgentJobInfo]
}

object AgentJobsResult {
  @scala.inline
  def apply(errorMessage: String, jobs: js.Array[AgentJobInfo], success: Boolean): AgentJobsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentJobsResult]
  }
}

