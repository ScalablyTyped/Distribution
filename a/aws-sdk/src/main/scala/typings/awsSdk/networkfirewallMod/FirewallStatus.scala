package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallStatus extends StObject {
  
  /**
    * The configuration sync state for the firewall. This summarizes the sync states reported in the Config settings for all of the Availability Zones where you have configured the firewall.  When you create a firewall or update its configuration, for example by adding a rule group to its firewall policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This summary indicates whether the configuration changes have been applied everywhere.  This status must be IN_SYNC for the firewall to be ready for use, but it doesn't indicate that the firewall is ready. The Status setting indicates firewall readiness.
    */
  var ConfigurationSyncStateSummary: ConfigurationSyncState
  
  /**
    * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where you've configured it. This setting is READY only when the ConfigurationSyncStateSummary value is IN_SYNC and the Attachment Status values for all of the configured subnets are READY. 
    */
  var Status: FirewallStatusValue
  
  /**
    * The subnets that you've configured for use by the Network Firewall firewall. This contains one array element per Availability Zone where you've configured a subnet. These objects provide details of the information that is summarized in the ConfigurationSyncStateSummary and Status, broken down by zone and configuration object. 
    */
  var SyncStates: js.UndefOr[typings.awsSdk.networkfirewallMod.SyncStates] = js.undefined
}
object FirewallStatus {
  
  inline def apply(ConfigurationSyncStateSummary: ConfigurationSyncState, Status: FirewallStatusValue): FirewallStatus = {
    val __obj = js.Dynamic.literal(ConfigurationSyncStateSummary = ConfigurationSyncStateSummary.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallStatus]
  }
  
  extension [Self <: FirewallStatus](x: Self) {
    
    inline def setConfigurationSyncStateSummary(value: ConfigurationSyncState): Self = StObject.set(x, "ConfigurationSyncStateSummary", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FirewallStatusValue): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSyncStates(value: SyncStates): Self = StObject.set(x, "SyncStates", value.asInstanceOf[js.Any])
    
    inline def setSyncStatesUndefined: Self = StObject.set(x, "SyncStates", js.undefined)
  }
}
