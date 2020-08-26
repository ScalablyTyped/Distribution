package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAgentProxyResult extends ResultStatus {
  var proxy: AgentProxyInfo = js.native
  var step: AgentJobStepInfo = js.native
}

object UpdateAgentProxyResult {
  @scala.inline
  def apply(errorMessage: String, proxy: AgentProxyInfo, step: AgentJobStepInfo, success: Boolean): UpdateAgentProxyResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentProxyResult]
  }
  @scala.inline
  implicit class UpdateAgentProxyResultOps[Self <: UpdateAgentProxyResult] (val x: Self) extends AnyVal {
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
    def setProxy(value: AgentProxyInfo): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: AgentJobStepInfo): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

