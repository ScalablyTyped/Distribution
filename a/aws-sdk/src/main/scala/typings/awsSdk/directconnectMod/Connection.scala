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
  def apply(
    awsDevice: AwsDevice = null,
    awsDeviceV2: AwsDeviceV2 = null,
    bandwidth: Bandwidth = null,
    connectionId: ConnectionId = null,
    connectionName: ConnectionName = null,
    connectionState: ConnectionState = null,
    hasLogicalRedundancy: HasLogicalRedundancy = null,
    jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
    lagId: LagId = null,
    loaIssueTime: LoaIssueTime = null,
    location: LocationCode = null,
    ownerAccount: OwnerAccount = null,
    partnerName: PartnerName = null,
    providerName: ProviderName = null,
    region: Region = null,
    tags: TagList = null,
    vlan: js.UndefOr[VLAN] = js.undefined
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (connectionState != null) __obj.updateDynamic("connectionState")(connectionState.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.get.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    if (loaIssueTime != null) __obj.updateDynamic("loaIssueTime")(loaIssueTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (partnerName != null) __obj.updateDynamic("partnerName")(partnerName.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(vlan)) __obj.updateDynamic("vlan")(vlan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

