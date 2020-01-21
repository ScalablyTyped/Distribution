package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interconnect extends js.Object {
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
    * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
  /**
    * The name of the interconnect.
    */
  var interconnectName: js.UndefOr[InterconnectName] = js.native
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.native
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
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Interconnect {
  @scala.inline
  def apply(
    awsDevice: AwsDevice = null,
    awsDeviceV2: AwsDeviceV2 = null,
    bandwidth: Bandwidth = null,
    hasLogicalRedundancy: HasLogicalRedundancy = null,
    interconnectId: InterconnectId = null,
    interconnectName: InterconnectName = null,
    interconnectState: InterconnectState = null,
    jumboFrameCapable: js.UndefOr[Boolean] = js.undefined,
    lagId: LagId = null,
    loaIssueTime: LoaIssueTime = null,
    location: LocationCode = null,
    providerName: ProviderName = null,
    region: Region = null,
    tags: TagList = null
  ): Interconnect = {
    val __obj = js.Dynamic.literal()
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (interconnectId != null) __obj.updateDynamic("interconnectId")(interconnectId.asInstanceOf[js.Any])
    if (interconnectName != null) __obj.updateDynamic("interconnectName")(interconnectName.asInstanceOf[js.Any])
    if (interconnectState != null) __obj.updateDynamic("interconnectState")(interconnectState.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    if (loaIssueTime != null) __obj.updateDynamic("loaIssueTime")(loaIssueTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interconnect]
  }
}

