package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
  
  /**
    * Indicates whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
    */
  var AddGatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
    */
  var RemoveGatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
    */
  var RemovePrivateDnsName: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
}
object ModifyVpcEndpointServiceConfigurationRequest {
  
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
  
  @scala.inline
  implicit class ModifyVpcEndpointServiceConfigurationRequestOps[Self <: ModifyVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setServiceId(value: VpcEndpointServiceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceRequired(value: Boolean): Self = this.set("AcceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptanceRequired: Self = this.set("AcceptanceRequired", js.undefined)
    
    @scala.inline
    def setAddGatewayLoadBalancerArnsVarargs(value: String*): Self = this.set("AddGatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setAddGatewayLoadBalancerArns(value: ValueStringList): Self = this.set("AddGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddGatewayLoadBalancerArns: Self = this.set("AddGatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setAddNetworkLoadBalancerArnsVarargs(value: String*): Self = this.set("AddNetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setAddNetworkLoadBalancerArns(value: ValueStringList): Self = this.set("AddNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNetworkLoadBalancerArns: Self = this.set("AddNetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    
    @scala.inline
    def setRemoveGatewayLoadBalancerArnsVarargs(value: String*): Self = this.set("RemoveGatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setRemoveGatewayLoadBalancerArns(value: ValueStringList): Self = this.set("RemoveGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveGatewayLoadBalancerArns: Self = this.set("RemoveGatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setRemoveNetworkLoadBalancerArnsVarargs(value: String*): Self = this.set("RemoveNetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setRemoveNetworkLoadBalancerArns(value: ValueStringList): Self = this.set("RemoveNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveNetworkLoadBalancerArns: Self = this.set("RemoveNetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setRemovePrivateDnsName(value: Boolean): Self = this.set("RemovePrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovePrivateDnsName: Self = this.set("RemovePrivateDnsName", js.undefined)
  }
}
