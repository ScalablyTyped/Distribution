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
  @scala.inline
  implicit class DescribeGatewayCapabilityConfigurationRequestOps[Self <: DescribeGatewayCapabilityConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
  }
  
}

