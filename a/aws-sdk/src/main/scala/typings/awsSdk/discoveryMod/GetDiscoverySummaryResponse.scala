package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoverySummaryResponse extends StObject {
  
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
  implicit class GetDiscoverySummaryResponseMutableBuilder[Self <: GetDiscoverySummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentSummary(value: CustomerAgentInfo): Self = StObject.set(x, "agentSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentSummaryUndefined: Self = StObject.set(x, "agentSummary", js.undefined)
    
    @scala.inline
    def setApplications(value: Long): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setConnectorSummary(value: CustomerConnectorInfo): Self = StObject.set(x, "connectorSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorSummaryUndefined: Self = StObject.set(x, "connectorSummary", js.undefined)
    
    @scala.inline
    def setServers(value: Long): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersMappedToApplications(value: Long): Self = StObject.set(x, "serversMappedToApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersMappedToApplicationsUndefined: Self = StObject.set(x, "serversMappedToApplications", js.undefined)
    
    @scala.inline
    def setServersMappedtoTags(value: Long): Self = StObject.set(x, "serversMappedtoTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersMappedtoTagsUndefined: Self = StObject.set(x, "serversMappedtoTags", js.undefined)
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
  }
}
