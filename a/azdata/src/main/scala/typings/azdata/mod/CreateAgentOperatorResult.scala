package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAgentOperatorResult extends ResultStatus {
  var operator: AgentOperatorInfo = js.native
}

object CreateAgentOperatorResult {
  @scala.inline
  def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): CreateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentOperatorResult]
  }
  @scala.inline
  implicit class CreateAgentOperatorResultOps[Self <: CreateAgentOperatorResult] (val x: Self) extends AnyVal {
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
    def setOperator(value: AgentOperatorInfo): Self = this.set("operator", value.asInstanceOf[js.Any])
  }
  
}

