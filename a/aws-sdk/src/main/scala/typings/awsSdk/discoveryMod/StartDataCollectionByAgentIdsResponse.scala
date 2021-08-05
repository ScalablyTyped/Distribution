package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataCollectionByAgentIdsResponse extends StObject {
  
  /**
    * Information about agents or the connector that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
}
object StartDataCollectionByAgentIdsResponse {
  
  inline def apply(): StartDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataCollectionByAgentIdsResponse]
  }
  
  extension [Self <: StartDataCollectionByAgentIdsResponse](x: Self) {
    
    inline def setAgentsConfigurationStatus(value: AgentConfigurationStatusList): Self = StObject.set(x, "agentsConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setAgentsConfigurationStatusUndefined: Self = StObject.set(x, "agentsConfigurationStatus", js.undefined)
    
    inline def setAgentsConfigurationStatusVarargs(value: AgentConfigurationStatus*): Self = StObject.set(x, "agentsConfigurationStatus", js.Array(value :_*))
  }
}
