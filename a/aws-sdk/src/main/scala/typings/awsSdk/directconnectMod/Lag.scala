package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lag extends js.Object {
  /**
    * Indicates whether the LAG can host other connections.
    */
  var allowsHostedConnections: js.UndefOr[BooleanFlag] = js.native
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.native
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The connections bundled by the LAG.
    */
  var connections: js.UndefOr[ConnectionList] = js.native
  /**
    * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: js.UndefOr[Bandwidth] = js.native
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
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
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.native
  /**
    * The state of the LAG. The following are the possible values:    requested: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization (LOA) is available.    pending: The LAG has been approved and is being initialized.    available: The network link is established and the LAG is ready for use.    down: The network link is down.    deleting: The LAG is being deleted.    deleted: The LAG is deleted.    unknown: The state of the LAG is not available.  
    */
  var lagState: js.UndefOr[LagState] = js.native
  /**
    * The location of the LAG.
    */
  var location: js.UndefOr[LocationCode] = js.native
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.native
  /**
    * The number of physical connections bundled by the LAG, up to a maximum of 10.
    */
  var numberOfConnections: js.UndefOr[Count] = js.native
  /**
    * The ID of the AWS account that owns the LAG.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Lag {
  @scala.inline
  def apply(): Lag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lag]
  }
  @scala.inline
  implicit class LagOps[Self <: Lag] (val x: Self) extends AnyVal {
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
    def setAllowsHostedConnections(value: BooleanFlag): Self = this.set("allowsHostedConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowsHostedConnections: Self = this.set("allowsHostedConnections", js.undefined)
    @scala.inline
    def setAwsDevice(value: AwsDevice): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = this.set("awsDeviceV2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDeviceV2: Self = this.set("awsDeviceV2", js.undefined)
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: ConnectionList): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setConnectionsBandwidth(value: Bandwidth): Self = this.set("connectionsBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionsBandwidth: Self = this.set("connectionsBandwidth", js.undefined)
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
    def setLagName(value: LagName): Self = this.set("lagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagName: Self = this.set("lagName", js.undefined)
    @scala.inline
    def setLagState(value: LagState): Self = this.set("lagState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagState: Self = this.set("lagState", js.undefined)
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMinimumLinks(value: Count): Self = this.set("minimumLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumLinks: Self = this.set("minimumLinks", js.undefined)
    @scala.inline
    def setNumberOfConnections(value: Count): Self = this.set("numberOfConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfConnections: Self = this.set("numberOfConnections", js.undefined)
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
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
  }
  
}

