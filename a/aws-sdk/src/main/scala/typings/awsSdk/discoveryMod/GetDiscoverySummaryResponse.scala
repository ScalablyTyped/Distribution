package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoverySummaryResponse extends js.Object {
  /**
    * Details about discovered agents, including agent status and health.
    */
  var agentSummary: js.UndefOr[CustomerAgentInfo] = js.native
  /**
    * The number of applications discovered.
    */
  var applications: js.UndefOr[Long] = js.native
  /**
    * Details about discovered connectors, including connector status and health.
    */
  var connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.native
  /**
    * The number of servers discovered.
    */
  var servers: js.UndefOr[Long] = js.native
  /**
    * The number of servers mapped to applications.
    */
  var serversMappedToApplications: js.UndefOr[Long] = js.native
  /**
    * The number of servers mapped to tags.
    */
  var serversMappedtoTags: js.UndefOr[Long] = js.native
}

object GetDiscoverySummaryResponse {
  @scala.inline
  def apply(
    agentSummary: CustomerAgentInfo = null,
    applications: js.UndefOr[Long] = js.undefined,
    connectorSummary: CustomerConnectorInfo = null,
    servers: js.UndefOr[Long] = js.undefined,
    serversMappedToApplications: js.UndefOr[Long] = js.undefined,
    serversMappedtoTags: js.UndefOr[Long] = js.undefined
  ): GetDiscoverySummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (agentSummary != null) __obj.updateDynamic("agentSummary")(agentSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(applications)) __obj.updateDynamic("applications")(applications.get.asInstanceOf[js.Any])
    if (connectorSummary != null) __obj.updateDynamic("connectorSummary")(connectorSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(servers)) __obj.updateDynamic("servers")(servers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serversMappedToApplications)) __obj.updateDynamic("serversMappedToApplications")(serversMappedToApplications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serversMappedtoTags)) __obj.updateDynamic("serversMappedtoTags")(serversMappedtoTags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoverySummaryResponse]
  }
}

