package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDetail extends StObject {
  
  /**
    * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
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
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS account ID of the service owner.
    */
  var Owner: js.UndefOr[String] = js.native
  
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The verification state of the VPC endpoint service. Consumers of the endpoint service cannot use the private name when the state is not verified.
    */
  var PrivateDnsNameVerificationState: js.UndefOr[DnsNameState] = js.native
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates whether the service supports endpoint policies.
    */
  var VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.native
}
object ServiceDetail {
  
  @scala.inline
  def apply(): ServiceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDetail]
  }
  
  @scala.inline
  implicit class ServiceDetailMutableBuilder[Self <: ServiceDetail] (val x: Self) extends AnyVal {
    
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
    def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "ManagesVpcEndpoints", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateDnsNameVerificationState(value: DnsNameState): Self = StObject.set(x, "PrivateDnsNameVerificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameVerificationStateUndefined: Self = StObject.set(x, "PrivateDnsNameVerificationState", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
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
    
    @scala.inline
    def setVpcEndpointPolicySupported(value: Boolean): Self = StObject.set(x, "VpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointPolicySupportedUndefined: Self = StObject.set(x, "VpcEndpointPolicySupported", js.undefined)
  }
}
