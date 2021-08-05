package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDataCollectionByAgentIdsRequest extends StObject {
  
  /**
    * The IDs of the agents or connectors from which to stop collecting data.
    */
  var agentIds: AgentIds
}
object StopDataCollectionByAgentIdsRequest {
  
  inline def apply(agentIds: AgentIds): StopDataCollectionByAgentIdsRequest = {
    val __obj = js.Dynamic.literal(agentIds = agentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDataCollectionByAgentIdsRequest]
  }
  
  extension [Self <: StopDataCollectionByAgentIdsRequest](x: Self) {
    
    inline def setAgentIds(value: AgentIds): Self = StObject.set(x, "agentIds", value.asInstanceOf[js.Any])
    
    inline def setAgentIdsVarargs(value: AgentId*): Self = StObject.set(x, "agentIds", js.Array(value :_*))
  }
}
