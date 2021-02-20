package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointServiceConfigurationRequest extends StObject {
  
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
    * The Amazon Resource Names (ARNs) of one or more Gateway Load Balancers.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * (Interface endpoint configuration) The private DNS name to assign to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The tags to associate with the service.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateVpcEndpointServiceConfigurationRequest {
  
  @scala.inline
  def apply(): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationRequestMutableBuilder[Self <: CreateVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
