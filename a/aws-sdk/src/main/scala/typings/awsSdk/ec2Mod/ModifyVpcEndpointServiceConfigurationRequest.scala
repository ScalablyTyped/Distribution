package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointServiceConfigurationRequest extends StObject {
  
  /**
    * Indicates whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
    */
  var AddGatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
    */
  var RemoveGatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
    */
  var RemovePrivateDnsName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId
}
object ModifyVpcEndpointServiceConfigurationRequest {
  
  inline def apply(ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
  
  extension [Self <: ModifyVpcEndpointServiceConfigurationRequest](x: Self) {
    
    inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setAddGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "AddGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setAddGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "AddGatewayLoadBalancerArns", js.undefined)
    
    inline def setAddGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "AddGatewayLoadBalancerArns", js.Array(value :_*))
    
    inline def setAddNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "AddNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setAddNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "AddNetworkLoadBalancerArns", js.undefined)
    
    inline def setAddNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "AddNetworkLoadBalancerArns", js.Array(value :_*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setRemoveGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setRemoveGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", js.undefined)
    
    inline def setRemoveGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "RemoveGatewayLoadBalancerArns", js.Array(value :_*))
    
    inline def setRemoveNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setRemoveNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", js.undefined)
    
    inline def setRemoveNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "RemoveNetworkLoadBalancerArns", js.Array(value :_*))
    
    inline def setRemovePrivateDnsName(value: Boolean): Self = StObject.set(x, "RemovePrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setRemovePrivateDnsNameUndefined: Self = StObject.set(x, "RemovePrivateDnsName", js.undefined)
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
