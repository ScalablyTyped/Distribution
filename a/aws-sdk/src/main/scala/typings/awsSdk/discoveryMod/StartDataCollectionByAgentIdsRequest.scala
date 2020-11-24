package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDataCollectionByAgentIdsRequest extends js.Object {
  
  /**
    * The IDs of the agents or connectors from which to start collecting data. If you send a request to an agent/connector ID that you do not have permission to contact, according to your AWS account, the service does not throw an exception. Instead, it returns the error in the Description field. If you send a request to multiple agents/connectors and you do not have permission to contact some of those agents/connectors, the system does not throw an exception. Instead, the system shows Failed in the Description field.
    */
  var agentIds: AgentIds = js.native
}
object StartDataCollectionByAgentIdsRequest {
  
  @scala.inline
  def apply(agentIds: AgentIds): StartDataCollectionByAgentIdsRequest = {
    val __obj = js.Dynamic.literal(agentIds = agentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataCollectionByAgentIdsRequest]
  }
  
  @scala.inline
  implicit class StartDataCollectionByAgentIdsRequestOps[Self <: StartDataCollectionByAgentIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentIdsVarargs(value: AgentId*): Self = this.set("agentIds", js.Array(value :_*))
    
    @scala.inline
    def setAgentIds(value: AgentIds): Self = this.set("agentIds", value.asInstanceOf[js.Any])
  }
}
