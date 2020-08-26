package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.native
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.native
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.native
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[LoaIssueTime] = js.native
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.native
  /**
    * The ID of the AWS account that owns the connection.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The name of the AWS Direct Connect service provider associated with the connection.
    */
  var partnerName: js.UndefOr[PartnerName] = js.native
  /**
    * The name of the service provider associated with the connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def setAwsDevice(value: AwsDevice): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = this.set("awsDeviceV2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDeviceV2: Self = this.set("awsDeviceV2", js.undefined)
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
    @scala.inline
    def setConnectionState(value: ConnectionState): Self = this.set("connectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionState: Self = this.set("connectionState", js.undefined)
    @scala.inline
    def setHasLogicalRedundancy(value: HasLogicalRedundancy): Self = this.set("hasLogicalRedundancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLogicalRedundancy: Self = this.set("hasLogicalRedundancy", js.undefined)
    @scala.inline
    def setJumboFrameCapable(value: JumboFrameCapable): Self = this.set("jumboFrameCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumboFrameCapable: Self = this.set("jumboFrameCapable", js.undefined)
    @scala.inline
    def setLagId(value: LagId): Self = this.set("lagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagId: Self = this.set("lagId", js.undefined)
    @scala.inline
    def setLoaIssueTime(value: LoaIssueTime): Self = this.set("loaIssueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaIssueTime: Self = this.set("loaIssueTime", js.undefined)
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    @scala.inline
    def setPartnerName(value: PartnerName): Self = this.set("partnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerName: Self = this.set("partnerName", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("providerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVlan(value: VLAN): Self = this.set("vlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVlan: Self = this.set("vlan", js.undefined)
  }
  
}

