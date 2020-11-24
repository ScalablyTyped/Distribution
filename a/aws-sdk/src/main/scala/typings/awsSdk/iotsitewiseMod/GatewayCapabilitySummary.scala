package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayCapabilitySummary extends js.Object {
  
  /**
    * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  
  /**
    * The synchronization status of the capability configuration. The sync status can be one of the following:    IN_SYNC – The gateway is running the capability configuration.    OUT_OF_SYNC – The gateway hasn't received the capability configuration.    SYNC_FAILED – The gateway rejected the capability configuration.  
    */
  var capabilitySyncStatus: CapabilitySyncStatus = js.native
}
object GatewayCapabilitySummary {
  
  @scala.inline
  def apply(capabilityNamespace: CapabilityNamespace, capabilitySyncStatus: CapabilitySyncStatus): GatewayCapabilitySummary = {
    val __obj = js.Dynamic.literal(capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], capabilitySyncStatus = capabilitySyncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayCapabilitySummary]
  }
  
  @scala.inline
  implicit class GatewayCapabilitySummaryOps[Self <: GatewayCapabilitySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = this.set("capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitySyncStatus(value: CapabilitySyncStatus): Self = this.set("capabilitySyncStatus", value.asInstanceOf[js.Any])
  }
}
