package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpoint extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver endpoint.
    */
  var Arn: js.UndefOr[typings.awsSdk.route53resolverMod.Arn] = js.native
  /**
    * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * A unique string that identifies the request that created the resolver endpoint. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  /**
    * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:    INBOUND: allows DNS queries to your VPC from your network or another VPC    OUTBOUND: allows DNS queries from your VPC to your network or another VPC  
    */
  var Direction: js.UndefOr[ResolverEndpointDirection] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  var HostVPCId: js.UndefOr[ResourceId] = js.native
  /**
    * The ID of the resolver endpoint.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The number of IP addresses that the resolver endpoint can use for DNS queries.
    */
  var IpAddressCount: js.UndefOr[typings.awsSdk.route53resolverMod.IpAddressCount] = js.native
  /**
    * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * The name that you assigned to the resolver endpoint when you submitted a CreateResolverEndpoint request.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of one or more security groups that control access to this VPC. The security group must include one or more inbound resolver rules.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.route53resolverMod.SecurityGroupIds] = js.native
  /**
    * A code that specifies the current status of the resolver endpoint.
    */
  var Status: js.UndefOr[ResolverEndpointStatus] = js.native
  /**
    * A detailed description of the status of the resolver endpoint.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.native
}

object ResolverEndpoint {
  @scala.inline
  def apply(): ResolverEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverEndpoint]
  }
  @scala.inline
  implicit class ResolverEndpointOps[Self <: ResolverEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    @scala.inline
    def setDirection(value: ResolverEndpointDirection): Self = this.set("Direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("Direction", js.undefined)
    @scala.inline
    def setHostVPCId(value: ResourceId): Self = this.set("HostVPCId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostVPCId: Self = this.set("HostVPCId", js.undefined)
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setIpAddressCount(value: IpAddressCount): Self = this.set("IpAddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressCount: Self = this.set("IpAddressCount", js.undefined)
    @scala.inline
    def setModificationTime(value: Rfc3339TimeString): Self = this.set("ModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModificationTime: Self = this.set("ModificationTime", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: ResourceId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setStatus(value: ResolverEndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

