package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

