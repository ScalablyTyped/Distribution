package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAgentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent. Use the ListAgents operation to return a list of agents for your account and AWS Region.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.datasyncMod.AgentArn] = js.native
}

object CreateAgentResponse {
  @scala.inline
  def apply(): CreateAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAgentResponse]
  }
  @scala.inline
  implicit class CreateAgentResponseOps[Self <: CreateAgentResponse] (val x: Self) extends AnyVal {
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
    def setAgentArn(value: AgentArn): Self = this.set("AgentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentArn: Self = this.set("AgentArn", js.undefined)
  }
  
}

