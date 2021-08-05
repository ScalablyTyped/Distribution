package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverEndpoint extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the Resolver endpoint.
    */
  var Arn: js.UndefOr[typings.awsSdk.route53resolverMod.Arn] = js.undefined
  
  /**
    * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string that identifies the request that created the Resolver endpoint. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.route53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:    INBOUND: allows DNS queries to your VPC from your network    OUTBOUND: allows DNS queries from your VPC to your network  
    */
  var Direction: js.UndefOr[ResolverEndpointDirection] = js.undefined
  
  /**
    * The ID of the VPC that you want to create the Resolver endpoint in.
    */
  var HostVPCId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the Resolver endpoint.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The number of IP addresses that the Resolver endpoint can use for DNS queries.
    */
  var IpAddressCount: js.UndefOr[typings.awsSdk.route53resolverMod.IpAddressCount] = js.undefined
  
  /**
    * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * The name that you assigned to the Resolver endpoint when you submitted a CreateResolverEndpoint request.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The ID of one or more security groups that control access to this VPC. The security group must include one or more inbound rules (for inbound endpoints) or outbound rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For inbound access, open port 53. For outbound access, open the port that you're using for DNS queries on your network.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.route53resolverMod.SecurityGroupIds] = js.undefined
  
  /**
    * A code that specifies the current status of the Resolver endpoint. Valid values include the following:    CREATING: Resolver is creating and configuring one or more Amazon VPC network interfaces for this endpoint.    OPERATIONAL: The Amazon VPC network interfaces for this endpoint are correctly configured and able to pass inbound or outbound DNS queries between your network and Resolver.    UPDATING: Resolver is associating or disassociating one or more network interfaces with this endpoint.    AUTO_RECOVERING: Resolver is trying to recover one or more of the network interfaces that are associated with this endpoint. During the recovery process, the endpoint functions with limited capacity because of the limit on the number of DNS queries per IP address (per network interface). For the current limit, see Limits on Route 53 Resolver.    ACTION_NEEDED: This endpoint is unhealthy, and Resolver can't automatically recover it. To resolve the problem, we recommend that you check each IP address that you associated with the endpoint. For each IP address that isn't available, add another IP address and then delete the IP address that isn't available. (An endpoint must always include at least two IP addresses.) A status of ACTION_NEEDED can have a variety of causes. Here are two common causes:   One or more of the network interfaces that are associated with the endpoint were deleted using Amazon VPC.   The network interface couldn't be created for some reason that's outside the control of Resolver.      DELETING: Resolver is deleting this endpoint and the associated network interfaces.  
    */
  var Status: js.UndefOr[ResolverEndpointStatus] = js.undefined
  
  /**
    * A detailed description of the status of the Resolver endpoint.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.undefined
}
object ResolverEndpoint {
  
  inline def apply(): ResolverEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverEndpoint]
  }
  
  extension [Self <: ResolverEndpoint](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDirection(value: ResolverEndpointDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setHostVPCId(value: ResourceId): Self = StObject.set(x, "HostVPCId", value.asInstanceOf[js.Any])
    
    inline def setHostVPCIdUndefined: Self = StObject.set(x, "HostVPCId", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIpAddressCount(value: IpAddressCount): Self = StObject.set(x, "IpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpAddressCountUndefined: Self = StObject.set(x, "IpAddressCount", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: ResourceId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    inline def setStatus(value: ResolverEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
