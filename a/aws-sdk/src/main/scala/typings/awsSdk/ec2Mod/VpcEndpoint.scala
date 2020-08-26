package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpoint extends js.Object {
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  /**
    * (Interface endpoint) Information about the security groups that are associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.native
  /**
    * The last error that occurred for VPC endpoint.
    */
  var LastError: js.UndefOr[typings.awsSdk.ec2Mod.LastError] = js.native
  /**
    * (Interface endpoint) One or more network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the VPC endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  /**
    * (Gateway endpoint) One or more route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  var State: js.UndefOr[typings.awsSdk.ec2Mod.State] = js.native
  /**
    * (Interface endpoint) One or more subnets in which the endpoint is located.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * Any tags assigned to the VPC endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointType] = js.native
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcEndpoint {
  @scala.inline
  def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  @scala.inline
  implicit class VpcEndpointOps[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTimestamp(value: MillisecondDateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setDnsEntriesVarargs(value: DnsEntry*): Self = this.set("DnsEntries", js.Array(value :_*))
    @scala.inline
    def setDnsEntries(value: DnsEntrySet): Self = this.set("DnsEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsEntries: Self = this.set("DnsEntries", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupIdentifier*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: GroupIdentifierSet): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setLastError(value: LastError): Self = this.set("LastError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastError: Self = this.set("LastError", js.undefined)
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: String*): Self = this.set("NetworkInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaceIds(value: ValueStringList): Self = this.set("NetworkInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceIds: Self = this.set("NetworkInterfaceIds", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setPolicyDocument(value: String): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDocument: Self = this.set("PolicyDocument", js.undefined)
    @scala.inline
    def setPrivateDnsEnabled(value: Boolean): Self = this.set("PrivateDnsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsEnabled: Self = this.set("PrivateDnsEnabled", js.undefined)
    @scala.inline
    def setRequesterManaged(value: Boolean): Self = this.set("RequesterManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterManaged: Self = this.set("RequesterManaged", js.undefined)
    @scala.inline
    def setRouteTableIdsVarargs(value: String*): Self = this.set("RouteTableIds", js.Array(value :_*))
    @scala.inline
    def setRouteTableIds(value: ValueStringList): Self = this.set("RouteTableIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteTableIds: Self = this.set("RouteTableIds", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: ValueStringList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: String): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
    @scala.inline
    def setVpcEndpointType(value: VpcEndpointType): Self = this.set("VpcEndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointType: Self = this.set("VpcEndpointType", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

