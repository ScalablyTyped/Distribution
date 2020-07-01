package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBgpFailoverTestRequest extends js.Object {
  /**
    * The BGP peers to place in the DOWN state.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  /**
    * The time in minutes that the virtual interface failover test will last. Maximum value: 180 minutes (3 hours). Default: 180 minutes (3 hours).
    */
  var testDurationInMinutes: js.UndefOr[TestDuration] = js.native
  /**
    * The ID of the virtual interface you want to test.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object StartBgpFailoverTestRequest {
  @scala.inline
  def apply(
    virtualInterfaceId: VirtualInterfaceId,
    bgpPeers: BGPPeerIdList = null,
    testDurationInMinutes: js.UndefOr[TestDuration] = js.undefined
  ): StartBgpFailoverTestRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers.asInstanceOf[js.Any])
    if (!js.isUndefined(testDurationInMinutes)) __obj.updateDynamic("testDurationInMinutes")(testDurationInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBgpFailoverTestRequest]
  }
}

