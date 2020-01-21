package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    agentId: AgentId = null,
    agentNetworkInfoList: AgentNetworkInfoList = null,
    agentType: String = null,
    collectionStatus: String = null,
    connectorId: String = null,
    health: AgentStatus = null,
    hostName: String = null,
    lastHealthPingTime: String = null,
    registeredTime: String = null,
    version: String = null
  ): AgentInfo = {
    val __obj = js.Dynamic.literal()
    if (agentId != null) __obj.updateDynamic("agentId")(agentId.asInstanceOf[js.Any])
    if (agentNetworkInfoList != null) __obj.updateDynamic("agentNetworkInfoList")(agentNetworkInfoList.asInstanceOf[js.Any])
    if (agentType != null) __obj.updateDynamic("agentType")(agentType.asInstanceOf[js.Any])
    if (collectionStatus != null) __obj.updateDynamic("collectionStatus")(collectionStatus.asInstanceOf[js.Any])
    if (connectorId != null) __obj.updateDynamic("connectorId")(connectorId.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (hostName != null) __obj.updateDynamic("hostName")(hostName.asInstanceOf[js.Any])
    if (lastHealthPingTime != null) __obj.updateDynamic("lastHealthPingTime")(lastHealthPingTime.asInstanceOf[js.Any])
    if (registeredTime != null) __obj.updateDynamic("registeredTime")(registeredTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentInfo]
  }
}

