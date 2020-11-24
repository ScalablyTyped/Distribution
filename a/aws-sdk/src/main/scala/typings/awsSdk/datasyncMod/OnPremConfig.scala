package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremConfig extends js.Object {
  
  /**
    * ARNs of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList = js.native
}
object OnPremConfig {
  
  @scala.inline
  def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremConfig]
  }
  
  @scala.inline
  implicit class OnPremConfigOps[Self <: OnPremConfig] (val x: Self) extends AnyVal {
    
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
    def setAgentArnsVarargs(value: AgentArn*): Self = this.set("AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = this.set("AgentArns", value.asInstanceOf[js.Any])
  }
}
