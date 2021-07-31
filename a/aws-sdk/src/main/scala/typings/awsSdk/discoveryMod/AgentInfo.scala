package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentInfo extends StObject {
  
  /**
    * The agent or connector ID.
    */
  var agentId: js.UndefOr[AgentId] = js.undefined
  
  /**
    * Network details about the host where the agent or connector resides.
    */
  var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.undefined
  
  /**
    * Type of agent.
    */
  var agentType: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the collection process for an agent or connector.
    */
  var collectionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the connector.
    */
  var connectorId: js.UndefOr[String] = js.undefined
  
  /**
    * The health of the agent or connector.
    */
  var health: js.UndefOr[AgentStatus] = js.undefined
  
  /**
    * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
    */
  var hostName: js.UndefOr[String] = js.undefined
  
  /**
    * Time since agent or connector health was reported.
    */
  var lastHealthPingTime: js.UndefOr[String] = js.undefined
  
  /**
    * Agent's first registration timestamp in UTC.
    */
  var registeredTime: js.UndefOr[String] = js.undefined
  
  /**
    * The agent or connector version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object AgentInfo {
  
  @scala.inline
  def apply(): AgentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit class AgentInfoMutableBuilder[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    @scala.inline
    def setAgentNetworkInfoList(value: AgentNetworkInfoList): Self = StObject.set(x, "agentNetworkInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentNetworkInfoListUndefined: Self = StObject.set(x, "agentNetworkInfoList", js.undefined)
    
    @scala.inline
    def setAgentNetworkInfoListVarargs(value: AgentNetworkInfo*): Self = StObject.set(x, "agentNetworkInfoList", js.Array(value :_*))
    
    @scala.inline
    def setAgentType(value: String): Self = StObject.set(x, "agentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentTypeUndefined: Self = StObject.set(x, "agentType", js.undefined)
    
    @scala.inline
    def setCollectionStatus(value: String): Self = StObject.set(x, "collectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionStatusUndefined: Self = StObject.set(x, "collectionStatus", js.undefined)
    
    @scala.inline
    def setConnectorId(value: String): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorIdUndefined: Self = StObject.set(x, "connectorId", js.undefined)
    
    @scala.inline
    def setHealth(value: AgentStatus): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    @scala.inline
    def setLastHealthPingTime(value: String): Self = StObject.set(x, "lastHealthPingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHealthPingTimeUndefined: Self = StObject.set(x, "lastHealthPingTime", js.undefined)
    
    @scala.inline
    def setRegisteredTime(value: String): Self = StObject.set(x, "registeredTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredTimeUndefined: Self = StObject.set(x, "registeredTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
