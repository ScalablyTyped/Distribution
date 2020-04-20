package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentJobResult extends ResultStatus {
  var job: AgentJobInfo
}

object UpdateAgentJobResult {
  @scala.inline
  def apply(errorMessage: String, job: AgentJobInfo, success: Boolean): UpdateAgentJobResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentJobResult]
  }
}

