package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGatewayCapabilityConfigurationRequest extends js.Object {
  /**
    * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  /**
    * The ID of the gateway that defines the capability configuration.
    */
  var gatewayId: ID = js.native
}

object DescribeGatewayCapabilityConfigurationRequest {
  @scala.inline
  def apply(capabilityNamespace: CapabilityNamespace, gatewayId: ID): DescribeGatewayCapabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationRequest]
  }
}

