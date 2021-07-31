package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDataCollectionByAgentIdsResponse extends StObject {
  
  /**
    * Information about the agents or connector that were instructed to stop collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
}
object StopDataCollectionByAgentIdsResponse {
  
  @scala.inline
  def apply(): StopDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDataCollectionByAgentIdsResponse]
  }
  
  @scala.inline
  implicit class StopDataCollectionByAgentIdsResponseMutableBuilder[Self <: StopDataCollectionByAgentIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentsConfigurationStatus(value: AgentConfigurationStatusList): Self = StObject.set(x, "agentsConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsConfigurationStatusUndefined: Self = StObject.set(x, "agentsConfigurationStatus", js.undefined)
    
    @scala.inline
    def setAgentsConfigurationStatusVarargs(value: AgentConfigurationStatus*): Self = StObject.set(x, "agentsConfigurationStatus", js.Array(value :_*))
  }
}
