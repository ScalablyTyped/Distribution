package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentInfo extends js.Object {
  
  /**
    * The agent or connector ID.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  
  /**
    * Network details about the host where the agent or connector resides.
    */
  var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.native
  
  /**
    * Type of agent.
    */
  var agentType: js.UndefOr[String] = js.native
  
  /**
    * Status of the collection process for an agent or connector.
    */
  var collectionStatus: js.UndefOr[String] = js.native
  
  /**
    * The ID of the connector.
    */
  var connectorId: js.UndefOr[String] = js.native
  
  /**
    * The health of the agent or connector.
    */
  var health: js.UndefOr[AgentStatus] = js.native
  
  /**
    * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
    */
  var hostName: js.UndefOr[String] = js.native
  
  /**
    * Time since agent or connector health was reported.
    */
  var lastHealthPingTime: js.UndefOr[String] = js.native
  
  /**
    * Agent's first registration timestamp in UTC.
    */
  var registeredTime: js.UndefOr[String] = js.native
  
  /**
    * The agent or connector version.
    */
  var version: js.UndefOr[String] = js.native
}
object AgentInfo {
  
  @scala.inline
  def apply(): AgentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit class AgentInfoOps[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
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
    def setAgentId(value: AgentId): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
    
    @scala.inline
    def setAgentNetworkInfoListVarargs(value: AgentNetworkInfo*): Self = this.set("agentNetworkInfoList", js.Array(value :_*))
    
    @scala.inline
    def setAgentNetworkInfoList(value: AgentNetworkInfoList): Self = this.set("agentNetworkInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentNetworkInfoList: Self = this.set("agentNetworkInfoList", js.undefined)
    
    @scala.inline
    def setAgentType(value: String): Self = this.set("agentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentType: Self = this.set("agentType", js.undefined)
    
    @scala.inline
    def setCollectionStatus(value: String): Self = this.set("collectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionStatus: Self = this.set("collectionStatus", js.undefined)
    
    @scala.inline
    def setConnectorId(value: String): Self = this.set("connectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorId: Self = this.set("connectorId", js.undefined)
    
    @scala.inline
    def setHealth(value: AgentStatus): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostName: Self = this.set("hostName", js.undefined)
    
    @scala.inline
    def setLastHealthPingTime(value: String): Self = this.set("lastHealthPingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastHealthPingTime: Self = this.set("lastHealthPingTime", js.undefined)
    
    @scala.inline
    def setRegisteredTime(value: String): Self = this.set("registeredTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredTime: Self = this.set("registeredTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
