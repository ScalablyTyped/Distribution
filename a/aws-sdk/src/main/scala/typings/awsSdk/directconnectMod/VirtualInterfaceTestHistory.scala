package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualInterfaceTestHistory extends js.Object {
  /**
    * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  /**
    * The time that the virtual interface moves out of the DOWN state.
    */
  var endTime: js.UndefOr[EndTime] = js.native
  /**
    * The owner ID of the tested virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The time that the virtual interface moves to the DOWN state.
    */
  var startTime: js.UndefOr[StartTime] = js.native
  /**
    * The status of the virtual interface failover test.
    */
  var status: js.UndefOr[FailureTestHistoryStatus] = js.native
  /**
    * The time that the virtual interface failover test ran in minutes.
    */
  var testDurationInMinutes: js.UndefOr[TestDuration] = js.native
  /**
    * The ID of the virtual interface failover test.
    */
  var testId: js.UndefOr[TestId] = js.native
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}

object VirtualInterfaceTestHistory {
  @scala.inline
  def apply(
    bgpPeers: BGPPeerIdList = null,
    endTime: EndTime = null,
    ownerAccount: OwnerAccount = null,
    startTime: StartTime = null,
    status: FailureTestHistoryStatus = null,
    testDurationInMinutes: js.UndefOr[TestDuration] = js.undefined,
    testId: TestId = null,
    virtualInterfaceId: VirtualInterfaceId = null
  ): VirtualInterfaceTestHistory = {
    val __obj = js.Dynamic.literal()
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(testDurationInMinutes)) __obj.updateDynamic("testDurationInMinutes")(testDurationInMinutes.get.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualInterfaceTestHistory]
  }
}

