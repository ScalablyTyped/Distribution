package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDataCollectionByAgentIdsResponse extends StObject {
  
  /**
    * Information about agents or the connector that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.native
}
object StartDataCollectionByAgentIdsResponse {
  
  @scala.inline
  def apply(): StartDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataCollectionByAgentIdsResponse]
  }
  
  @scala.inline
  implicit class StartDataCollectionByAgentIdsResponseMutableBuilder[Self <: StartDataCollectionByAgentIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentsConfigurationStatus(value: AgentConfigurationStatusList): Self = StObject.set(x, "agentsConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsConfigurationStatusUndefined: Self = StObject.set(x, "agentsConfigurationStatus", js.undefined)
    
    @scala.inline
    def setAgentsConfigurationStatusVarargs(value: AgentConfigurationStatus*): Self = StObject.set(x, "agentsConfigurationStatus", js.Array(value :_*))
  }
}
