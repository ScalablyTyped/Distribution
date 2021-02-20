package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointConnection extends StObject {
  
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The DNS entries for the VPC endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the network load balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the service to which the endpoint is connected.
    */
  var ServiceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the owner of the VPC endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.native
  
  /**
    * The state of the VPC endpoint.
    */
  var VpcEndpointState: js.UndefOr[State] = js.native
}
object VpcEndpointConnection {
  
  @scala.inline
  def apply(): VpcEndpointConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnection]
  }
  
  @scala.inline
  implicit class VpcEndpointConnectionMutableBuilder[Self <: VpcEndpointConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: MillisecondDateTime): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDnsEntries(value: DnsEntrySet): Self = StObject.set(x, "DnsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsEntriesUndefined: Self = StObject.set(x, "DnsEntries", js.undefined)
    
    @scala.inline
    def setDnsEntriesVarargs(value: DnsEntry*): Self = StObject.set(x, "DnsEntries", js.Array(value :_*))
    
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
    def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcEndpointOwner(value: String): Self = StObject.set(x, "VpcEndpointOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointOwnerUndefined: Self = StObject.set(x, "VpcEndpointOwner", js.undefined)
    
    @scala.inline
    def setVpcEndpointState(value: State): Self = StObject.set(x, "VpcEndpointState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointStateUndefined: Self = StObject.set(x, "VpcEndpointState", js.undefined)
  }
}
