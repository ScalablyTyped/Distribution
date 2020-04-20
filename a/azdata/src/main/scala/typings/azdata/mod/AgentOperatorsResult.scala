package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOperatorsResult extends ResultStatus {
  var operators: js.Array[AgentOperatorInfo]
}

object AgentOperatorsResult {
  @scala.inline
  def apply(errorMessage: String, operators: js.Array[AgentOperatorInfo], success: Boolean): AgentOperatorsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorsResult]
  }
}

