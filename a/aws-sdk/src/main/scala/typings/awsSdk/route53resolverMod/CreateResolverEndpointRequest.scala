package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverEndpointRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.route53resolverMod.CreatorRequestId = js.native
  /**
    * Specify the applicable value:    INBOUND: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC    OUTBOUND: Resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC  
    */
  var Direction: ResolverEndpointDirection = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver endpoints). 
    */
  var IpAddresses: IpAddressesRequest = js.native
  /**
    * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC. The security group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for outbound resolver endpoints).
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
    SecurityGroupIds: SecurityGroupIds,
    Name: Name = null,
    Tags: TagList = null
  ): CreateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], IpAddresses = IpAddresses.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverEndpointRequest]
  }
}

