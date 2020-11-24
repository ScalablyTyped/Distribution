package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGatewayCapabilityConfigurationResponse extends js.Object {
  
  /**
    * The JSON document that defines the gateway capability's configuration. For more information, see Configuring data sources (CLI) in the AWS IoT SiteWise User Guide.
    */
  var capabilityConfiguration: CapabilityConfiguration = js.native
  
  /**
    * The namespace of the gateway capability.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  
  /**
    * The synchronization status of the capability configuration. The sync status can be one of the following:    IN_SYNC – The gateway is running the capability configuration.    OUT_OF_SYNC – The gateway hasn't received the capability configuration.    SYNC_FAILED – The gateway rejected the capability configuration.  
    */
  var capabilitySyncStatus: CapabilitySyncStatus = js.native
  
  /**
    * The ID of the gateway that defines the capability configuration.
    */
  var gatewayId: ID = js.native
}
object DescribeGatewayCapabilityConfigurationResponse {
  
  @scala.inline
  def apply(
    capabilityConfiguration: CapabilityConfiguration,
    capabilityNamespace: CapabilityNamespace,
    capabilitySyncStatus: CapabilitySyncStatus,
    gatewayId: ID
  ): DescribeGatewayCapabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(capabilityConfiguration = capabilityConfiguration.asInstanceOf[js.Any], capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], capabilitySyncStatus = capabilitySyncStatus.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeGatewayCapabilityConfigurationResponseOps[Self <: DescribeGatewayCapabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setCapabilityConfiguration(value: CapabilityConfiguration): Self = this.set("capabilityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = this.set("capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitySyncStatus(value: CapabilitySyncStatus): Self = this.set("capabilitySyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
  }
}
