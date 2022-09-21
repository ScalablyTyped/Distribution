package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointConnection extends StObject {
  
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The DNS entries for the VPC endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The IP address type for the endpoint.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.ec2Mod.IpAddressType] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the network load balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the service to which the endpoint is connected.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC endpoint connection.
    */
  var VpcEndpointConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the VPC endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the VPC endpoint.
    */
  var VpcEndpointState: js.UndefOr[State] = js.undefined
}
object VpcEndpointConnection {
  
  inline def apply(): VpcEndpointConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnection]
  }
  
  extension [Self <: VpcEndpointConnection](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDnsEntries(value: DnsEntrySet): Self = StObject.set(x, "DnsEntries", value.asInstanceOf[js.Any])
    
    inline def setDnsEntriesUndefined: Self = StObject.set(x, "DnsEntries", js.undefined)
    
    inline def setDnsEntriesVarargs(value: DnsEntry*): Self = StObject.set(x, "DnsEntries", js.Array(value*))
    
    inline def setGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    inline def setGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value*))
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    inline def setNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value*))
    
    inline def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcEndpointConnectionId(value: String): Self = StObject.set(x, "VpcEndpointConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointConnectionIdUndefined: Self = StObject.set(x, "VpcEndpointConnectionId", js.undefined)
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcEndpointOwner(value: String): Self = StObject.set(x, "VpcEndpointOwner", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointOwnerUndefined: Self = StObject.set(x, "VpcEndpointOwner", js.undefined)
    
    inline def setVpcEndpointState(value: State): Self = StObject.set(x, "VpcEndpointState", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointStateUndefined: Self = StObject.set(x, "VpcEndpointState", js.undefined)
  }
}
