package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOperatorsResult extends ResultStatus {
  var operators: js.Array[AgentOperatorInfo] = js.native
}

object AgentOperatorsResult {
  @scala.inline
  def apply(errorMessage: String, operators: js.Array[AgentOperatorInfo], success: Boolean): AgentOperatorsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorsResult]
  }
  @scala.inline
  implicit class AgentOperatorsResultOps[Self <: AgentOperatorsResult] (val x: Self) extends AnyVal {
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
    def setOperatorsVarargs(value: AgentOperatorInfo*): Self = this.set("operators", js.Array(value :_*))
    @scala.inline
    def setOperators(value: js.Array[AgentOperatorInfo]): Self = this.set("operators", value.asInstanceOf[js.Any])
  }
  
}

