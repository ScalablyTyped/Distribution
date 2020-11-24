package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDataCollectionByAgentIdsResponse extends js.Object {
  
  /**
    * Information about the agents or connector that were instructed to stop collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.native
}
object StopDataCollectionByAgentIdsResponse {
  
  @scala.inline
  def apply(): StopDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDataCollectionByAgentIdsResponse]
  }
  
  @scala.inline
  implicit class StopDataCollectionByAgentIdsResponseOps[Self <: StopDataCollectionByAgentIdsResponse] (val x: Self) extends AnyVal {
    
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
    def setAgentsConfigurationStatusVarargs(value: AgentConfigurationStatus*): Self = this.set("agentsConfigurationStatus", js.Array(value :_*))
    
    @scala.inline
    def setAgentsConfigurationStatus(value: AgentConfigurationStatusList): Self = this.set("agentsConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentsConfigurationStatus: Self = this.set("agentsConfigurationStatus", js.undefined)
  }
}
