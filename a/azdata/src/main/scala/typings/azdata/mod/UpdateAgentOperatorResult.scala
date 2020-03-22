package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentOperatorResult extends ResultStatus {
  var operator: AgentOperatorInfo
}

object UpdateAgentOperatorResult {
  @scala.inline
  def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): UpdateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAgentOperatorResult]
  }
}

