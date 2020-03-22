package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentJobResult extends ResultStatus {
  var job: AgentJobInfo
}

object CreateAgentJobResult {
  @scala.inline
  def apply(errorMessage: String, job: AgentJobInfo, success: Boolean): CreateAgentJobResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentJobResult]
  }
}

