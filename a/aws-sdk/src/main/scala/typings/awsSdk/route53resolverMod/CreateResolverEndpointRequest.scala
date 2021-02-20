package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResolverEndpointRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.route53resolverMod.CreatorRequestId = js.native
  
  /**
    * Specify the applicable value:    INBOUND: Resolver forwards DNS queries to the DNS service for a VPC from your network    OUTBOUND: Resolver forwards DNS queries from the DNS service for a VPC to your network  
    */
  var Direction: ResolverEndpointDirection = js.native
  
  /**
    * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). The subnet ID uniquely identifies a VPC. 
    */
  var IpAddresses: IpAddressesRequest = js.native
  
  /**
    * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC. The security group that you specify must include one or more inbound rules (for inbound Resolver endpoints) or outbound rules (for outbound Resolver endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open port 53. For outbound access, open the port that you're using for DNS queries on your network.
    */
  var SecurityGroupIds: typings.awsSdk.route53resolverMod.SecurityGroupIds = js.native
  
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateResolverEndpointRequest {
  
  @scala.inline
  def apply(
    CreatorRequestId: CreatorRequestId,
    Direction: ResolverEndpointDirection,
    IpAddresses: IpAddressesRequest,
    SecurityGroupIds: SecurityGroupIds
  ): CreateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], IpAddresses = IpAddresses.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverEndpointRequest]
  }
  
  @scala.inline
  implicit class CreateResolverEndpointRequestMutableBuilder[Self <: CreateResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: ResolverEndpointDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddresses(value: IpAddressesRequest): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesVarargs(value: IpAddressRequest*): Self = StObject.set(x, "IpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: ResourceId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
