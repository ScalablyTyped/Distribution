package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDetail extends StObject {
  
  /**
    * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the service owner.
    */
  var Owner: js.UndefOr[String] = js.undefined
  
  /**
    * The payer responsibility.
    */
  var PayerResponsibility: js.UndefOr[typings.awsSdk.ec2Mod.PayerResponsibility] = js.undefined
  
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The verification state of the VPC endpoint service. Consumers of the endpoint service cannot use the private name when the state is not verified.
    */
  var PrivateDnsNameVerificationState: js.UndefOr[DnsNameState] = js.undefined
  
  /**
    * The private DNS names assigned to the VPC endpoint service.
    */
  var PrivateDnsNames: js.UndefOr[PrivateDnsDetailsSet] = js.undefined
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined
  
  /**
    * The supported IP address types.
    */
  var SupportedIpAddressTypes: js.UndefOr[typings.awsSdk.ec2Mod.SupportedIpAddressTypes] = js.undefined
  
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates whether the service supports endpoint policies.
    */
  var VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.undefined
}
object ServiceDetail {
  
  inline def apply(): ServiceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDetail]
  }
  
  extension [Self <: ServiceDetail](x: Self) {
    
    inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setAvailabilityZones(value: ValueStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBaseEndpointDnsNames(value: ValueStringList): Self = StObject.set(x, "BaseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    inline def setBaseEndpointDnsNamesUndefined: Self = StObject.set(x, "BaseEndpointDnsNames", js.undefined)
    
    inline def setBaseEndpointDnsNamesVarargs(value: String*): Self = StObject.set(x, "BaseEndpointDnsNames", js.Array(value*))
    
    inline def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "ManagesVpcEndpoints", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPayerResponsibility(value: PayerResponsibility): Self = StObject.set(x, "PayerResponsibility", value.asInstanceOf[js.Any])
    
    inline def setPayerResponsibilityUndefined: Self = StObject.set(x, "PayerResponsibility", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setPrivateDnsNameVerificationState(value: DnsNameState): Self = StObject.set(x, "PrivateDnsNameVerificationState", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameVerificationStateUndefined: Self = StObject.set(x, "PrivateDnsNameVerificationState", js.undefined)
    
    inline def setPrivateDnsNames(value: PrivateDnsDetailsSet): Self = StObject.set(x, "PrivateDnsNames", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNamesUndefined: Self = StObject.set(x, "PrivateDnsNames", js.undefined)
    
    inline def setPrivateDnsNamesVarargs(value: PrivateDnsDetails*): Self = StObject.set(x, "PrivateDnsNames", js.Array(value*))
    
    inline def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceType(value: ServiceTypeDetailSet): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: ServiceTypeDetail*): Self = StObject.set(x, "ServiceType", js.Array(value*))
    
    inline def setSupportedIpAddressTypes(value: SupportedIpAddressTypes): Self = StObject.set(x, "SupportedIpAddressTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedIpAddressTypesUndefined: Self = StObject.set(x, "SupportedIpAddressTypes", js.undefined)
    
    inline def setSupportedIpAddressTypesVarargs(value: ServiceConnectivityType*): Self = StObject.set(x, "SupportedIpAddressTypes", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcEndpointPolicySupported(value: Boolean): Self = StObject.set(x, "VpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointPolicySupportedUndefined: Self = StObject.set(x, "VpcEndpointPolicySupported", js.undefined)
  }
}
