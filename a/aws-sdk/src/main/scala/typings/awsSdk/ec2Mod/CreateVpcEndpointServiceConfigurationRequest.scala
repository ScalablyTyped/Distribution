package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicates whether requests from service consumers to create an endpoint to your service must be accepted. To accept a request, use AcceptVpcEndpointConnections.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
    */
  var NetworkLoadBalancerArns: ValueStringList = js.native
  /**
    * The private DNS name to assign to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The tags to associate with the service.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(NetworkLoadBalancerArns: ValueStringList): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(NetworkLoadBalancerArns = NetworkLoadBalancerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationRequestOps[Self <: CreateVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: String*): Self = this.set("NetworkLoadBalancerArns", js.Array(value :_*))
    @scala.inline
    def setNetworkLoadBalancerArns(value: ValueStringList): Self = this.set("NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptanceRequired(value: Boolean): Self = this.set("AcceptanceRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceRequired: Self = this.set("AcceptanceRequired", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

