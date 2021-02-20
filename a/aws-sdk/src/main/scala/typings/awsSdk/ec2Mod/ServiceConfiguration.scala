package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceConfiguration extends StObject {
  
  /**
    * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * Information about the endpoint service private DNS name configuration.
    */
  var PrivateDnsNameConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.PrivateDnsNameConfiguration] = js.native
  
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  
  /**
    * The service state.
    */
  var ServiceState: js.UndefOr[typings.awsSdk.ec2Mod.ServiceState] = js.native
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ServiceConfiguration {
  
  @scala.inline
  def apply(): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConfiguration]
  }
  
  @scala.inline
  implicit class ServiceConfigurationMutableBuilder[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    @scala.inline
    def setAvailabilityZones(value: ValueStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setBaseEndpointDnsNames(value: ValueStringList): Self = StObject.set(x, "BaseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseEndpointDnsNamesUndefined: Self = StObject.set(x, "BaseEndpointDnsNames", js.undefined)
    
    @scala.inline
    def setBaseEndpointDnsNamesVarargs(value: String*): Self = StObject.set(x, "BaseEndpointDnsNames", js.Array(value :_*))
    
    @scala.inline
    def setGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "ManagesVpcEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameConfiguration(value: PrivateDnsNameConfiguration): Self = StObject.set(x, "PrivateDnsNameConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameConfigurationUndefined: Self = StObject.set(x, "PrivateDnsNameConfiguration", js.undefined)
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setServiceState(value: ServiceState): Self = StObject.set(x, "ServiceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceStateUndefined: Self = StObject.set(x, "ServiceState", js.undefined)
    
    @scala.inline
    def setServiceType(value: ServiceTypeDetailSet): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    @scala.inline
    def setServiceTypeVarargs(value: ServiceTypeDetail*): Self = StObject.set(x, "ServiceType", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
