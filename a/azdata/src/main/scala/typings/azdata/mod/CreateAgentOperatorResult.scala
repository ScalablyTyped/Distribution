package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentOperatorResult extends ResultStatus {
  var operator: AgentOperatorInfo
}

object CreateAgentOperatorResult {
  @scala.inline
  def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): CreateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentOperatorResult]
  }
}

