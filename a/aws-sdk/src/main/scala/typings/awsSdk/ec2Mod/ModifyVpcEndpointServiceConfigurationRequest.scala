package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointServiceConfigurationRequest extends StObject {
  
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
  implicit class ModifyVpcEndpointServiceConfigurationRequestMutableBuilder[Self <: ModifyVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    @scala.inline
    def setAddGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "AddGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "AddGatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setAddGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "AddGatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setAddNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "AddNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "AddNetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setAddNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "AddNetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setRemoveGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setRemoveGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setRemoveNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setRemoveNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setRemovePrivateDnsName(value: Boolean): Self = StObject.set(x, "RemovePrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePrivateDnsNameUndefined: Self = StObject.set(x, "RemovePrivateDnsName", js.undefined)
    
    @scala.inline
    def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
