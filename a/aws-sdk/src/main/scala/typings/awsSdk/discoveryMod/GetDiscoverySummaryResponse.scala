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
  def apply(): GetDiscoverySummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoverySummaryResponse]
  }
  @scala.inline
  implicit class GetDiscoverySummaryResponseOps[Self <: GetDiscoverySummaryResponse] (val x: Self) extends AnyVal {
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
    def setAgentSummary(value: CustomerAgentInfo): Self = this.set("agentSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentSummary: Self = this.set("agentSummary", js.undefined)
    @scala.inline
    def setApplications(value: Long): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setConnectorSummary(value: CustomerConnectorInfo): Self = this.set("connectorSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorSummary: Self = this.set("connectorSummary", js.undefined)
    @scala.inline
    def setServers(value: Long): Self = this.set("servers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    @scala.inline
    def setServersMappedToApplications(value: Long): Self = this.set("serversMappedToApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServersMappedToApplications: Self = this.set("serversMappedToApplications", js.undefined)
    @scala.inline
    def setServersMappedtoTags(value: Long): Self = this.set("serversMappedtoTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServersMappedtoTags: Self = this.set("serversMappedtoTags", js.undefined)
  }
  
}

