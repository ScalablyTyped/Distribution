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
}

