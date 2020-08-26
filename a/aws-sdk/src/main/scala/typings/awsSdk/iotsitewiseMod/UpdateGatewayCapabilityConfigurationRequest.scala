package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayCapabilityConfigurationRequest extends js.Object {
  /**
    * The JSON document that defines the configuration for the gateway capability. For more information, see Configuring data sources (CLI) in the AWS IoT SiteWise User Guide.
    */
  var capabilityConfiguration: CapabilityConfiguration = js.native
  /**
    * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  /**
    * The ID of the gateway to be updated.
    */
  var gatewayId: ID = js.native
}

object UpdateGatewayCapabilityConfigurationRequest {
  @scala.inline
  def apply(
    capabilityConfiguration: CapabilityConfiguration,
    capabilityNamespace: CapabilityNamespace,
    gatewayId: ID
  ): UpdateGatewayCapabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(capabilityConfiguration = capabilityConfiguration.asInstanceOf[js.Any], capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayCapabilityConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateGatewayCapabilityConfigurationRequestOps[Self <: UpdateGatewayCapabilityConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
  }
  
}

