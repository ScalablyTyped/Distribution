package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayCapabilityConfigurationResponse extends StObject {
  
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
  implicit class UpdateGatewayCapabilityConfigurationResponseMutableBuilder[Self <: UpdateGatewayCapabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = StObject.set(x, "capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitySyncStatus(value: CapabilitySyncStatus): Self = StObject.set(x, "capabilitySyncStatus", value.asInstanceOf[js.Any])
  }
}
