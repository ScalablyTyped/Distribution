package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayCapabilityConfigurationResponse extends js.Object {
  
  /**
    * The namespace of the gateway capability.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  
  /**
    * The synchronization status of the capability configuration. The sync status can be one of the following:    IN_SYNC – The gateway is running the capability configuration.    OUT_OF_SYNC – The gateway hasn't received the capability configuration.    SYNC_FAILED – The gateway rejected the capability configuration.   After you update a capability configuration, its sync status is OUT_OF_SYNC until the gateway receives and applies or rejects the updated configuration.
    */
  var capabilitySyncStatus: CapabilitySyncStatus = js.native
}
object UpdateGatewayCapabilityConfigurationResponse {
  
  @scala.inline
  def apply(capabilityNamespace: CapabilityNamespace, capabilitySyncStatus: CapabilitySyncStatus): UpdateGatewayCapabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], capabilitySyncStatus = capabilitySyncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayCapabilityConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateGatewayCapabilityConfigurationResponseOps[Self <: UpdateGatewayCapabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
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
