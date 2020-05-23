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
  def apply(
    allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined,
    awsDevice: AwsDevice = null,
    awsDeviceV2: AwsDeviceV2 = null,
    connections: ConnectionList = null,
    connectionsBandwidth: Bandwidth = null,
    hasLogicalRedundancy: HasLogicalRedundancy = null,
    jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
    lagId: LagId = null,
    lagName: LagName = null,
    lagState: LagState = null,
    location: LocationCode = null,
    minimumLinks: js.UndefOr[Count] = js.undefined,
    numberOfConnections: js.UndefOr[Count] = js.undefined,
    ownerAccount: OwnerAccount = null,
    providerName: ProviderName = null,
    region: Region = null,
    tags: TagList = null
  ): Lag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsHostedConnections)) __obj.updateDynamic("allowsHostedConnections")(allowsHostedConnections.get.asInstanceOf[js.Any])
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (connectionsBandwidth != null) __obj.updateDynamic("connectionsBandwidth")(connectionsBandwidth.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.get.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    if (lagName != null) __obj.updateDynamic("lagName")(lagName.asInstanceOf[js.Any])
    if (lagState != null) __obj.updateDynamic("lagState")(lagState.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLinks)) __obj.updateDynamic("minimumLinks")(minimumLinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfConnections)) __obj.updateDynamic("numberOfConnections")(numberOfConnections.get.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lag]
  }
}

